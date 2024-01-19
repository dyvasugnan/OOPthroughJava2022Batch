package cse2225f1;
import java.awt.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.awt.event.*;
import javax.swing.*;



public class  Hashmap{

	
	static HashMap<String, String> book = new HashMap<>();


	public static void main(String[] args) {

		PhoneNoSearch("C:\\Users\\cse\\Downloads\\javafile1 (1).txt");

		String key = "cherry";

		String ver = nameToNumber(key);

		if(ver!=null) {

			System.out.println(ver+" is phone number of "+key);

		}

		else {

			System.out.println("not found");

		}

	}

	public static String nameToNumber(String key) {

		return book.get(key);

	}

	public static void PhoneNoSearch(String fname) {

		try {

			BufferedReader br = new BufferedReader(new FileReader(fname));

			String line;

			while((line =br.readLine())!=null) {
				String[] x=line.split("_");
				String name=x[0];
				String pnumber=x[1];
				book.put(name, pnumber);
				
			}

		}
		catch(Exception e) {
			
		}

	}



}