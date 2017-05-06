class demo
{public static void main (String[]args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter value for table");
int i =scn.nextInt();
int n=1;
for(n=1;n<11;n++)
{int sum=n*i;
System.out.println(sum+"="+n+"*"+i);
}
}}