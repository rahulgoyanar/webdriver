//binding:late
package inheritance;
class K {
	void test1() {
		System.out.println("test1()in class k");

	}
}
class L extends K {
	void test1() {
		System.out.println("test1()in class L");

	}
}
class M extends K {
	void test1() {
		System.out.println("test1()in class M");

	}
}
class Testclass6 {
	public static void main(String[] args) {
		K a1 = new L();
		a1.test1();
		a1 = new M();
		a1.test1();
	}
}
