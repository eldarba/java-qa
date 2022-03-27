package b;

public class PersonTest {

	public static void main(String[] args) {

		// create a Person object
		Person p1 = new Person();
		
		// set the state
		p1.setId(101);
		p1.setName("Dan");
		p1.setAge(25);
		
		// print the state
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		// ctors
		Person p2 = new Person(102, "Noa", 33);
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		// print the object using toString method
		System.out.println(p2);


	}

}
