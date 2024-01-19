package cseb;
import java.io.*;
import java.util.*;

class PrintFromFile {
	static HashMap<String,String> book = new HashMap<>();
	public static String nameTonumber(String key) {
		return book.get(key);
	}
	public static void phonenumSearch(String fn) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fn));
			String line;
			while((line = br.readLine()) != null) {
				String[] x = line.split("\t");
				String name = x[0];
				String num = x[1];
				book.put(name, num);
			}
		}
		catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		phonenumSearch("C:\\Users\\cse\\Desktop\\dataJava.txt");
		String key = "Riya";
	    String r = nameTonumber(key);
	    if(r != null)
	    	System.out.println(r+" is phone number of "+key);
	    else
	    	System.out.println("Not Found");
	}
	
}
