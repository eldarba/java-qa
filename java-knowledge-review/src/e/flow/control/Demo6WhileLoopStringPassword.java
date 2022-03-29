package e.flow.control;

import java.util.Scanner;

public class Demo6WhileLoopStringPassword {

	public static void main(String[] args) {
		
		String secretPassword = "Admin123";
		Scanner sc = new Scanner(System.in);

		System.out.println("enter password");
		String input = sc.nextLine();
		
		while(! input.equals(secretPassword)) {
			System.out.println("enter password");
			input = sc.nextLine();
		}
		sc.close();
		
		System.out.println("you are logged in");
		
		
		

	}

}
