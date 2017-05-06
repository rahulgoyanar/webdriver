package com.anil;

class E {
	E() {
		System.out.println("default ctt");
	}

	E(int i) {
		this();
		System.out.println("parametrized ctt");
	}
}

class Testclass8 {
	public static void main(String[] args) {
		new E();
		new E(10);
	}
}
