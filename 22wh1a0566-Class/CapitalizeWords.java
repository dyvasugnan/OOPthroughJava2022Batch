import java.io.*;
import java.lang.*;
import java.util.*;
public class CapitalizeWords{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input_string=br.readLine();
		StringTokenizer words=new StringTokenizer(input_string);
		int t=words.countTokens();
		String out_string=new String();
		String word=new String();
		for(int i=0;i<t;i++){
			word=words.nextToken().trim();
			out_string+=" "+word.substring(0,1).toUpperCase()+word.substring(1);
		}
		System.out.println(out_string);
	}
}


