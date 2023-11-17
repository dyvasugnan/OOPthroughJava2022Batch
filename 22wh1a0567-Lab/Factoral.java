package Gui2;
import java.awt.Button;

import java.awt.Frame;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;

import java.awt.event.*;



class TestThreeGUI extends Frame implements ActionListener{

	Button b1,b2;

	TextField t1,t2;

	Label l1,l2;

	TestThreeGUI(){		

		this.setLayout(null);

		

		l1=new Label("Enter number : ");

		l2=new Label("Result :");

		b1=new Button("Calculate Factorial");

		b2=new Button("Clear");

		t1=new TextField("0");

		t2=new TextField("0");

		

		l1.setBounds(100,150,150,50);

		l2.setBounds(100,300,150,50);

		b1.setBounds(60,400,150,50);

		b2.setBounds(300,400,150,50);

		t1.setBounds(250,150,200,50);

		t2.setBounds(250,300,200,50);

		

		this.add(l1);

		this.add(l2);

		this.add(b1);

		this.add(b2);

		this.add(t1);

		this.add(t2);

		

		b1.addActionListener(this);

		b2.addActionListener(this);

	}

	

	public void actionPerformed(ActionEvent ae) {

		String str=ae.getActionCommand();

		if(str.equals("Calculate Factorial")) {

			int n=Integer.parseInt(this.t1.getText());

			int fact=1;

			while(n!=0) {

				fact*=n;

				n-=1;

			}

			this.t2.setText(String.valueOf(fact));

		}

		if(str.equals("Clear")) {

			this.t1.setText("0");

			this.t2.setText("0");

		}

	}

	

}

public class Factoral {

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			TestThreeGUI f=new TestThreeGUI();

			f.setTitle("First Frame");

			f.setVisible(true);

			f.setSize(600,600);

			f.addWindowListener(new MyNewTwoClass());

		}

}



class MyNewTwoClass extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}
