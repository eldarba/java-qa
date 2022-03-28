package a.arrays;

public class Demo3CreateRandomNumbers {

	public static void main(String[] args) {

		int x;
		
		// random number 0 - 10
		x = (int) (Math.random() * 11);
		System.out.println(x);

		// random number 0 - 100
		x = (int) (Math.random() * 101);
		System.out.println(x);

	}

} 
