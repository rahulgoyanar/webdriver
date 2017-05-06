package string;
// to convert upeer to lower and lower to upper
import java.util.Scanner;

public class Testclass13 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s = scn.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		System.out.println(sb);

	}
}
