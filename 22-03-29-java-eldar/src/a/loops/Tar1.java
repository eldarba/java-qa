package a.loops;

public class Tar1 {

	/*
	 * Create a class that defines a random number (0-25) and prints all numbers
	 * from 1 to that number
	 */
	public static void main(String[] args) {

		// 1. create the random number
		int r = (int) (Math.random() * 26);

		// 2. print it
		System.out.println(r);
		System.out.println("============");

		// 3. print all numbers from 0 to the random number (using loop)
		for (int i = 0; i <= r; i++) {
			System.out.println(i);
		}

	} 

}
