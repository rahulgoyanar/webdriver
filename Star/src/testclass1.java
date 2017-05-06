class A
{int i;
void display()
{int i=1;
System.out.println(i+" "+this.i);
}
}
class testclass1
{
public static void main(String[]args)
{A a1=new A();
a1.i=10;
a1.display();
A  a2=new A();
a2.i=20;
a2.display();
}
}