package com.anil;

class Box1 {
	int height;
	int width;
	int length;

	Box1() {
	}

	Box1(int h, int w, int l) {
		height = h;
		width = w;
		length = l;
	}

	Box1(int n) {
		this(n, n, n);
	}

	void display() {
		System.out.println("[" + height + "," + width + "," + length + "]");
	}

}

class Testclass9 {
	public static void main(String[] args) {
		Box1 b1 = new Box1(1, 2, 3);
		Box1 b2 = new Box1();
		Box1 b3 = new Box1(5);
		b1.display();
		b2.display();
		b3.display();
	}
}