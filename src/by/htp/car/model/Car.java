package by.htp.car.model;

public class Car {

	public String make;
	public String color;
	public int weight;
	public int tankSize;
	public int tankStatus;
	public int fuelConsumption;
	public int countWheels;
	public Engine engine;
	public Wheel[] wheel;
	
	// Default constructor
	public Car() {
	}; 

	// Constructor with parameters
	public Car(String make, String color, Engine engine, Wheel[] wheel) {
		this.make = make;
		this.color = color;
		this.engine = engine;
		this.wheel = wheel;
		this.countWheels = 4;

		// Depending on the make of car initialize weight, size of tank and fuel consumption
		switch (make) {
		case "BMW":
			weight = 1500;
			tankSize = 70;
			fuelConsumption = 13;
			break;
		case "Mazda":
			weight = 1350;
			tankSize = 60;
			fuelConsumption = 14;
			break;
		case "Ford":
			weight = 1550;
			tankSize = 75;
			fuelConsumption = 15;
			break;
		case "Jaguar":
			weight = 1450;
			tankSize = 65;
			fuelConsumption = 12;
			break;
		}

	};

}
