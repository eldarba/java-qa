package a.arrays;

import java.util.Arrays;

public class Demo3 {

	// create an array of random integers 
	// in the range 0 - 100
	public static void main(String[] args) {
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 101);
			arr[i] = r;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
