package actitime;

import java.util.Scanner;

public class Test1 {
	public static void   main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scn.next();
		s = s.toLowerCase();
		int n = s.length();
		boolean isPalidrome=false ;
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {

				isPalidrome = false;
			}
			else{
				isPalidrome = true;
			}
		}
		if(isPalidrome) {
			System.out.println(s + " is palidrome");
		} else {
			System.out.println(s + " is not palidrome.");
		}
	}

}
