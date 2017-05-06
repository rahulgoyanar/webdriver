package compareobj;

class Rect {
	int length;
	int breadth;

	Rect(int l, int b) {
		length = l;
		breadth = b;
	}

	public boolean equals(Object x) {
		if (!(x instanceof Rect))
			return false;
		return length == ((Rect) x).length && breadth == ((Rect) x).breadth;
	}

	public String Tostring() {
		return "Rect[" + length + "," + breadth + "]";
	}
}
