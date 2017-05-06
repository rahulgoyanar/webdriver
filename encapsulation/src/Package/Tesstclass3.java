package Package;

class Book {
	int pages;

	Book(int p) {
		pages = p;
	}

	public String Tostring() {
		return "Book(pages:" + pages + "}";
	}

	public boolean equals(Object x) {
		if (!(x instanceof Book))
			return false;
		// int p1 = pages;
		// int p2 = ((Book) x).pages;
		// return p1 == p2;
		return pages == ((Book) x).pages;
	}
}

public class Tesstclass3 {
	public static void main(String[] args) {
		Book b1 = new Book(100);
		Book b2 = new Book(100);
		System.out.println(b1 == b2);// false
		System.out.println(b1.equals(b2));
	}
}