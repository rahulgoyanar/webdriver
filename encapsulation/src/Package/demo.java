package Package;

public class demo {
	static void m1(int i) {
		System.out.print(i);
		if (i == 10)
			return;
		m1(++i);
		return;
	}

	public static void main(String[] args) {

		m1(0);
	}
}
