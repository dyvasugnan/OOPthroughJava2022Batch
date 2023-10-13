import java.util.*;
public class Student{
	public static void main(String[] args){
        int marks[]=new int[10];
        System.out.println("enter number of students");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter marks of student");
        int i,j,k;
        for(i=0;i<n;i++)
        {
        	marks[i]=sc.nextInt();
        }
        System.out.println("marks");
        for(j=0;j<n;j++)
        {
        	for(k=1;k<n;k++)
                {
                  if(marks[i]==marks[k])
                  {
                     marks[j]=0;
                     marks[k]=0;
                  } 
                }  
        }
        int max=marks[i];
        for(int l=0;l<n;l++)
        {
           if(marks[l]>max)
           {
              max=marks[l];
           }
        }
        System.out.println("topper marks"+max);
}
}        