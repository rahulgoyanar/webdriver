package interfaces;

interface I1 {
	void m1();
}

interface I2 {
	void m2();

}

class B implements I1, I2 {
	public void m1() {
		System.out.println("m1 in B");
	}

	public void m2() {
		System.out.println("m2 in B");
	}
}

public class Testclass2 {
	public static void main(String[] args) {
		I1 a1 = new B();
		a1.m1();
		I2 a2 = new B();
		a2.m2();

	}
}
