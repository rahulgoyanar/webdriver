package string;

import java.util.Scanner;

public class Revstring {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String str = scn.next();
		System.out.println(reverse(str));
	}

	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();//it is a mutable class
		for (int i = s.length() - 1; i >= 0; i--) {
			 sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
