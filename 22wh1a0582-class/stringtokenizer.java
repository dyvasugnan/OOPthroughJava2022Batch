import java.util.*;
import java.io.*;
class Search{
    public static void main(String[] args) throws IOExceptions{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        StringTokenizer st=new StringTokenizer(str,delimeter);
        String str=br.read();
        StringTokenizer st=new StringTokenizer(str," , ");
        String s1=st.nextTokener();
        String s2=st.nextTokener();
        String s3=st.nextTokener();
        s1=s1.trim();
        s2=s2.trim();
        s3=s3.trim();
        {
            System.out.println("age="+s1);
            System.out.println("name="+s2);
            System.out.println("marks="+s3);
            
        }
    }
}