package b.exceptions;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		String[] names = {"aaa", "bbb", "ccc", "ddd", "eee"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter index: ");
		int index = sc.nextInt();
		sc.close();
		
		System.out.println("name is: " + names[index]);

	}

}
