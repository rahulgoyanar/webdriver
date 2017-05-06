package string;

import java.util.Scanner;

public class Revstr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a string");
		String str = scn.next();
		System.out.println(reverse(str));
	}

	public static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}
}