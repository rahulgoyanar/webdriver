//child class

package com.qspider.inheretence;

public class Inh_Third_Class extends Inh_Second_Class{

	@Override
	public void printMyName() {
		
		super.printMyName();
		System.out.println("My name is Rahul");
	}
	
	@Override
	
	public int sumTwo(int a, int b) {
		
		int sum = super.sumTwo( a,b);	
		System.out.println("parent sum = " + sum);
		int mul=super.multiply(a, b);
		System.out.println("parent mul="+mul);
		return a - b;
		
	}
	
	public String msg(String my_msg) {
		return my_msg;
	}
}
