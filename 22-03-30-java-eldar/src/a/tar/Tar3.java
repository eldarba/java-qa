package a.tar;

public class Tar3 {

	/*
	 * Create a random number with a value between 0-100.
	 * 
	 * if the value is between 0-50 – print “Small !”
	 * 
	 * else – print “Big !”
	 * 
	 * in addition : if the value is even (can be divided by 2) – print “Even”
	 * 
	 * else – print “Odd”
	 */
	public static void main(String[] args) {
		// 1. create random number
		int x = (int) (Math.random() * 101);
		// 2. print it
		System.out.println(x);
		// 3. check if big or small and print the answer
		if (x < 50) {
			System.out.println("the number is small");
		} else {
			System.out.println("the number is big");
		}
		// 4. check if odd or even and print the answer
		if (x % 2 == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");
		}
	}

}
