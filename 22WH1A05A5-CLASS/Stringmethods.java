//returning first letter of each word
import java.io.*;
import java.util.*;
class Stringmethods{
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
System.out.print(s1.charAt(0)+'\n');
System.out.print(s2.charAt(0)+'\n');
System.out.print(s3.charAt(0)+'\n');
System.out.print(s4.charAt(0)+'\n');
}
}



