package com.qspider.inheretence;

public class Inheritence_First_Class {
	public static void main(String[] args) {
		// Inh_Second_Class second_Class = new Inh_Second_Class();
		Inh_Second_Class second_Class = new Inh_Third_Class();
		second_Class.my_msg();
		second_Class.printMyName();
		int minus = second_Class.sumTwo(20, 10);
		System.out.println("child class="+minus);

	}
}
