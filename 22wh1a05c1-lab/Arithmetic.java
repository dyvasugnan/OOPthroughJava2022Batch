package cseb;


import java.awt.*;

import java.awt.event.*;

//import javax.swing.*;

class MyButtons extends Frame implements ActionListener{

	Button b1,b2,b3,b4,b5;

	TextField t1,t2,t3;

	Label l1,l2,l3;

	MyButtons(){

		this.setLayout(null);

		l1=new Label("NUM1");

		l2=new Label("NUM2");

		l3=new Label("RESULT");

		b1=new Button("Add");

		b2=new Button("Sub");

		b3=new Button("Mul");

		b4=new Button("Div");

		b5=new Button("Clear");

		t1=new TextField(15);

		t2=new TextField(15);

		t3=new TextField(15);

		

		l1.setBounds(100,50,80,30);

		l2.setBounds(100,100,80,30);

		l3.setBounds(100,150,80,30);

		t1.setBounds(200,50,80,30);

		t2.setBounds(200,100,80,30);

		t3.setBounds(200,150,80,30);

		b1.setBounds(60,250,80,30);

		b2.setBounds(150,250,80,30);

		b3.setBounds(250,250,80,30);

		b4.setBounds(60,300,80,30);

		b5.setBounds(150,300,80,30);

		

		this.add(l1);

		this.add(l2);

		this.add(l3);

		this.add(t1);

		this.add(t2);

		this.add(t3);

		this.add(b1);

		this.add(b2);

		this.add(b3);

		this.add(b4);

		this.add(b5);

		b1.addActionListener(this);

		b2.addActionListener(this);

		b3.addActionListener(this);

		b4.addActionListener(this);

		b5.addActionListener(this);

	}

	

	public void actionPerformed(ActionEvent ae) {

		String str;

		str=ae.getActionCommand();

		int NUM1=Integer.parseInt(t1.getText());

		int NUM2=Integer.parseInt(t2.getText());
		
		int RESULT;

		if(str.equals("Add")) {

			RESULT=NUM1+NUM2;

			t3.setText(String.valueOf(RESULT));

		}

		else if(str.equals("Sub")) {

			RESULT=NUM1-NUM2;

			t3.setText(String.valueOf(RESULT));

		}

		else if(str.equals("Mul")) {

			RESULT=NUM1*NUM2;

			t3.setText(String.valueOf(RESULT));

		}

		else if(str.equals("Div")) {

			RESULT=NUM1/NUM2;

			t3.setText(String.valueOf(RESULT));

		}

		if(str.equals("Clear")) {

			t1.setText("");

			t2.setText("");

			t3.setText("");

		}

	}

}



public class Arithmetic {




	public static void main(String[] args) {

		MyButtons f= new MyButtons();

		f.setTitle("Sample Frame");

		f.setVisible(true);

		f.setSize(400,400);

		f.setBackground(Color.pink);

		f.addWindowListener(new MyClass1());

	}



}

class MyClass1 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

}

}

