class star4
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();

int count =0;
int max = n;
for ( int i = 1; i<=n; i++) {
	if(count == 0) {
	max = n;
	} else
	max = n-1;
	for (int j = 1; j <= max;j++) {
		if(count == 0) 
		System.out.print("* ");
		else
		System.out.print(" *");
	}
	System.out.println();
	count = ~count;
}
}}