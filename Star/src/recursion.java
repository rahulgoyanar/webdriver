//fact recursion
class recursion
{
public static void main(String[] args)
{java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int k=scn.nextInt();
System.out.println(fact(k));
}
static int fact(int n)
{if(n==0) return 1;
 int sum=n*fact(n-1);
return sum;
}
}