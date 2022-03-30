package b.shool;

public class Student extends Person {

	private int grade;

	public Student() {
	}

	public Student(int id, String name, int grade) {
		super(id, name);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" +

				grade + ", id=" + getId() +

				", name=" + getName() + "]";
	}

}
