class star
{
   public static void main(String args[])
   {		
	java.util.Scanner scan= new java.util.Scanner(System.in);
	System.out.println("Enter a number for star in column:");
	int i=scan.nextInt();
	System.out.println("Enter a number for star in row:");
	int j=scan.nextInt();
for(int n=1;n<=i;n--)
{for (n=1;n<=j;n--)
System.out.println("*");
}
}
}