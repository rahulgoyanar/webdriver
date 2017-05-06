package inheritance;

//binding:early and late
class superclass {
	String m1() {
		return "a";
	}

	static String m2() {
		return "b";
	}

}

class subclass extends superclass {
	String m1() {
		return "c";
	}

	static String m2() {
		return "d";
	}

}

class Testclass7 {
	public static void main(String[] args) {
		superclass obj = new superclass();
		System.out.println(obj.m1() + obj.m2());
		obj = new subclass();
		System.out.println(obj.m1() + obj.m2());
		K a1 = new L();
		a1.test1();
		a1 = new M();
		a1.test1();
	}
}