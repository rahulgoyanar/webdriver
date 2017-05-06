class A
{ int i;
void display()
{int i=2;
System.out.println(i);
System.out.println(this.i);
}
}
class this1
{public static void main(String[]args)
{A a1=new A();
a1.i=55;
a1.display();
}
}