package com.anil;

class Car {
	int regno;

	Car(int r) 
	{
		regno = r;
	}

	void start() {
		System.out.println(regno + "car start");
	}

	void moves() {
		System.out.println(regno + "car moves");
	}

	void stop() {
		System.out.println(regno + "car stop");
	}
}

class Driver {
	String name;

	Driver(String n) {
		name = n;
	}

void drive(Car c) {
		c.start();
		c.moves();
		c.stop();
	}
}

public class Testclass3 {

	public static void main(String[] args) {
		Car c1 = new Car(101);
		Car c2 = new Car(202);
		Car c3 = new Car(303);
		Driver d = new Driver("james bond");
		d.drive(c2);
		d.drive(c3);
		d.drive(c1);
	}
}
