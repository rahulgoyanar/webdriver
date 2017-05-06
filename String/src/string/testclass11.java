package string;
// to chk char have a digit or not
import java.util.Scanner;

public class testclass11 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a char");
		char c = scn.next().charAt(0);
		if (c >= '0' && c <= '9') {
			System.out.println("char is a digit");

		} else {
			System.out.println("char dont have digit");
		}

	}
}
