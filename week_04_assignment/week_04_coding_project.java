package week_04_assigment;

import java.util.Arrays;

public class week_04_coding_project {

	public static void main(String[] args) {
		/*	1. Create an array of int called ages that contains the following 
			values: 3, 9, 23, 64, 2, 8, 28, 93.

			a. Programmatically subtract the value of the first element in the 
			array from the value in the last element of the array 
			(i.e. do not use ages[7] in your code). Print the result to the console.  
 		*/		
		//	Created an int array with eight elements 
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//	assigned the first array element to the int variable "firstElement"
		int firstElement = ages[0];
		
		//	assigned the last array element to the int variable "lastElement"
		int lastElement = ages[ages.length -1];
		
		//	subtracted firstElement from lastElement within the println statement
		System.out.println(firstElement - lastElement);
		
		/*	b. Create a new array with 9 elements (one more than the ages array)  
			Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
 		*/
		
		int[] newAges = {8, 10, 13, 7, 35, 59, 23, 54, 75};
		
		firstElement = newAges[0];
		lastElement = newAges[newAges.length -1];
		
		System.out.println(firstElement - lastElement);
		/*	c. Use a loop to iterate through the array and calculate the 
			average age. Print the result to the console.
 		*/		
		int sumAges = 0;
		int result = 0;
		
		for (int i = 0; i < newAges.length; i++) {
			
			sumAges += newAges[i];
			
			result = sumAges / newAges.length;
		}
		System.out.println(result);
		/*	2. Create an array of String called names that contains the following 
		values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

			a. Use a loop to iterate through the array and calculate the average 
			number of letters per name. Print the result to the console.
 		*/		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int sumNames = 0;
		int avgLetters = 0;
		
		for (String n : names) {
			
			sumNames += n.length();
			
			avgLetters = sumNames / names.length;
		}
		System.out.println(avgLetters);
		/*	b. Use a loop to iterate through the array again and concatenate 
			all the names together, separated by spaces, and print the result 
			to the console.
 		*/		
		String together = "";
		for (int i = 0; i < names.length; i++) {
			
			together += names[i] + " ";
		}
		System.out.println(together);
	
		//	3. How do you access the last element of any array?
		//		ANSWER: by using the array index arrayName.length - 1
	
		//	4. How do you access the first element of any array?
		//		ANSWER: by using the index 0. For example: arrayName[0] 
	
		/*	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		 	and add the length of each name to the nameLengths array.
		*/
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		// I had an incredibly hard time trying to print the new array to console. Until i found Arrays.toString
		System.out.println(Arrays.toString(nameLengths)); 

		
		/*	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
			Print the result to the console.
		*/
		int sumResult = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumResult += nameLengths[i];
		}
		System.out.println(sumResult);
		
//console output code for question #9 
		int[] myArray = {1, 40, 20, 50};
		boolean answer = hot100(myArray);
		System.out.println(answer);
		
//console output code for question #10
		double[] doubleArray = {1, 40, 20, 50};
		System.out.println(avgDouble(doubleArray));
		
//console output code for question #11
		double[] a = {1.5, 1.5, 4.5, 2.5};
		double[] b = {2.5, 1.5, 2.5, 4.5};
		System.out.println(compareDoubles(a,b));
		
//console output code for question #12
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
//console output code for question #13
		int hoursWorked = 81;
		int weeksWorked = 2;
		System.out.println(overTime(hoursWorked, weeksWorked));
		
	}
		/*	7. Write a method that takes a String, word, and an int, n, 
			as arguments and returns the word concatenated to itself n number of times. 
			(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		*/
	public static String wordPlay(String word, int n) {
		
			return word.repeat(n);
		}

		/*	8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
			(the full name should be the first and the last name as a String separated by a space).
		*/
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
		/*	9. Write a method that takes an array of int and returns true if the sum of all 
			the ints in the array is greater than 100.
		*/
	public static boolean hot100(int[] myArray) {
		
		int result = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			result += myArray[i];
		}
		
		if (result < 100) {
			return false;
		}
		
		return true;
		
	}
	
		//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double avgDouble(double[] myDouble) {
		
		double sumDouble = 0;
		
		for (int i = 0; i < myDouble.length; i++) {
			sumDouble += myDouble[i];
		}
		
		double result = myDouble.length / sumDouble;
		
		return result;
	}
		/*	11. Write a method that takes two arrays of double and returns true if the average of the elements in 
			the first array is greater than the average of the elements in the second array.
		*/
	public static boolean compareDoubles(double[] a, double[] b) {
		double sumFirstArray = 0;
		double sumSecondArray = 0;
		
		for (int i = 0; i < a.length; i++) {
			sumFirstArray += a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			sumSecondArray += b[i];
		}
		
		if ((sumSecondArray / b.length) < (sumFirstArray / a.length)) {
			return true;
		}
		return false;
	}
		/*	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
			and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		*/
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
		/*	13. Create a method of your own that solves a problem. In comments, write what the method does and 
			why you created it.
		*/
	public static boolean overTime(int hoursWorked, int weeksWorked) {
		
		if (hoursWorked > 80 && weeksWorked <= 2) {
			return true;
		}
		return false;
		
	}
}