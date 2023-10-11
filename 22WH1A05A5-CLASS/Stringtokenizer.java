//reading data using string tokenizer class
import java.util.*;
import java.io.*;
class Stringtokenizer{
public static void main(String[] args)throws Exception{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Enter name,age,marks seperated by comma");
String str = br.readLine();
StringTokenizer st = new StringTokenizer(str ,",");
String s1 = st.nextToken();
String s2 = st.nextToken();
String s3 = st.nextToken();
int age  =Integer.parseInt(s2);
Float marks = Float.parseFloat(s3);
System.out.print("name is:"+s1 +'\n');
System.out.print("age is:"+age+'\n');
System.out.print("marks are:"+marks+'\n');
}
}

