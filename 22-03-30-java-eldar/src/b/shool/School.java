package b.shool;

public class School {

	// school has one teacher
	private Teacher teacher;

	// school has up to 100 students
	private Student[] students = new Student[100];

	private int index; // automatically initialized to 0

	// get the teacher
	public Teacher getTeacher() {
		return teacher;
	}

	// set the teacher
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// add a student to school
	public void addStudent(Student student) {
		this.students[index] = student;
		index++;
	}

	// get one student by id
	public Student getStudentById(int studentId) {
		for (int i = 0; i < students.length; i++) {
			Student st = students[i];
			if (st != null && st.getId() == studentId) {
				return st;
			}
		}
		// if we are here - the student was not found
		throw new RuntimeException("getStudentById faild - not found id: " + studentId);
	}

	// show a list of all students
	public void printAllStudents() {
		System.out.println("List of Students ====================");
		// we can use for-each loop if we dont need the index
		for (Student student : students) {
			if(student != null) {
				System.out.println(student);
			}
		}
		System.out.println("================ ====================");
	}

}
