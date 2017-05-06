package polymorphism;

//claling car class
class carfactory {
	static car getcar(String c) {
		if (c.equals("BMW"))
			return new BMW();

		if (c.equals("Audi"))
			return new Audi();
		return null;
	}
}

public class Testclass3 {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		Driver d = new Driver();
		System.out.println("enter car");
		String carName = scn.next();
		car c = carfactory.getcar(carName);
		d.drive(c);
	}

}
