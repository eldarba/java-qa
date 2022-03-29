package oop;

public class Car {

	private int number;
	private String color;
	private int speed;
	private int km;

	public Car() {
	}

	public Car(int number, String color) {
		super();
		this.number = number;
		this.color = color;
	}

	public Car(int number, String color, int speed) {
		super();
		this.number = number;
		this.color = color;
		this.speed = speed;
	}
	
	public void drive(int distance) {
//		this.km = this.km + distance; // the long form
		this.km += distance; // the short form
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + ", speed=" + speed + ", km=" + km + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	

}
