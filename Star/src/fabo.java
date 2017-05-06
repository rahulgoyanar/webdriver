class fabo
{
public static void main (String[]args)
{
java.util.Scanner scn=new java . util.Scanner (System.in);
System.out.println("eneter value for no");
int n=scn.nextInt();
int a=0;
System.out.println(a);
int b=1;
System.out.println(b);
for(int i=1;i<=n;i++)
{
    int c=a+b;
System.out.println(c);
  a=b;
  b=c;
}
}
}