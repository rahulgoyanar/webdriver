package com.anil;

class Box {
	int height;
	int width;
	int length;

	Box() {
	}

	Box(int h, int w, int l) {
		height = h;
		width = w;
		length = l;
	}

	Box(int n) {
		height = width = length = n;
	}

	void display() {
		System.out.println("[" + height + "," + width + "," + length + "]");
	}

	
}

class Testclass5 {
	public static void main(String[] args) {
		Box b1 = new Box(1,2,3);
		Box b2 = new Box();
		Box b3 = new Box(5);
		b1.display();
		b2.display();
		b3.display();
	}
}