


package cseb;

import java.awt.*;

import java.awt.event.*;

class Calci extends Frame implements ActionListener{

	Button b1,b2,b3,b4,b5;

	TextField t1,t2,t3;

	Calci(){

		this.setLayout(null);

		b1=new Button("ADD");

		b2=new Button("SUBTRACT");
		b3=new Button("MULTIPLY");
		b4=new Button("DIVIDE");
		b5=new Button("CLEAR");

		t1=new TextField(15);

		t2=new TextField(30);
		t3=new TextField(30);

		b1.setBounds(100,270,80,50);

		b2.setBounds(250,270,80,50);
		b3.setBounds(400,270,80,50);
		b4.setBounds(550,270,80,50);
		b5.setBounds(700,270,80,50);

		t1.setBounds(200,120,80,30);

		t2.setBounds(200,170,80,30);
		t3.setBounds(200,220,80,30);

		this.add(b1);

		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);

		this.add(t1);

		this.add(t2);
		this.add(t3);

		b1.addActionListener(this);

		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

	}

	public void paint(Graphics g) { 

		Font f1=new Font ("Arial",Font.BOLD,30);

		g.setFont(f1);

		g.setColor(Color.white);

		g.drawString("Number 1 ",50,150);

		g.setColor(Color.white);

		g.drawString("Number 2 ",50,200);
		g.setColor(Color.red);

		g.drawString("Result ",50,250);

	}

	

	public void actionPerformed(ActionEvent ae) {

		String str;

		str=ae.getActionCommand();

		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());

		int answer=0;

		if(str.equals("ADD")) {

			answer=n1+n2;

			t3.setText(String.valueOf(answer));

		}
		if(str.equals("SUBTRACT")) {

			answer=n1-n2;

			t3.setText(String.valueOf(answer));

		}
		if(str.equals("MULTIPLY")) {

			answer=n1*n2;

			t3.setText(String.valueOf(answer));

		}
		if(str.equals("DIVIDE")) {

			answer=n1/n2;

			t3.setText(String.valueOf(answer));

		}

		if(str.equals("CLEAR")) {

			t1.setText("");

			t2.setText("");
			
			t3.setText("");

		}

	}

	

}

public class Calculator_gui  {

	public static void main(String[] args) {

		Calci f= new Calci();

		f.setTitle("Sample Frame");

		f.setVisible(true);

		f.setSize(400,400);

		f.setBackground(Color.green);

		f.addWindowListener(new NewClass1());

	}

}

class NewClass1 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}
