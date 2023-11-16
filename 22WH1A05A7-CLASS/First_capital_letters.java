
import java.util.*;
import java.io.*;
class FirstLettersCapital{
    public static void main(String[] args)throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter a string-");
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str," ");
        String newString= new String();
        while(st.hasMoreTokens())
        {
            String str1=st.nextToken();
            if(!str1.isEmpty())
            {
                newString +=((str1.substring(0,1).toUpperCase())+(str1.substring(1)));
            }
        }
        System.out.println("new string="+newString);
    }
}









