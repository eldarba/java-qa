package a.arrays;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {

		int[] arr = new int[20];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 26);
			arr[i] = r;
			sum = sum + arr[i]; // add current element to sum
		}
		
		double avg = (double)sum / arr.length;

		System.out.println(Arrays.toString(arr));
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
