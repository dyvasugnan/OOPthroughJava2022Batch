package cseb596;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Mybutton1 extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	Label l1,l2,l3;
	TextArea t1;
	Mybutton1(){
	this.setLayout(new BorderLayout());
	Panel p = new Panel(new GridLayout(4,4));
	b1 = new Button("1");
	b2 = new Button("2");
	b3 = new Button("3");
	b4 = new Button("4");
	b5 = new Button("5");
	b6 = new Button("6");
	b7 = new Button("7");
	b8 = new Button("8");
	b9 = new Button("9");
	b10 = new Button("0");
	b11 = new Button("+");
	b12 = new Button("-");
	b13 = new Button("*");
	b14 = new Button("/");
	b15 = new Button("=");
	b16 = new Button("C");
	t1 = new TextArea(3,5);
	/*b1.setBounds(100, 600, 50, 50);
	b2.setBounds(200, 600, 50, 50);
	b3.setBounds(300, 600, 50, 50);
	b4.setBounds(400, 600, 50, 50);
	b5.setBounds(500, 600, 50, 50);*/
	this.add(t1,BorderLayout.NORTH);
	this.add(p);
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
	//t1.addActionListener(this);
	}
public double Add(double x,double y) {
	return x + y;
}
public double Sub(double n1,double n2) {
	return n1 - n2;
}
public double Mul(double n1,double n2) {
	return n1 * n2;
}
public double Div(double n1,double n2) {
	return n1 / n2;
}
public void actionPerformed(ActionEvent ae) {
	String str;
	str = ae.getActionCommand();
	String s1,s2;
	if(ae.getSource() == b1) {
		s1 = t1.getText();
		s2 = s1 + "1";
		t1.setText(s2);
	}
	if(ae.getSource() == b2) {
		s1 = t1.getText();
		s2 = s1 + "2";
		t1.setText(s2);
	}
	if(ae.getSource() == b3) {
		s1 = t1.getText();
		s2 = s1 + "3";
		t1.setText(s2);
	}
	if(ae.getSource() == b4) {
		s1 = t1.getText();
		s2 = s1 + "4";
		t1.setText(s2);
	}
	if(ae.getSource() == b5) {
		s1 = t1.getText();
		s2 = s1 + "5";
		t1.setText(s2);
	}
	if(ae.getSource() == b6) {
		s1 = t1.getText();
		s2 = s1 + "6";
		t1.setText(s2);
	}
	if(ae.getSource() == b7) {
		s1 = t1.getText();
		s2 = s1 + "7";
		t1.setText(s2);
	}
	if(ae.getSource() == b8) {
		s1 = t1.getText();
		s2 = s1 + "8";
		t1.setText(s2);
	}
	if(ae.getSource() == b9) {
		s1 = t1.getText();
		s2 = s1 + "9";
		t1.setText(s2);
	}
	if(ae.getSource() == b10) {
		s1 = t1.getText();
		s2 = s1 + "0";
		t1.setText(s2);
	}
	String tf1 = t1.getText();
	if(str.equals("+")) {
		tf1 = tf1.concat("+");
		t1.setText(tf1);
	}
	if(str.equals("-")) {
		tf1 = tf1.concat("-");
		t1.setText(tf1);
	}
	if(str.equals("*")) {
		tf1 = tf1.concat("*");
		t1.setText(tf1);
	}
	if(str.equals("/")) {
		tf1 = tf1.concat("/");
		t1.setText(tf1);
	}
	if(str.equals("=")){
		String s = t1.getText();
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		char c3 = s.charAt(2);
		char op = c2;
		if(op == '+') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double res = n1 + n2;
			t1.setText(Double.toString(res));
		}
		if(op == '-') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double res = n1 - n2;
			t1.setText(Double.toString(res));
		}
		if(op == '*') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double res = n1 * n2;
			t1.setText(Double.toString(res));
		}
		if(op == '/') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double res = n1 / n2;
			t1.setText(Double.toString(res));
		}
}
}
}
public class MiniCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybutton1 g1 = new Mybutton1();
		g1.setTitle("Calculator");
		g1.setVisible(true);
		g1.setSize(500,500);
		g1.setBackground(Color.pink);
		g1.addWindowListener(new Demo());
	}

}

class Demo extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
