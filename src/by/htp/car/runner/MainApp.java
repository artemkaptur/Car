package by.htp.car.runner;

import by.htp.car.model.Car;
import by.htp.car.model.Driver;

public class MainApp {

	public static void main(String[] args) {

		Driver driver = new Driver("Tom"); // Create out driver Tom
		Car car = driver.buyCar(); // Call method buyCar, there create the object of class Car
		driver.getStatus(car); // Output status of our object car

		driver.replenishFuel(car); // Replenish full tank of our car
		driver.drive(car);  // During driving increase our mileage and decrease fuel's level
		driver.getStatus(car);

		driver.replaceWheel(car); // Replace any wheel with new ones with new color and diameter
		driver.getStatus(car);

	}

}
