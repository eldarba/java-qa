package b.shool;

public class Teacher extends Person {

	private String subject;

	// CTOR 1
	public Teacher() {
	}

	// CTOR 2
	public Teacher(int id, String name, String subject) {
		super(id, name); // call ctor in the super class
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	

	@Override
	public String toString() {
		return "Teacher[id=" + getId() + ", name=" + getName() + ", subject=" + subject + "]";
	}

}
