package inheritance;

class A {
	 void m1() {
		System.out.println("m1 in A");
	}
}

class B extends A {
	 void m1() {
		System.out.println("m1 in B");
	}
}

class Testclass1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
		B b1 = new B();
		b1.m1();
		
	}
}
