class prime
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int enum=scn.nextInt();
if(isprime(enum)==1)
{System.out.println("no is prime");}
else{System.out.println("number not prime");}
}
}
 static boolean isprime(int n)
{if(n<2) return false;
for(int i=2; i<n; i++)
{if (n%i==0)
{return false ;
 }
}return true;
}
