//to display prime no
class primeno
{
public static void main(String[] args)
{int sum=0;
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int num=scn.nextInt();
for(int i=1;i<num;i++)
{if((isprime(i)))
{System.out.println(i);}
}
}
public static boolean isprime(int n)
{if(n<2) return false;
for(int i=2; i<n; i++)
{if (n%i==0)
{return false ;}
}return true;
}
}
