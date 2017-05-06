package string;

//for 2 ocuurance letter in string
import java.util.Scanner;

public class Occur {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = scn.next();
		System.out.println("Enter a char");
		char c = scn.next().charAt(0);
		int p = s1.indexOf(c);
		System.out.println(s1.indexOf(c, p + 1));
	}
}