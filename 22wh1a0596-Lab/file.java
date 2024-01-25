import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Book_ph {
    static HashMap<String,String>book=new HashMap<>();
    public static void main(String args[]) {
    	
    	//String f="C:\Users\cse\Documents\PH_BOOK.txt";
    	phoneNoSearch("C:\Users\cse\Documents\PH_BOOK.txt");
    	String key="NIKITHA";
    	String res= nametoNumber(key);
    	if(res==null) {
    		System.out.println(res+"is the ph num of"+ key);
    	}
    	else {
    		System.out.println("Not found");
    	}
    	public static void phoneNoSearch(String fname) {
    		try {
    			BufferedReader br=new BufferedReader(new FileReader(fname));
    			String line;
    			while((line= br.readLine())!=null) {
    				String[] x=line.split(line, '\t');
    				String name=x[0];
    				String num=x[1];
    				book.put(name, num);
    				
    			}
    		}
    		catch(Exception e ) {
    	}
    }
    	public static String nametoNumber(String key) {
    		return book.get(key);
    	}}

}
