package b.shool;

public class Person {

	private int id;
	private String name;

	// 1. add constructors
	public Person() {
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// 2. add getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 3. add toString
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
