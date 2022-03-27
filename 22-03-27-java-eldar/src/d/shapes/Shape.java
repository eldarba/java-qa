package d.shapes;

// abstract class cannot be instantiated
public abstract class Shape {

	// fields
	private String color;

	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// an abstract method (only in abstract class)
	public abstract double getArea();

}
