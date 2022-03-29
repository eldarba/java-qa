package e.flow.control;

import java.util.Scanner;

public class Demo4WhileLoop {

	public static void main(String[] args) {
		
		int secretPassword = 123;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter password");
		int input = sc.nextInt();
		
		while(input != secretPassword) {
			System.out.println("enter password");
			input = sc.nextInt();
		}
		sc.close();
		
		System.out.println("you are logged in");
		
		
		

	}

}
