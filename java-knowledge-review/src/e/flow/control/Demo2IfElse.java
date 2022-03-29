package e.flow.control;

public class Demo2IfElse {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11); // 0 - 10
		System.out.println(a);

		if (a > 5) {
			System.out.println("BIG");
			System.out.println("BIG");
			System.out.println("BIG");
		} else {
			System.out.println("SMALL");
			System.out.println("SMALL");
			System.out.println("SMALL");
		}

	}

}
