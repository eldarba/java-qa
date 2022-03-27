package c.shapes;

// this class inherits Object
public abstract class Shape {
	
	// fields
	private String color;
	
	// CTOR 1
	public Shape() {
		super();
	}

	// CTOR 2
	public Shape(String color) {
		super();
		this.color = color;
	}

	// methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
