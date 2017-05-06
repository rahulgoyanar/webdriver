class star8
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
int star=1;
for(int i=1;i<=n;i++)
{
for(int j=n; j>i;  j-- )
{
System.out.print(" ");
}
for(int k=1; k<=star ;k++ )
{
System.out.print("*");
}
System.out.println();
star+=2;}
}
}