package com.anil;

//calling main method in other main method 
class S {
	public static void main(String[] args) {

		System.out.println("main method of S");

	}
}

class Testclass14 {
	public static void main(String[] args) {
		System.out.println("main method of test class");
		S.main(null);
	}
}
