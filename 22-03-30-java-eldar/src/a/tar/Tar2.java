package a.tar;

public class Tar2 {

	/*
	 * Create a new class that defines a random number with a value between 0-100.
	 * 
	 * if the number is greater than 50 – print “Big !”
	 * 
	 * if the number is less then 50 – print “Small !”
	 * 
	 * if the number equals to 50 – print “Bingo !”
	 */
	public static void main(String[] args) {

		int r = (int) (Math.random() * 101);
		r = 93;
		System.out.println(r);

		if (r < 50) {
			System.out.println("small");
		} else if (r > 50) {
			System.out.println("big");
		} else {
			System.out.println("bingo");
		}

	}

}
