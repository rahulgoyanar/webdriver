package string;

import java.util.Scanner;

//for distinct word from string
public class testclass3 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s1 = scn.next();
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s2.indexOf(s1.charAt(i)) == -1) {
				s2 += s1.charAt(i);

			}
		}
		System.out.println(s2);
		
	}
}
