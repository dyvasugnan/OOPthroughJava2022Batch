package siri_5c6;



import java.awt.*;

import java.awt.event.*;



class MyButton extends Frame implements ActionListener{

	Button b;

	TextField t;

	MyButton() {

		this.setLayout(null);

		b = new Button("Set");

		t = new TextField(100);

		b.setBounds(200,400,70,30);

		t.setBounds(150,300,300,30);

		this.add(b);

		this.add(t);

		b.addActionListener(this);

		}

		public void actionPerformed(ActionEvent ae) {

			String str;

			str = ae.getActionCommand();

			if(str.equals("Set"))

				t.setText("Welcome:)");

		}

}

public class SetButton {

	public static void main(String[] args) {

		MyButton f = new MyButton();

		f.setTitle("Set Button Interface");

		f.setVisible(true);

		f.setSize(500,500);

		f.setBackground(Color.black);

		f.addWindowListener(new MyClass2());

	}

}



class MyClass2 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}