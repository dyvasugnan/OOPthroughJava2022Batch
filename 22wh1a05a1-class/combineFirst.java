import java.io.*;
import java.util.*;
class combineFirst{
public static void main(String[ ]  args) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("enter the line you want to seperate");
String st = br.readLine();
StringTockenizer  str = new  StringTockenizer (  st, " "); 
String s1 = str.nextToken();
String s2 = str.nextToken();
String s3 = str.nextToken();
String s4 = str.nextToken();
System.out.println(s1.charAt(0));
System.out.println(s2.charAt(0));
System.out.println(s3.charAt(0));
System.out.println(s4.charAt(0));
}
}
