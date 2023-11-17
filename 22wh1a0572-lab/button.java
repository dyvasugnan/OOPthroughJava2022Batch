package gui;
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class New extends Frame implements ActionListener{
	Button b1;
	TextField t1;
	String text;
	New(){
	this.setLayout(null);
	b1=new Button("set");
	t1 = new TextField();
	b1.setBounds(100,500,100,50);
	t1.setBounds(200,100,100,50);
	this.add(b1);
	this.add(t1);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equals("set"))
			t1.setText("welcome");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		New f= new New();
		f.setTitle("sample frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass1());
		}
		}
		class MyClass1 extends WindowAdapter
		{
		public void windowClosing(WindowEvent we) {
		System.exit(0);
		}
	}
