import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import Frames.AwtExample;
class form1 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField txt1,txt2,txt3;
	Button btn1,btn2;
	form1()
	{
		//super("MyFrame");
		setVisible(true);
		setLayout(null);
		setSize(1000,600);
		l1 = new Label("Name:");
		l1.setBounds(10,50,100,30);
		
		txt1=new TextField();
		txt1.setBounds(150,50,250,30);
		
		l2 = new Label("Roll no.");
		l2.setBounds(10,100,100,30);
		
		txt2=new TextField();
		txt2.setBounds(150,100,250,30);
		
		l3 = new Label("Branch ");
		l3.setBounds(10,150,300,30);
		
		btn1=new Button("Save");
		btn1.setBounds(10,300,100,30);
		btn1.addActionListener(this);
		btn2=new Button("Clear");
		btn2.setBounds(10,250,100,30);
		btn2.addActionListener(this);
		txt3 = new TextField();
		txt3.setBounds(150,200,250,30);
		add(l1);
		add(txt1);
		add(l2);
		add(txt2);
		add(l3);
		add(btn1);
		add(txt3);
		add(btn2);
		
	}

public void actionPerformed(ActionEvent e)
{
	String str;
	str= e.getActionCommand();
	String s1=txt1.getText();
	String s2=txt2.getText();
	String s3=txt3.getText();
	if(str.equals("Save")) {
		//form f =new form();
		try {
			FileWriter fw = new FileWriter("file1.txt",true);
			fw.write(s1 +"\n");
			fw.write(s2 +"\n");
			fw.write(s3 +"\n");
			fw.close();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	if(str.equals("Clear")) {
		System.exit(0);
	}
	
}

}
public class form {
	public static void main(String[] args) 
	{
		 form1 f = new form1();
		 f.setTitle("student form");
		 f.setVisible(true);
		 f.setSize(600,600);
		 f.addWindowListener(new MyClass()); 
		 
		//AwtExample1 a1=new AwtExample1();
	}
	
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}


