import java.util.*;
public class topper{
	public static void main(String[]args){
		int marks[]=new int[10];
		System.out.println("enter number of students");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter marks of the students");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		  for(int k=1;j<n;j++)
		   {
			if(marks[j]==marks[k])
			{
		           marks[j]=0;
			   marks[k]=0;
		
			}
		   }
		}
		int max=marks[0];
		for(int l=0;l<n;l++)
		{
			if(marks[l]>max)
			{
			   max=marks[l];
			}
		}
		System.out.println("topper marks="+max);
}
}

		
 