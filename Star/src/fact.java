class fact
{
public static void main (String[]args)
{
java.util.Scanner scn=new java . util.Scanner (System.in);
System.out.println("eneter value for fact");
int n=scn.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=i*fact;
}
System.out.println(fact);
}
}