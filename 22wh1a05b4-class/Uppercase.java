import java.util.*;
import java.lang.*;
import java.io.*;
class Upper{
  public static void main(String[] args) throws IOException{
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   String st="welcome to bvrith college";
   char s1=(st.charAt(0));
   char s2=(st.charAt(8));
   char s3=(st.charAt(11));
   char s4=(st.charAt(18));
   StringBuffer s=new StringBuffer();
   s.append(s1);
   s.append(s2);
   s.append(s3);
   s.append(s4);
   String str=String.valueOf(s);
   String str1=str.toUpperCase();
   System.out.println(str1);
   System.out.print(str1.charAt(0)+st.substring(1,7) +str1.charAt(1)+st.substring(9,10)+str1.charAt(2)+st.substring(12,17)+str1.charAt(3)+st.substring(19));
  }
}