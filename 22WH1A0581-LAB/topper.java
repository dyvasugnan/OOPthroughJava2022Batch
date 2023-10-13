import java.util.*;
public class topper{
	public static void main(String[] args){
		int i,j,k,l;
		int marks[]=new int[10];
		System.out.println("enter no. of students");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter marks of students");
		for(i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("marks-");
		for(i=0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
		for(j=0;j<n;j++)
		{
			for(k=1;j<n;j++)
			{
				if(marks[j]==marks[k])
				{
					marks[j]=0;
					marks[k]=0;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
		int max=marks[0]; 
		for(l=0;l<n;l++)
		{
			if(marks[l]>max)
			{
				max=marks[l];
			}
		}
		System.out.println("topper marks="+max);
}
}	
		
		