import java.lang.*;
import java.util.*;
import java.io.*;
class First{
public static void main (String[]args)throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s1="welcome to bvrith college";
char s2 = (s1.charAt(0));
char s3 = (s1.charAt(8));
char s4 = (s1.charAt(11));
char s5 = (s1.charAt(18));
StringBuffer s = new StringBuffer();
s.append(s2);
s.append(s3);
s.append(s4);
s.append(s5);
System.out.print(s);

}
}