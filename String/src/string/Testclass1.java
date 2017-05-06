package string;

import java.util.Scanner;

public class Testclass1 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String str = scn.next();
		Index(str);
	}

	public static void Index(String s) {
		System.out.println(s.indexOf('v'));   //ex. take string 'developer'
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf("ev"));
		System.out.println(s.indexOf('e',4));
		System.out.println(s.indexOf('e',2));
		
	}
}