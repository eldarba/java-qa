package b.exceptions;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		// set the age of this person object
		try {
			p.setAge(20);
			System.out.println(p.getAge());
		}catch(Exception e) {
			// plan B
			System.out.println("Error");
		}
		
		System.out.println("END");

	}

}
 