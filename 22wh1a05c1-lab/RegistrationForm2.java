package cseb;



import java.awt.*;

import java.awt.event.*;



class MyButton extends Frame implements ActionListener{

	Button b1,b2,b3;

	MyButton(){

	this.setLayout(null);

	b1=new Button("Red");

	b2=new Button("green");

	b3=new Button("orange");

	b1.setBounds(80,350,90,40);

	b2.setBounds(250,350,90,40);

	b3.setBounds(250,350,90,40);

	this.add(b1);

	this.add(b2);

	this.add(b3);

	b1.addActionListener(this);

	b2.addActionListener(this);

	b2.addActionListener(this);

	}

	

	public void actionPerformed(ActionEvent ae) {

		String str;

		str=b1.getActionCommand();

		if(str.equals("Blue")) 

			this.setBackground(Color.blue);

		str=b2.getActionCommand();

		if(str.equals("Blue")) 

			this.setBackground(Color.blue);

		str=b3.getActionCommand();

		if(str.equals("Blue")) 

			this.setBackground(Color.blue);

		



	}

}

public class RegistrationForm2 {

		public static void main(String[] args) {

			// TODO Auto-generated method stub

	         MyButton f=new MyButton();

	         f.setTitle("Student Registration Form");

	         f.setVisible(true);

	         f.setSize(500,500);

	         f.addWindowListener(new Myclass());

		}



	}



class Myclass extends WindowAdapter{



		  public void windowClosing(WindowEvent we) {

			  

			  System.exit(0);

		  }

	}