
//refer static member

class C
{static int i;
 int j;
}class run5
{public static void main(String[]args)
{
account a1=new account();
a1.accno=101;
account a2;
a2=a1;
System.out.println(a2.accno);
a2=new account();
}
}
