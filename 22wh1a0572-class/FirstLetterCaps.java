import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FirstLetterCaps{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i=0;
		
		System.out.println("ENter:");
		InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader  br=new BufferedReader(isr);
	    String str=br.readLine();
	    String[] word= str.split("\\s+");
	    int l= length(word);
        for(i=0;i<l;i++) {
        	word[i] = word[i].substring(0,1).toUpperCase()+word[i].substring(1).toLowerCase();
        }
      
        System.out.println(word);
	}

	private static int length(String[] words) {
		// TODO Auto-generated method stub
		return 0;
	}

}
