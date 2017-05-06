package com.anil;

//static blk and non static block
class D {
	static {
		System.out.println("static blk of E");
	}

	{
		System.out.println("nonstatic blk of y");
	}
}
class Testclass13{
	public static void main(String[] args) {
		System.out.println("main class strt");
		new D();
		new D();
	}
}
