package com.anil;

class Rect {
	int length;
	int bredth;

	void initialize(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;
	}

	void display() {
		System.out.println("[" + length + "," + bredth + "]");
	}
}

class Testclass6 {
	public static void main(String[] args) {
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("enter no");
		int a=scn.nextInt();
		int b=scn.nextInt();
		Rect r1 = new Rect();
		r1.initialize(a, b);
		r1.display();
	}
}
