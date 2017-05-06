package com.anil;
class B
{B()
	{System.out.println("default ctt");
	}
B(int i)
{System.out.println("paramertrized ctt");
}
	}
public class Testclass4 
{
	public static void main(String[] args)
	{new B(1);
	new B();
	}
	}