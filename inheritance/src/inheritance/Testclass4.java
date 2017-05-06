// returning an object

package inheritance;

class Book {
	String title;
	double price;

	Book(String t, double p) {
		title = t;
		price = p;
	}

	void display() {
		System.out.println("title:" + title + " " + "price:" + price);
	}
}

class createbook {
	static Book getBook() {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("enter title");
		String t = scn.next();
		System.out.println("enter price");
		double p = scn.nextDouble();
		Book b = new Book(t, p);
		return b;
	}
}

class Testclass4 {
	public static void main(String[] args) {

		Book b1 = createbook.getBook();
		Book b2 = createbook.getBook();
		Book b3 = createbook.getBook();
		b1.display();
		b2.display();
		b3.display();

	}
}