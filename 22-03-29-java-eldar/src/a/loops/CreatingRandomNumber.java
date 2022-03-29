package a.loops;

public class CreatingRandomNumber {

	public static void main(String[] args) {

		// we use Math.random() method to create numbers in the range 0 - 0.9999999999
		double r1 = Math.random();
		System.out.println(r1);

		double r2 = Math.random() * 11; // 0 - 10.999999999999
		System.out.println(r2);

		int r3 = (int) (Math.random() * 11); // 0 - 10
		System.out.println(r3);

		int r4 = (int) (Math.random() * 11) + 10; // 10 - 20
		System.out.println(r4);

	}

}
