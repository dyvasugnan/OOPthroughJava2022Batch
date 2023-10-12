import java.io.*;
import java.util.*;
public class Cities
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    boolean flag=false;
	    System.out.println("size:");
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    System.out.println("string:");
	    String cities[]=new String[size];
	    for(int i=0;i<size;i++)
	    {
	        cities[i]=br.readLine();
	    }
	    System.out.println("key:");
	    String key=br.readLine();
		for(int i=0;i<size;i++)
	    {
	        if((cities[i]).equals(key))
	       {
	           //System.out.println("found");
	           flag=true;
	       }
	       else{
	           flag=false;
	       }
	        
	    }
	    if(flag)
	    {
	        System.out.println("Element found");
	    }
	    
	    else{
	    System.out.println("Element not found");
	    }

	    
	}
}

