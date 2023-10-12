import java.util.*;
public class Diamond
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println(">>n:");
	    int n=sc.nextInt();
	    for(int i=1;i<n;i++)           //i->rows,j->cols
	    {
	        for(int spaces=1;spaces<=(n-i);spaces++)
	        {
	            System.out.print("  ");
	        }
	        for(int j=1;j<2*i;j++)
	        {
	            if(j%2==0)
	            {
	                System.out.print("  ");
	            }
	            else{
	                System.out.print("* ");
	            }
	        }
	        System.out.println();
	    }
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int spaces=1;spaces<=(i-1);spaces++)
	        {
	            System.out.print("  ");
	        }
	        for(int j=1;j<=(2*(n-i)+1);j++)
	        {
	            if(j%2==0)
	            {
	                System.out.print("  ");
	            }
	            else
	            {
	                System.out.print("* ");
	            }
	        }
	        System.out.println();
	    }
	    
	   
	    }	
}