package a.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// create an array of 5 int elements
		int[] arr1 = new int[5];
		// populate array with data
		arr1[0] = 7;
		arr1[1] = 3;
		arr1[2] = 9;
		arr1[3] = 2;
		arr1[4] = 12;
		// access array elements (for printing)
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		// print the array as String
		System.out.println(Arrays.toString(arr1));

	}
}
