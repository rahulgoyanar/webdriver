//to check no is prime or not
class prime
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int num=scn.nextInt();
if(isprime(num)==true)
{System.out.println("no is prime");}
else{System.out.println("number not prime");}
}

 public static boolean isprime(int n)
{if(n<2) return false;
for(int i=2; i<n; i++)
{if (n%i==0)
{return false ;
 }
}return true;
}
}