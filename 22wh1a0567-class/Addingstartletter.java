import java.util.*;
import java.io.*;
public class AddingStartingLetters{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer words=new StringTokenizer(s," ");
		int n=words.countTokens();
		s =" ";
		for(int i=0;i<n;i++){
			s+=words.nextToken().charAt(0);
		}
		System.out.println("string with first letters is:"+s);
	}
}