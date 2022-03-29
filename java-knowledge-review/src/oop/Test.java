package oop;

public class Test {

	public static void main(String[] args) {
		
		// OBJECTS CREATION
		Car c1 = new Car();
		Car c2 = new Car(111, "Red");
		Car c3 = new Car(111, "Red", 100);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// AFTER OBJECTS CREATION
		// we can change using setters
		c1.setSpeed(25);
		// we can access using getters
		System.out.println(c1);
		
		// using the drive method
		// the k"m will increase
		c1.drive(30);
		c1.drive(50);
		System.out.println(c1);

	}

}
