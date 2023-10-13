import java.lang.*;
import java.util.*;
import java.io.*;
class Search{
public static void main (String[]args)throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,j,n=4;
System.out.print("enter the city to be searched");
String key=br.readLine();
String city[]= new String[10];
System.out.print("enter the names of the city");
for(i=0;i<n;i++)
{
	city[i]=br.readLine();
}
for(j=0;j<n;j++)
{
 if(city[j].equals(key))
 System.out.print("city found at:"+j);	
}
}
}

