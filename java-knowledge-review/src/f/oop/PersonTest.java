package f.oop;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person(101);
		Person p3 = new Person(102, "Dov", 32);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
