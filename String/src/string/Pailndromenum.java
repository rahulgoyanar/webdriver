package string;

import java.util.Scanner;

public class Pailndromenum {

	public static void main(String[] args) {
		 System.out.print("Enter Number: ");
	       Scanner scn = new Scanner(System.in);
	       int num = scn.nextInt();
	       int n = num;
	       //reversing number
	       int rev=0,rmd; 
	       while(num > 0) 
	       { 
	         rmd = num % 10; 
	         rev = rev * 10 + rmd; 
	         num = num / 10; 
	       } 
	       if(rev == n) 
	         System.out.println(n+" is a Palindrome Number!"); 
	       else 
	         System.out.println(n+" is not a Palindrome Number!"); 
	     } 
	}
