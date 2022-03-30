package b.shool;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// create School object
		School school = new School();
		// set the teacher
		school.setTeacher(new Teacher(111, "Eldar", "Java"));
		// add some students
		school.addStudent(new Student(101, "Noa", 80));
		school.addStudent(new Student(102, "Yuval", 100));
		school.addStudent(new Student(103, "Nizan", 60));

		// print the teacher details
		System.out.println(school.getTeacher());
		// print the list of students
		school.printAllStudents();

		// print student details by id
		Scanner sc = new Scanner(System.in);
		System.out.print("enter student id: ");
		int studentId = sc.nextInt(); // get student id from user
		sc.close();

		try { // try to find the student
			Student student = school.getStudentById(studentId);
			System.out.println(student);
		} catch (RuntimeException e) { // if not found print the error message
			System.out.println(e.getMessage());
		}

	}
}
