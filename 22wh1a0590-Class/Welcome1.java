import java.awt.Button;

import java.awt.Color;

import java.awt.Frame;

import java.awt.TextField;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

class NewButton extends Frame implements ActionListener{

	Button b1;
        Button b2;
        Button b3;
        Button b4;

	TextField t;

	NewButton(){

		b1 = new Button("+");
                b2 = new Button("-");
                b3 = new Button("*");
                b4 = new Button("/");

		t = new TextField();

		b1.setBounds(150,400,100,20);
                b2.setBounds(150,470,100,20);
                b3.setBounds(150,500,100,20);
                b4.setBounds(150,540,100,20);
		t.setBounds(250,100,100,20);


		this.add(b1);
                this.add(b2);
                this.add(b3);
                this.add(b4);
		this.add(t);

		b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this); 
                b4.addActionListener(this);




            


	}

	public void actionPerformed(ActionEvent ae) {

		String str;

		String s = "Welcome";

		str = ae.getActionCommand();

		if(str.equals("+"))

			t.setText(s);

	}

}



public class Welcome1 {



	public static void main(String[] args) {

		NewButton f1 = new NewButton();

		f1.setTitle("Set Text");

		f1.setVisible(true);

		f1.setSize(500,500);

		f1.addWindowListener(new MyClass());



	}



}



class MyClass extends WindowAdapter{



	public void windowClosing(WindowEvent we) {



		System.exit(0);



	}



}

