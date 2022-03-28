package b.exceptions;

public class Demo3 {

	public static void main(String[] args)  {
		try {
			f1();
		} catch (Exception e) {
			System.out.println("error");
		}
		System.out.println("END");

	}

	public static void f1() throws RuntimeException {
		f2();
	}

	public static void f2() throws RuntimeException {
		f3();
	}

	public static void f3() throws RuntimeException {
		throw new RuntimeException("error");
	}

}
