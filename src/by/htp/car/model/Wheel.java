package by.htp.car.model;

public class Wheel {

	private int diam;
	private String color;

	// Default constructor
	public Wheel() {
	};

	// Constructor with parameters
	public Wheel(int diam, String color) {
		this.diam = diam;
		this.color = color;
	}

	// Setter and getter methods
	public int getDiam() {
		return diam;
	}

	public void setDiam(int diam) {
		this.diam = diam;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	};

}
