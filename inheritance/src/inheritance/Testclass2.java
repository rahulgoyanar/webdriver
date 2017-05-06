package inheritance;

 class C {
	int i = 10;
}

class D extends C {
	int i = 20;

	void m1() {
		System.out.println(i);
		System.out.println(super.i);
	}
}

class Testclass2 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.m1();
	}
}
