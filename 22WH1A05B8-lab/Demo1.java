package cse5b8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class NewFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea ta;
	NewFrame(String fname) throws IOException{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ta=new JTextArea(15,30);
		c.add(ta);
		String s1="";
	String s2="";

		try {
			
			BufferedReader br=new BufferedReader(new FileReader(fname));
			while((s1=br.readLine())!=null) {
				s2=s1+" ";
				ta.setText(s2);
				br.close();
			}
			
		}
		catch(Exception fe) {
			System.out.println(fe);
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


