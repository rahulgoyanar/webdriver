package string;

import java.util.Scanner;

public class path {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scn.nextLine();
		System.out.println((s.substring(s.lastIndexOf("\\")+1)));
	}
}