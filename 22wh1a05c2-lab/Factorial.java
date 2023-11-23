package cseb;



import java.awt.*;

import java.awt.event.*;



class MyButton2 extends Frame implements ActionListener{



	Button b1,b2;

	TextField t1,t2;

	Label l1,l2;

	int fact=1;

	int val,i;

	MyButton2(){

		this.setLayout(null);

		b1 = new Button("Compute");

		b2 = new Button("Clear");

		t1 = new TextField(50);

		t2 = new TextField(50);

		l1 = new Label("Number");

		l2 = new Label("Factorial");

		b1.setBounds(200,400,70,30);

		b2.setBounds(280,400,70,30);

		t1.setBounds(250,50,300,30);

		t2.setBounds(250,100,300,30);

		l1.setBounds(50,50,100,30);

		l2.setBounds(50,100,100,30);

		this.add(b1);

		this.add(b2);

		this.add(t1);

		this.add(t2);

		this.add(l1);

		this.add(l2);

		b1.addActionListener(this);

		b2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {

		String str;

		str = ae.getActionCommand();

		if(str.equals("Compute")) {

			val=Integer.parseInt(t1.getText());

			for(i=val;i>0;i--) {

				fact=fact*i;

			}

			t2.setText(Integer.toString(fact));

		}

		if(str.equals("Clear")) {

			t1.setText("");

			t2.setText("");

		}

	}

}

public class Factorial {

	public static void main(String[] args) {

		MyButton2 f = new MyButton2();

		f.setTitle("Factorial");

		f.setVisible(true);

		f.setSize(600,500);

		f.setBackground(Color.black);

		f.addWindowListener(new MyClass2());

	}

}

class MyClass2 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}