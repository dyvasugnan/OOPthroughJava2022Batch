package cse22575;
import java.util.*;
import java.io.*;
public class DataPhonenbr {
	static HashMap<String,String>book=new HashMap<>();
	public static void main(String[] args) {
		phoneNoSearch1("C:\\Users\\cse\\Documents\\Data.txt");
		String key="aaaa";
		String res=nametoNumber(key);
		if(res!=null) {
			System.out.println(res+" is phone number "+key);
		}
		else
			System.out.println("Not Found");
	}
	public static String nametoNumber(String key) {
		return book.get(key);
	}
	public static void phoneNoSearch1(String fname) {
		System.out.println(fname);
		try {
			BufferedReader br=new BufferedReader(new FileReader(fname));
			String line;
			while((line=br.readLine())!=null) {
				String[] x=line.split("\t");
				String pname=x[0];
				String pnumber=x[1];
				book.put(pname, pnumber);		
			}
		}
		catch(Exception e) {
		}
	}
}
