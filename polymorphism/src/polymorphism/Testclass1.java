package polymorphism;
//basic abstract class
import java.nio.charset.MalformedInputException;

abstract class A {
	void m1() {
		System.out.println("m1 in class A");
	}

	abstract void m2();
}

class B extends A {
	void m2() {
		System.out.println("m2 in class B");
	}
}

public class Testclass1 {
	public static void main(String[] args) {
		A a1 = new B();
		a1.m1();
		a1.m2();

	}
}
//hi anil github
//hi rahul
//hii 125654961616
