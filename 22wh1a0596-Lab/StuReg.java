package cseb96;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
class Frame12 extends Frame implements ActionListener,Serializable{
	Button b1,b2;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Frame12(){
	this.setLayout(null);
//	Panel p = new Panel(new GridLayout(4,4));
	b1 = new Button("Save");
	b2 = new Button("Exit");
	t1 = new TextField(50);
	t2 = new TextField(50);
	t3 = new TextField(50);
	l1 = new Label("Name");
	l2 = new Label("Roll no");
	l3 = new Label("Branch");
	b1.setBounds(100, 600, 50, 50);
	b2.setBounds(200, 600, 50, 50);
	t1.setBounds(300,100,300,50);
	t2.setBounds(300,200,300,50);
	t3.setBounds(300,300,300,50);
	l1.setBounds(200,100, 300,50);
	l2.setBounds(200,200, 300,50);
	l3.setBounds(200,300, 300,50);
	this.add(b1);
	this.add(b2);
	this.add(t1);
	this.add(t2);
	this.add(t3);
	this.add(l1);
	this.add(l2);
	this.add(l3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	t3.addActionListener(this);
	this.setBackground(Color.pink);
	}
	public void Create_File() throws IOException  {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("stude.txt",true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			String Name = t1.getText();
			oos.writeObject(Name);
			String Roll = t2.getText();
			oos.writeObject(Roll);
			String Bran = t3.getText();
			oos.writeObject(Bran);
			fos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
public void actionPerformed(ActionEvent ae) {
		String str;
		str= ae.getActionCommand();
		if(str.equals("Save")) {
			try {
				Create_File();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if (str.equals("Exit")){
			System.exit(0);
		}
	}
}
public class StuReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame12 g1 = new Frame12();
		g1.setTitle("Student Registration Form");
		g1.setVisible(true);
		g1.setSize(800,800);
		g1.addWindowListener(new Demon());

	}
}
class Demon extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}




