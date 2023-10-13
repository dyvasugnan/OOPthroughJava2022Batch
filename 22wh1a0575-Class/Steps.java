import java.util.*;
class Steps
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of steps :");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		System.out.println("No.of ways to climb the stairs : "+n2);
	}
}