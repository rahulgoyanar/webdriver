package com.anil;

class Y {
	static {
		System.out.println("static blk of y");
	}

	{
		System.out.println("nonstatic blk of y");
	}

	Y() {
		System.out.println("ctt of y");
	}
}

class X {
	static {
		new Y();
		new Y();
	}

	static void m1() {
		System.out.println("m1() of class X");
	}
}

public class Testclass12 {
	public static void main(String[] args) {
		X.m1();
	}
}
