class C
{int i;
static int j;
}class run2
public static void main(String[]args)
{
C c1=new C();
c1.i=10;
c1.j=20;
C c2=new C();
c2.i=30;
c2.j=40;
System.out.println(c1.i+" "+c1.j);
System.out.println(c2.i+" "+c2.j);
}
}