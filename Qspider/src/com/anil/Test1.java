package com.anil;

public class Test1 {

	Test1(int i) {

		System.out.println("Test1 Constructor " + i);

	}
}

 class Test2 {

	Test1 t1 = new Test1(10);

	Test2(int i) {

		System.out.println("Test2 Constructor " + i);

	}

	public static void main(String[] args) {

		Test2 t2 = new Test2(5);

	}
}
