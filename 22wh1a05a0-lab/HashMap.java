package cseb;
import java.io.*;
import java.util.*;
public class Hash_map {
	static HashMap<String,String>book=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Phone("C:\\Users\\cse\\Desktop\\225a0java\\phone.txt");
		 String key = "abc";
		 String user = nameToNumber(key);
		 if(user!=null) {
			 System.out.print(user+" is phone no. of "+key);
			 
		 }
		 else {
			 System.out.print("not found");
		 }
	}
public static String nameToNumber(String key) {
	return book.get(key);
}
public static void Phone(String fname) {
	try {
		BufferedReader br = new BufferedReader(new FileReader(fname));
		String line;
		while((line=br.readLine())!=null) {
			String[] x = line.split("\t");
			book.put(x[0],x[1]);
		
		}
	}
	catch(Exception e) {
		
	}
	
	}
}