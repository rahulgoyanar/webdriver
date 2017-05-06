package com.anil;

class triangle {
	int base;
	int height;

	triangle() {
		base = 10;
	}

	triangle(int h) {
		this();
		new triangle();

		height = h;
	}

	void display() {
		System.out.println(base + " " + height);
	}
}

class Testclass11 {
	public static void main(String[] args) {
		triangle t1 = new triangle(20);
		t1.display();

	}
}
