package by.htp.car.model;

public class Engine {

	private int power;
	private double mileage;

	// Default constructor
	public Engine() {
	};

	// Constructor with parameters
	public Engine(int power) {

		this.power = power;
	}

	// Setter and getter methods
	public void setMileage(double mileage) {
		this.mileage = mileage;
	};

	public double getMileage() {
		return mileage;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	};

}
