package com.qspider.inheretence;

class Armstrong {
	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);

		System.out.println("enter no for armstrong");
		int i = scn.nextInt();
		int sum = 0;
		int prod = 0;
		if (i != 0) {
			sum = i % 10;
			i = i / 10;
			prod = prod + (sum * sum * sum);

		}
		if (i == prod) {
			System.out.println("Number " + prod + " is an armstrong number.");
		} else {
			System.out.println("Number " + prod + " is not an armstrong number.");
		}
	}
}
