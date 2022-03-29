package e.flow.control.switchDemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// cases: A, B, C

		Scanner sc = new Scanner(System.in);
		System.out.print("enter case [A, B, C]: ");
		String input = sc.next();
		sc.close();

		switch (input) {
		case "A":
			System.out.println("you entered A");
			break;
		case "B":
			System.out.println("you entered B");
			break;
		case "C":
			System.out.println("you entered C");
			break;
		default:
			System.out.println(input + " is invalid input");
		}

	} 

}
