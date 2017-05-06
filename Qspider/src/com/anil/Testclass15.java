package com.anil;

 class P {
static void m1(){
	System.out.println("static method");
}
static{
	System.out.println("static block");
}

}
 
class Testclass15
{
	public static void main(String[] args)
	{
		System.out.println("execution start ");
		P.m1();
		P.m1();
	}
}
