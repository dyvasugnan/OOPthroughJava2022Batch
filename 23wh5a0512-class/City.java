import  java.io.*;
import  java.util.*;
class  Search
{
public static void main(String[] args)  throws IOException
{
int i;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s[]=new String[5];
System.out.println("enter the cities");
for(i=0;i<5;i++)
{
s[i]=br.readLine();
}
System.out.println("enter the  element to find");
String  ele=br.readLine();
for(i=0;i<5;i++)
{
if(city[i]==key)
break;
}
System.out.println("element found  "+ele);
}
}
