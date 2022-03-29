package e.flow.control;

public class Demo9Tar {

	public static void main(String[] args) {
		// tar 1
		System.out.println("===Tar 1");
		{
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + ", ");
			}
			System.out.println(); // new line
		}

		System.out.println("===Tar 2");
		// tar 2
		{
			for (int i = 100; i <= 125; i += 2) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}

		System.out.println("===Tar 3");
		// tar 3
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + ", ");
			}
			System.out.println(); // new line
		}

		System.out.println("===Tar 4 multiplication table");
		// tar 4
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

	}

}
