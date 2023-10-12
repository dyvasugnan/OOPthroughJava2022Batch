import java.util.*;
import java.io.*;
public class Concatfirstch
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String str=br.readLine();
	    String res="";
	    int len=str.length();
	    //char ch=str.charAt(i);
	    StringTokenizer st=new StringTokenizer(str," ");
	      int count=st.countTokens();
	    for(int i=0;i<count;i++)
	    {
	        res+=(st.nextToken().charAt(0));
	    }
	    System.out.println(res);
	}
}