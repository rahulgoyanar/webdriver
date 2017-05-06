package polymorphism;

// downcasting prog
class X {
	void main1() {
		System.out.println("m1");
	}
}

class Y extends X {
	void main2() {
		System.out.println("m2");
	}
}

class Z extends X {
	void main3() {
		System.out.println("m3");
	}
}

public class Testclass4 {
	public static void main(String[] args) {
		X a = new Y();
		a.main1();
		// a.main2();
		// a.main3();
		Y b = (Y) a;
		b.main2();
		((Z) a).main3();

	}
}
