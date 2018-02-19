package by.htp.car.model;

public class Car {

	private String make;
	private String color;
	private int weight;
	private int tankVolume;
	private double tankStatus;
	private int fuelConsumption;
	private int countWheels;
	private Engine engine;
	private Wheel[] wheels;

	// Default constructor
	public Car() {
	};

	// Constructor with parameters
	public Car(String make, String color, Engine engine, Wheel[] wheels) {
		this.make = make;
		this.color = color;
		this.engine = engine;
		this.wheels = wheels;
		this.countWheels = 4;

		// Depending on the make of car initialize weight, volume of tank and fuel
		// consumption
		switch (make) {
		case "BMW":
			setWeight(1500);
			setTankVolume(70);
			setFuelConsumption(13);
			break;
		case "Mazda":
			setWeight(1350);
			setTankVolume(60);
			setFuelConsumption(14);
			break;
		case "Ford":
			setWeight(1550);
			setTankVolume(75);
			setFuelConsumption(15);
			break;
		case "Jaguar":
			setWeight(1450);
			setTankVolume(65);
			setFuelConsumption(12);
			break;
		}
	}

	// Setter and getter methods
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTankVolume() {
		return tankVolume;
	}

	public void setTankVolume(int tankVolume) {
		this.tankVolume = tankVolume;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public Engine getEngine() {
		return engine;
	}

	public int getCountWheels() {
		return countWheels;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public double getTankStatus() {
		return tankStatus;
	}

	public void setTankStatus(double tankStatus) {
		this.tankStatus = tankStatus;
	}

}
