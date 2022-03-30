package a.tar.loop;

public class Tar1Opt2 {

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
		int a = (int) (Math.random() * 21);
		int b = (int) (Math.random() * 21);
		// 2. print them
		System.out.println(a + ", " + b);
		// 3. print all numbers between them

		// option 2 - from the first to the second
		// define a variable for increment
		
		int step = 1;
		if(a > b) {
			step = -1;
		}
		
		// 5   2   step = -1

		for (int i = a; i != b; i += step) {
			System.out.print(i + ", ");
		}
		System.out.println(b);

	}

}
