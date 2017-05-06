package polymorphism;
//abstarct car class prog 
abstract class car {
	abstract void start();

	abstract void moves();

	abstract void stop();
}

class Audi extends car {
	void start() {
		System.out.println("audi start");
	}

	void moves() {
		System.out.println("audi moves");
	}

	void stop() {
		System.out.println("audi stop");
	}
}

class BMW extends car {
	void start() {
		System.out.println("bmw start");
	}

	void moves() {
		System.out.println("bmw moves");
	}

	void stop() {
		System.out.println("bmw stop");
	}
}

class Driver {
	void drive(car c) {
		c.start();
		c.moves();
		c.stop();
	}
}

public class Testclass2 {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new BMW());
		d.drive(new Audi());
	
	}

}