package e.flow.control;

import java.util.Scanner;

public class Demo5WhileLoop {

	public static void main(String[] args) {
		
		int secretPassword = 123;
		int maxTrials = 3;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter password");
		int input = sc.nextInt();
		int trials = 1;
		
		while(input != secretPassword && trials < maxTrials) {
			System.out.println("enter password");
			input = sc.nextInt();
			trials++;
		}
		sc.close();
		
		if(input == secretPassword) {
			System.out.println("you are logged in");
		}else {
			System.out.println("login failed");
			throw new RuntimeException("login failed");
		}
		
		
		
		

	}

}
