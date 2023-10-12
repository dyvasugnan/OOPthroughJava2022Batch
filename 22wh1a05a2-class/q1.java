import java.lang.*;
import java.util.*;
import java.io.*;
class Test
{
public static void main(String []args) throws IOException
{
String[] cityNames={"hyd","delhi","new york"};
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter city to be searched");
String searchcity=br.readLine();
String foundcity = null;
for(String city : cityNames)
{
if(city.equals(searchcity))
{
foundcity = city;
break;
}
}
if(foundcity!=null){
System.out.println("found");
}
else{
System.out.println("not found");
}


}
}