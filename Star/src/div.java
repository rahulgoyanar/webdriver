class div
{
public static void main (String[]args)
{
java.util.Scanner scn=new java . util.Scanner (System.in);
System.out.println("eneter value for a");
int a=scn.nextInt();
System.out.println("eneter value for b");
int b=scn.nextInt();
for(int i=a;i<=b;i++)
{
int c=i%10;
int d=i/10;
int sum=c+d;
if(sum%3==0)
{System.out.println(i);
}}
}
}
