package cseb;
import java.awt.*;
import java.awt.event.*;
class MyButton3 extends Frame implements ActionListener{

	Button b1,b2,b3,b4,b5;

	TextField t1,t2,t3;

	Label l1,l2,l3;

	int n1,n2,r;

	MyButton3(){

		this.setLayout(null);

		b1 = new Button("+");

		b2 = new Button("-");

		b3 = new Button("*");

		b4 = new Button("/");

		b5 = new Button("Clear");

		t1 = new TextField(50);

		t2 = new TextField(50);

		t3 = new TextField(50);

		l1 = new Label("Num1");

		l2 = new Label("Num2");

		l3 = new Label("Result");

		b1.setBounds(200,400,30,30);

		b2.setBounds(240,400,30,30);

		b3.setBounds(280,400,30,30);

		b4.setBounds(320,400,30,30);

		b5.setBounds(360,400,50,30);

		t1.setBounds(250,50,300,30);

		t2.setBounds(250,100,300,30);

		t3.setBounds(250,150,300,30);

		l1.setBounds(50,50,100,30);

		l2.setBounds(50,100,100,30);

		l3.setBounds(50,150,100,30);

		this.add(b1);

		this.add(b2);

		this.add(b3);

		this.add(b4);

		this.add(b5);

		this.add(t1);

		this.add(t2);

		this.add(t3);

		this.add(l1);

		this.add(l2);

		this.add(l3);

		b1.addActionListener(this);

		b2.addActionListener(this);

		b3.addActionListener(this);

		b4.addActionListener(this);

		b5.addActionListener(this);

	}

		public void actionPerformed(ActionEvent ae) {

			String str;

			str = ae.getActionCommand();

			if(str.equals("+")) {

				n1=Integer.parseInt(t1.getText());

				n2=Integer.parseInt(t2.getText());

				r=n1+n2;

				t3.setText(Integer.toString(r));

			}

			if(str.equals("-")) {

				n1=Integer.parseInt(t1.getText());

				n2=Integer.parseInt(t2.getText());

				r=n1-n2;

				t3.setText(Integer.toString(r));

				

			}

			if(str.equals("*")) {

				n1=Integer.parseInt(t1.getText());

				n2=Integer.parseInt(t2.getText());

				r=n1*n2;

				t3.setText(Integer.toString(r));

			}

			if(str.equals("/")) {

				n1=Integer.parseInt(t1.getText());

				n2=Integer.parseInt(t2.getText());

				r=n1/n2;

				t3.setText(Integer.toString(r));

			}

			if(str.equals("Clear")) {

				t1.setText("");

				t2.setText("");

				t3.setText("");

			}

		}

}

public class Calculator {

	public static void main(String[] args) {

		MyButton3 f = new MyButton3();

		f.setTitle("Calculator");

		f.setVisible(true);

		f.setSize(600,600);

		f.setBackground(Color.pink);

		f.addWindowListener(new MyClass5());

	}

}

class MyClass5 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}