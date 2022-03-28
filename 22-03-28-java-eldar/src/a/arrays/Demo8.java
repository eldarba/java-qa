package a.arrays;

import java.util.Arrays;

public class Demo8 {

	// 1. create an array of 10 numbers 0 - 10
	// 2. print the array
	// 3. reverse the elements order in the array
	// 4. print the array again
	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int a = arr[i];
			int b = arr[j];
			arr[j] = a;
			arr[i] = b;
		}
		System.out.println(Arrays.toString(arr));

	}

}
