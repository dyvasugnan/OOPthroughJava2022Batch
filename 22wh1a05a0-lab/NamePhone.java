package cseb;
import java.util.*;
import java.io.*;
public class NamePhone {
	static HashMap<String,String>book=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone("\\C:\\Users\\cse\\Desktop\\cseb\\Name_Phone.txt\\");
		String key = "abc";
		String User = nametoNumber(key);
		if(User!= null) {
			System.out.print(" phone number of "+key);
		}
		else {
			System.out.print(" not found ");
		}
	}
public static String nametoNumber(String key) {
	return book.get(key);
}
public static void Phone(String fname) {
	try {
		BufferedReader br = new BufferedReader(new FileReader(fname));
		String Line;
		while((Line=br.readLine())!=null) {
			String[] x = Line.split("\t");
			book.put(x[0], x[1]);
		}
	}
	catch(Exception e) {
		
	}
	}
}
