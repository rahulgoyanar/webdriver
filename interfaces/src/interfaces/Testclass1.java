package interfaces;

interface Bike {
	void start();

}

class Pulser implements Bike {
	public void start() {
		System.out.println("pulser start");
	}
}

public class Testclass1 {

	public static void main(String[] args) {
		Bike b1 = new Pulser();
		b1.start();

	}

}
