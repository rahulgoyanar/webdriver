package inheritance;

class phone {
	 int height;
	 int length;
	 int width;

	phone(int h, int l, int w) {
		height = h;
		length = l;
		width = w;
	}

	void display() {
		System.out.println("height:" + height);
		System.out.println("length:" + length);
		System.out.println("width:" + width);
	}
}

class camera extends phone {
	int pixel;

	camera(int h, int w, int l, int p) {
		super(h, w, l);
		pixel = p;
	}

	void display() {
		super.display();
		System.out.println("pixel:" + pixel);
	}
}

class Testclass3 {
	public static void main(String[] args) {
		camera a = new camera(1, 2, 3, 4);
		a.display();
	}
}
