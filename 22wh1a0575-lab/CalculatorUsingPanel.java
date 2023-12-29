import java.awt.*;

import java.awt.event.*;

class FrameTest extends Frame implements ActionListener{

	TextArea t1;

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

	Panel p;

	String s1,s2;

	FrameTest(){

		setLayout(new BorderLayout());

		t1=new TextArea(3,5);

		add(t1,BorderLayout.NORTH);

		p=new Panel(new GridLayout(4,4));

		add(p);

		b1=new Button("1");

		b2=new Button("2");

		b3=new Button("3");

		b4=new Button("4");

		b5=new Button("5");

		b6=new Button("6");

		b7=new Button("7");

		b8=new Button("8");

		b9=new Button("9");

		b10=new Button("0");

		b11=new Button("+");

		b12=new Button("-");

		b13=new Button("*");

		b14=new Button("/");

		b15=new Button("=");

		b16=new Button("CLEAR");

		p.add(b1);

		p.add(b2);

		p.add(b3);

		p.add(b4);

		p.add(b5);

		p.add(b6);

		p.add(b7);

		p.add(b8);

		p.add(b9);

		p.add(b10);

		p.add(b11);

		p.add(b12);

		p.add(b13);

		p.add(b14);

		p.add(b15);

		p.add(b16);

		b1.addActionListener(this);

		b2.addActionListener(this);

		b3.addActionListener(this);

		b4.addActionListener(this);

		b5.addActionListener(this);

		b6.addActionListener(this);

		b7.addActionListener(this);

		b8.addActionListener(this);

		b9.addActionListener(this);

		b10.addActionListener(this);

		b11.addActionListener(this);

		b12.addActionListener(this);

		b13.addActionListener(this);

		b14.addActionListener(this);

		b15.addActionListener(this);

		b16.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==b1) {

			s1=t1.getText();

		    s2=s1+"1";

		    t1.setText(s2);

		}

		if(ae.getSource()==b2) {

			s1=t1.getText();

		    s2=s1+"2";

		    t1.setText(s2);

		}

		if(ae.getSource()==b3) {

			s1=t1.getText();

		    s2=s1+"3";

		    t1.setText(s2);

		}

		if(ae.getSource()==b4) {

			s1=t1.getText();

		    s2=s1+"4";

		    t1.setText(s2);

		}

		if(ae.getSource()==b5) {

			s1=t1.getText();

		    s2=s1+"5";

		    t1.setText(s2);

		}

		if(ae.getSource()==b6) {

			s1=t1.getText();

		    s2=s1+"6";

		    t1.setText(s2);

		}

		if(ae.getSource()==b7) {

			s1=t1.getText();

		    s2=s1+"7";

		    t1.setText(s2);

		}

		if(ae.getSource()==b8) {

			s1=t1.getText();

		    s2=s1+"8";

		    t1.setText(s2);

		}

		if(ae.getSource()==b9) {

			s1=t1.getText();

		    s2=s1+"9";

		    t1.setText(s2);

		}

		if(ae.getSource()==b10) {

			s1=t1.getText();

		    s2=s1+"0";

		    t1.setText(s2);

		}

		if(ae.getSource()==b11) {

			s1=t1.getText();

		    s2=s1+"+";

		    t1.setText(s2);

		}

		if(ae.getSource()==b12) {

			s1=t1.getText();

		    s2=s1+"-";

		    t1.setText(s2);

		}

		if(ae.getSource()==b13) {

			s1=t1.getText();

		    s2=s1+"*";

		    t1.setText(s2);

		}

		if(ae.getSource()==b14) {

			s1=t1.getText();

		    s2=s1+"/";

		    t1.setText(s2);

		}

		if(ae.getSource()==b15) {

			s1=t1.getText();

		    s2=s1+"=";

		    t1.setText(s2);

		}

		if(ae.getSource()==b16) {

		    t1.setText("");

		}	

}

}



public class CalculatorUsingPanel {

	public static void main(String[] args) {

		FrameTest f= new FrameTest();

		f.setTitle("Sample Frame");

		f.setVisible(true);

		f.setSize(400,400);

		f.setBackground(Color.white);

		f.addWindowListener(new MyClass());

	}

}

class MyClass extends WindowAdapter{

public void windowClosing(WindowEvent we) {

System.exit(0);

}

}