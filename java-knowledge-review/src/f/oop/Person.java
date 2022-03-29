package f.oop;

public class Person {
	
	protected int id;
	protected String name;
	protected int age;
	
	// ()
	public Person() {
		
	}
	// (id)
	public Person(int id) {
		this.id = id;
	}
	
	// (id, name, age)
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	

}
