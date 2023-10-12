//linear search on Strings
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size and cities");
		String Size=br.readLine();
		int S=Integer.parseInt(Size);
		String City[]=new String[S];
		for(int i=0;i<S;i++)
		{
		    City[i]=br.readLine();
		}
		System.out.println("enter the city to be searched:");
		String Searchelement=br.readLine();
		boolean found=false;
		for(int i=0;i<S;i++)
		{
		    if(Searchelement.equals(City[i]))
		    {
		       found=true;
		       System.out.println("City found");
		       break;
		    }
		    
		}   
		if(!found)
		    {
		        System.out.println("City not found");
		    }
	}
}
