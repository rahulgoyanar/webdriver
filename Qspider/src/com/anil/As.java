package com.anil;

class Z {

	Z() {

		this(0);
		System.out.println("Hi ");

	}

	Z(int x) {

		this(0,0,0);
		System.out.println("Hello");

	}

	Z(int x, int y) {
		System.out.println("How are you");

	}

	Z (int x, int y, int z) {
		this(0,0);
		System.out.println("I AM FINE");

	}
}

class As {
	public static void main(String[] args) {

		Z ob = new Z();
	}
}
