package d.shapes;

public class Test {

	public static void main(String[] args) {
		
		// OOP Principles
		
		// 1. encapsulation 
		// 2. inheritance
		// 3. polymorphism 
		
		// declare a reference of type Shape
		Shape shape;

		// point to an object of type Rectangle
		shape = new Rectangle("red", 4, 8);
		System.out.println(shape);
		System.out.println("Area: " + shape.getArea());

		// point to an object of type Circle
		shape = new Circle("yellow", 2.3);
		System.out.println(shape);
		System.out.println("Area: " + shape.getArea());

	} 

}
