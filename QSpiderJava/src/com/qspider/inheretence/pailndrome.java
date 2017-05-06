package com.qspider.inheretence;

class pailndrome {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter the string which you want to check whether that is palindrome or not: ");
		String s = scn.next();
		String r = "";
		for (int i = s.length() - 1; i <= 0; i--) {
			r = r + s.charAt(i);
			System.out.println(r);
		}
		//if (r.equals(s))
			System.out.println("String " + s + " is palindrome.");
		//} else {
			//System.out.println("String " + s + " is not palindrome.");
		//}
	}
}
