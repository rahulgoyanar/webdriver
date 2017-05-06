class star2
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=n;j>=1;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println();
}
}
}