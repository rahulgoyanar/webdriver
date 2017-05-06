package string;

import java.util.Scanner;

public class substr {
	public static void main(String[] args) {
		String s1 = "developer";
		System.out.println("developer");
		System.out.println(s1.substring(3)); // part of string
		System.out.println(s1.substring(4, 8));// part of string
		s1 = s1.replace('e', 'R');// to replace word from word
		System.out.println(s1);
		s1 = s1.replace("R", "");// to remove word from string
		System.out.println(s1);
		String s2 = "developer";
		int p = (s2.length() - s2.replace("e", "").length()); // count word in string
		System.out.println(p);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String s3 = scn.next(); 
		System.out.println(s3.toLowerCase());//to convert into  lower case
		System.out.println(s3.toUpperCase()); //to convert into upper case
		s3=s3.substring(0,1).toUpperCase()+s3.substring(1).toLowerCase();// first letter capital and other small
		System.out.println(s3);
	}
}
