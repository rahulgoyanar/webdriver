package com.anil;
class c
{int i;
c(int i)
{this.i=i;
}
void m1(c arg1)
{System.out.println(i);
System.out.println(arg1.i);
}
	}

public class Testclass7 {
	public static void main(String[] args)
	{
		c c1=new c(10);
		c c2=new c(20);
		c1.m1(c2);
		c2.m1(c1);
		c1.m1(c1);
		c2.m1(c2);
		c1.m1(new c(50));
				
	}

}
