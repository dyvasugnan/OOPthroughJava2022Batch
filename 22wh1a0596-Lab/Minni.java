package cseb596;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Mybutton12 extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5;
	Label l1,l2,l3;
	TextField t1;
	Mybutton12(){
	this.setLayout(null);
	b1 = new Button("+");
	b2 = new Button("-");
	b3 = new Button("*");
	b4 = new Button("/");
	b5 = new Button("=");
	t1 = new TextField(50);
	l1=new Label("result");
	b1.setBounds(100, 600, 50, 50);
	b2.setBounds(200, 600, 50, 50);
	b3.setBounds(300, 600, 50, 50);
	b4.setBounds(400, 600, 50, 50);
	b5.setBounds(500, 600, 50, 50);
	t1.setBounds(300,100,300,50);
	l1.setBounds(200,100, 300,50);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	this.add(t1);
	this.add(l1);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	t1.addActionListener(this);
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
	String tf = t1.getText();
	str = ae.getActionCommand();
	if(str.equals("+")) {
		tf = tf.concat("+");
		t1.setText(tf);
	}
	if(str.equals("-")) {
		tf = tf.concat("-");
		t1.setText(tf);
	}
	if(str.equals("*")) {
		tf = tf.concat("*");
		t1.setText(tf);
	}
	if(str.equals("/")) {
		tf = tf.concat("/");
		t1.setText(tf);
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
			double result = n1 + n2;
			t1.setText(Double.toString(result));
		}
		if(op == '-') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double result = n1 - n2;
			t1.setText(Double.toString(result));
		}
		if(op == '*') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double result = n1 * n2;
			t1.setText(Double.toString(result));
		}
		if(op == '/') {
			double n1 = Double.parseDouble(String.valueOf(c1));
			double n2 = Double.parseDouble(String.valueOf(c3));
			double result = n1 / n2;
			t1.setText(Double.toString(result));
		}
		
		
	}
}
}
public class Minni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybutton12 g1 = new Mybutton12();
		g1.setTitle("Calculator");
		g1.setVisible(true);
		g1.setSize(800,800);
		g1.setBackground(Color.pink);
		g1.addWindowListener(new Demo1());
	}

}
class Demo1 extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
