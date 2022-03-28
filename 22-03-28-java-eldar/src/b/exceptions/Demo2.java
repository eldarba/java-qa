package b.exceptions;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b = sc.nextInt();
		int res = div(a, b);
		System.out.println(a + " : " + b + " = " + res);
		sc.close();

	}

	public static int div(int a, int b) {
		if (b != 0) {
			return a / b; 
		}else {
			// create an exception object and throw it
			RuntimeException e = new RuntimeException("Error - divide by 0");
			throw e;
		}
	}

}
