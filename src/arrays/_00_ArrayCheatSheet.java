package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String stringList[] = { "A, ", "B, ", "Sesame, ", "Lane, ", ", U got pranked u thought it was street" };
		// 2. print the third element in the array
		System.out.println(stringList[2]);
		// 3. set the third element to a different value
		stringList[3] = ", Despacito 2";
		// 4. print the third element again
		System.out.println(stringList[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringList.length; i++) {
			System.out.print(stringList[i] + " ");
		}
		System.out.println("");
		// 6. make an array of 50 integers
		int intList[] = new int[50];
		int smallest = 50;
		int largest = 0;
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < intList.length; i++) {
			Random r = new Random();
			intList[i] = r.nextInt(100);
			if (intList[i] < smallest) {
				smallest = intList[i];
			}

			if (intList[i] > largest) {
				largest = intList[i];
			}
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		System.out.println(smallest);
		System.out.println(largest);
		for (int i = 0; i < intList.length; i++) {
			System.out.print(intList[i] + ", ");
		}
		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
