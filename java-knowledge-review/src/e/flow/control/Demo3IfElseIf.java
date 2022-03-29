package e.flow.control;

public class Demo3IfElseIf {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 11); // 0 - 10
		System.out.println("grade is: " + grade);
		// 0 - 5 FAIL
		// 6 - 7 PASS
		// 8 - 9 GOOD
		// 10 - GREAT
		
		if(grade <= 5) {
			System.out.println("FAIL");
		}else if(grade <= 7) {
			System.out.println("PASS");
		}else if(grade <= 9) {
			System.out.println("GOOD");
		}else {
			System.out.println("GREAT");
		}

		

	}

}
