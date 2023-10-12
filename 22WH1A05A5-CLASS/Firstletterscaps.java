import java.io.*;
import java.util.*;
class Firstletterscaps{
public static void main(String[] args)throws Exception{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Enter text seperated with white spaces:");
String str = br.readLine();
StringTokenizer st = new StringTokenizer(str ," ");
String s1 = st.nextToken();
String s2 = st.nextToken();
String s3 = st.nextToken();
String s4 = st.nextToken();
System.out.print(s1.substring(0, 1).toUpperCase() + s1.substring(1)+ " ");
System.out.print(s2.substring(0, 1).toUpperCase() + s2.substring(1)+ " ");
System.out.print(s3.substring(0, 1).toUpperCase() + s3.substring(1)+ " ");
System.out.print(s4.substring(0, 1).toUpperCase() + s4.substring(1)+ " ");
}
}
