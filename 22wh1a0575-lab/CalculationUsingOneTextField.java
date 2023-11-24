package cse22575;

import java.awt.*;
import java.awt.event.*;
class MyButtons2 extends Frame implements ActionListener{
Button b1,b2,b3,b4,b5;
TextField t1,t2,t3;
Label l1,l2,l3;
MyButtons2(){
	this.setLayout(null);
	
	b1=new Button("+");
	b2=new Button("-");
	b3=new Button("*");
	b4=new Button("/");
	b5=new Button("=");
	t1=new TextField(15);
	
	t1.setBounds(200,60,80,30);
	
	b1.setBounds(30,250,70,30);
	b2.setBounds(120,250,70,30);
	b3.setBounds(210,250,70,30);
	b4.setBounds(300,250,70,30);
	b5.setBounds(180,300,70,30);
	
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	this.add(t1);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	String str;
	str=ae.getActionCommand();
	String s1=t1.getText();
	int result;
	if(str.equals("+")) {
		s1=s1.concat("+");
		t1.setText(s1);
	}
	if(str.equals("-")) {
		s1=s1.concat("-");
		t1.setText(s1);
	}
	if(str.equals("*")) {
		s1=s1.concat("*");
		t1.setText(s1);
	}
	if(str.equals("/")) {
		s1=s1.concat("/");
		t1.setText(s1);
	}
	String s=t1.getText();
	char c1=s.charAt(0);
	char c2=s.charAt(1);
	String s2=String.valueOf(c2);
	char c3=s.charAt(2);
	int n1=Integer.parseInt(String.valueOf(c1));
	int n2=Integer.parseInt(String.valueOf(c3));
	if(str.equals("=")) {	
		if(s2.equals("+")) {
			t1.setText("");
			result=n1+n2;
			t1.setText(String.valueOf(result));
		}
		if(s2.equals("-")) {
			t1.setText("");
			result=n1-n2;
			t1.setText(String.valueOf(result));
		}
		if(s2.equals("*")) {
			t1.setText("");
			result=n1*n2;
			t1.setText(String.valueOf(result));
		}
		if(s2.equals("/")) {
			t1.setText("");
			result=n1/n2;
			t1.setText(String.valueOf(result));
		}
	}
}
}
public class CalculationUsingOneTextField {
	public static void main(String[] args) {
		MyButtons2 f= new MyButtons2();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.setBackground(Color.pink);
		f.addWindowListener(new Calci());
	}
}
class Calci extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
}
}

