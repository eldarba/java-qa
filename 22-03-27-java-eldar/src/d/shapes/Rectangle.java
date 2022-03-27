package d.shapes;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle() {
		super(); // call CTOR in super class (Shape)
	}

	public Rectangle(String color, double length, double width) {
		super(color); // call CTOR in super class (Shape)
		this.length = length;
		this.width = width;
	}

	@Override 
	public double getArea() {
		return length * width;
	}

	// add toString method
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + getColor() + "]";
	}
	
	

}
