package c.points;

public class Pixel extends Point {

	private String color;

	public Pixel() {
	}

	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pixel [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

}
