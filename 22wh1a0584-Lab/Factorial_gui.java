package cseb;

import java.awt.*;

import java.awt.event.*;

class MyButtons extends Frame implements ActionListener{

	Button b1,b2;

	TextField t1,t2;

	MyButtons(){

		this.setLayout(null);

		b1=new Button("COMPUTE");

		b2=new Button("CLEAR");

		t1=new TextField(15);

		t2=new TextField(30);

		b1.setBounds(100,250,80,50);

		b2.setBounds(250,250,80,50);

		t1.setBounds(200,120,80,30);

		t2.setBounds(200,170,80,30);

		this.add(b1);

		this.add(b2);

		this.add(t1);

		this.add(t2);

		b1.addActionListener(this);

		b2.addActionListener(this);

	}

	public void paint(Graphics g) { 

		Font f1=new Font ("Arial",Font.BOLD,30);

		g.setFont(f1);

		g.setColor(Color.white);

		g.drawString("Number ",50,150);

		g.setColor(Color.white);

		g.drawString("Factorial ",50,200);

	}

	

	public void actionPerformed(ActionEvent ae) {

		String str;

		str=ae.getActionCommand();

		int n=Integer.parseInt(t1.getText());

		int fact=1;

		if(str.equals("COMPUTE")) {

			for(int i=n;i>=1;i--) {

				fact=fact*i;

			}

			t2.setText(String.valueOf(fact));

		}

		if(str.equals("CLEAR")) {

			t1.setText(" ");

			t2.setText(" ");

		}

	}

	

}

public class Factorial_gui {

	public static void main(String[] args) {

		MyButtons f= new MyButtons();

		f.setTitle("Sample Frame");

		f.setVisible(true);

		f.setSize(400,400);

		f.setBackground(Color.green);

		f.addWindowListener(new MyClass1());

	}

}

class MyClass1 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}