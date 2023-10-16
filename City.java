import  java.io.*;
import  java.util.*;
class  City
{
public static void main(String[] args)  throws IOException
{
int i;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String city[]=new String[5];
System.out.println("enter the cities");
for(i=0;i<5;i++)
{
city[i]=br.readLine();
}
System.out.println("enter the  element to find");
String  key=br.readLine();
for(i=0;i<5;i++)
{
if(city[i]==key)
break;
}
System.out.println("element found  "+key);
}
}
