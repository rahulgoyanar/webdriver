//refer static member
class A
{static int i;
static void m1()
{System.out.println("executing m1");
System.out.println(i);
}
}class run1
{public static void main(String[]args)
{System.out.println("executing start");
A.m1();
A.i=10;
A.m1();
}
}