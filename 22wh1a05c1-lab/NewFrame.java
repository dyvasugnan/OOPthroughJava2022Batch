package Java22543;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewFrame extends JFrame{
	JTextArea ta;
	NewFrame(String fname){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ta=new JTextArea(15,30);
		c.add(ta);
		String s=" ";
		String s1=" ";
		try {
		 byte[] fileBytes = Files.readAllBytes(Paths.get(fname));
         String fileContent = new String(fileBytes, "UTF-8");
         ta.setText(fileContent);
			} 
		catch (IOException e) {
         System.out.println("An error occurred while reading the file.");
         e.printStackTrace();
     }
	}

}



