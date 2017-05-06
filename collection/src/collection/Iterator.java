package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(60);
		ListIterator listitr = a.listIterator();
		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		while (listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}

	}

}
