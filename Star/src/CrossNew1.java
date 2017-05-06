class CrossNew1
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
	if(   (i==j)   ||   (j==(n-(i-1)))   ){
		System.out.print("*");
	}
	else{
		System.out.print(" ");
	}
		
}
System.out.println("");
}

}
}