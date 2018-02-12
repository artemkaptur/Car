package by.htp.car.model;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public String name;

	public Driver() {
	};

	public Driver(String name) {
		this.name = name;
	};

	// Output to the console all our fields of object car
	public void getStatus(Car car) {
		System.out.println("This car:\nMake - " + car.make);
		System.out.println("Color - " + car.color);
		System.out.println("Engine - " + car.engine.power + " h.p., " + car.engine.mileage + " km mileage");
		System.out.println("Fuel consumption - " + car.fuelConsumption + " l per 100km");
		System.out.println(car.countWheels + " Wheels:");
		for (int i = 0; i < car.countWheels; i++) {
			System.out.println((i + 1) + " wheel - " + car.wheel[i].diam + "cm " + car.wheel[i].color);
		}
		System.out.println("Weight - " + car.weight + " kg");
		System.out.println("Volume of tank - " + car.tankSize + " liters");
		System.out.println("Gasoline's level - " + car.tankStatus + " l");

	}

	public void replaceWheel(Car car) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose number of wheel, which you wanna change ");
		int i = sc.nextInt(); // Input from the console number of replacing wheel
		System.out.println("Choose diam of your new wheel ");
		int x = sc.nextInt(); // Input from the console new diameter
		System.out.println("Choose color of your new wheel");
		String s = sc.next(); // Input from the console new color
		car.wheel[i - 1].diam = x;
		car.wheel[i - 1].color = s;
	}

	// Replenish fuel to full tank
	public void replenishFuel(Car car) {
		car.tankStatus = car.tankSize;
	}

	public void drive(Car car) {
		System.out.println("Type speed and time of trip");
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt(); // Enter speed of our driving
		int time = sc.nextInt();// Enter time of our driving
		// Check "Do we have gasoline or not?"
		if (car.tankStatus > 0) {
			// If fuel's level is enough to hole trip - we will increase our mileage and calculate new fuel level
			// else we'll drive as much as we can and then ask for more fuel
			if (car.tankStatus * (100 / car.fuelConsumption) > speed * time) {
				car.engine.mileage += speed * time;
				car.tankStatus -= car.fuelConsumption / 100.0 * speed * time;
			} else {
				car.engine.mileage += (100 / car.fuelConsumption * car.tankStatus);
				car.tankStatus = 0;
				System.out.println("You should repenish your fuel");
			}
		} else
			System.out.println("You should repenish your fuel");
	}

	public Car buyCar() {
 
		// User pick his configurations of car and then we create object Car with these configurations
		String make = chooseMake();
		String color = chooseColor();
		Engine engine = chooseEngine();
		Wheel wheels[] = chooseWheels();

		Car car = new Car(make, color, engine, wheels);

		return car;

	}

	public String chooseMake() {
		String[] arr = new String[] { "BMW", "Mazda", "Ford", "Jaguar" };
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			System.out.println("Choose make of car from these variants " + Arrays.toString(arr));
			s = sc.next();
		} // Check validation of typed info
		while ((!s.equals(arr[0])) && (!s.equals(arr[1])) && (!s.equals(arr[2])) && (!s.equals(arr[3])));
		return s;
	}

	public String chooseColor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose color of your car");
		String s = sc.next();
		return s;
	}

	public Engine chooseEngine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose power of your engine ");
		int x = sc.nextInt();
		Engine engine = new Engine(x);
		return engine;
	}

	public Wheel[] chooseWheels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose diam of your wheels ");
		int x = sc.nextInt();
		System.out.println("Choose color of your wheels");
		String s = sc.next();
		Wheel wheels[] = new Wheel[4];
		for (int i = 0; i < 4; i++) {
			wheels[i] = new Wheel(x, s);
		}
		return wheels;
	}

}
