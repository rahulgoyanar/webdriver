class primeche
{
   public static void main(String args[])
   {		
	int a=1;
	java.util.Scanner scan= new java.util.Scanner(System.in);
	System.out.println("Enter a number for check:");
	int n=scan.nextInt();
	if(n==0 || n==1)
	{System.out.println("no is not a prime");}
else{
	for(int i=2;i<n;i++)
	{
	   if(n%i==0)
	   {
	      a=0;
	      break;
	   }
	}
	if(a==1)
	   System.out.println(n + " is Prime Number");
	else
	   System.out.println(n + " is not Prime Number");
   }
   }
   }