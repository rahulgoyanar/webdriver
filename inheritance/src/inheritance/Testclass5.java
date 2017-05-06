
//binding:early
package inheritance;

class X {
	static void test1() {
		System.out.println("test1()in class x");

	}
}

class Y extends X {
	static void test1() {
		System.out.println("test1()in class y");

	}
}

class Z extends X {
	static void test1() {
		System.out.println("test1()in class Z");

	}
}

class Testclass5 {
	public static void main(String[] args) {
		X a1 = new Y();
		a1.test1();
		a1 = new Z();
		a1.test1();
	}
}
