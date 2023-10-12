import java.util.*;
import java.io.*;
public class Capitalize
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String str=br.readLine();
	    String final1="";
	    String new1="";
	    StringTokenizer st=new StringTokenizer(str," ");
	      int count=st.countTokens();
	    for(int i=0;i<count;i++)
	    {
	       String words=(st.nextToken());
	        char firstch=Character.toUpperCase(words.charAt(0));
	        //System.out.println(firstch);
	        String otherch=words.substring(1);
	       // System.out.println(otherch);
	        final1+=firstch+otherch+" ";
	    }
	    System.out.println(final1);
	}
}
