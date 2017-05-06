package string;
//to print  digit from string
import java.util.Scanner;

public class digitstr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a string");
		String s = scn.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= '0' && c <= '9')
				System.out.println(c);

		}

	}
}
