package a.tar.loop;

public class Tar1 {

	/*
	 * defines two random values (0 - 100) and print all values between them.
	 * 
	 * note - which variable holds the higher value is not known.
	 * 
	 * 2, 5 - 2 3 4 5
	 * 
	 * 6, 3 - 3 4 5 6 [OR 6 5 4 3]
	 * 
	 */
	public static void main(String[] args) {

		// 1. create 2 random numbers - a and b (range 0 - 100)
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		// 2. print them
		System.out.println(a + ", " + b);
		// 3. print all numbers between them

		// option 1 - from the lowest to highest
		// make sure a is lower
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		

		for (int i = a; i <= b; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

	}

}
