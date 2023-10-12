import java.util.*;
import java.lang.*;
import java.io.*;
class Concatenation{
  public static void main(String[] args) throws IOException{
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   //System.out.print("enter string: ");
   String st="welcome to BVRITH college";
   char s1=(st.charAt(0));
   char s2=(st.charAt(8));
   char s3=(st.charAt(11));
   char s4=(st.charAt(18));
   StringBuffer s=new StringBuffer();
   s.append(s1);
   s.append(s2);
   s.append(s3);
   s.append(s4);
   System.out.print(s);
  }
}