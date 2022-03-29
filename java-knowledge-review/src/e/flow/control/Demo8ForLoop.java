package e.flow.control;

import java.util.Scanner;

public class Demo8ForLoop {

	public static void main(String[] args) {
		
		// get a number from user and draw a line of *
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length: ");
		int length = sc.nextInt();
		sc.close();

		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		
		System.out.println();

	}

}
