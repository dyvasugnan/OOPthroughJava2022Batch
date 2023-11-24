import java.awt.*;
import java.awt.event.*;

class Calc extends Frame implements ActionListener 

{
	Button b1,b2,b3,b4,b5;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	
	Calc()
	{
		this.setLayout(null);
		this.setBackground(Color.pink);
	
		b1 = new Button("ADD");
		b1.setBounds(175,500,100,50);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new Button("SUB");
		b2.setBounds(325,500,100,50);
		b2.addActionListener(this);
		this.add(b2);
	
		b3 = new Button("MUL");
		b3.setBounds(475,500,100,50);
		b3.addActionListener(this);
		this.add(b3);
	
		b4 = new Button("DIV");
		b4.setBounds(625,500,100,50);
		b4.addActionListener(this);
		this.add(b4);
		
		b5 = new Button("CLEAR");
		b5.setBounds(350,625,200,50);
		b5.addActionListener(this);
		this.add(b5);
	
		t1 = new TextField();
		t1.setBounds(500,200,100,50);
		t1.addActionListener(this);
		this.add(t1);
		
		t2 = new TextField();
		t2.setBounds(500,300,100,50);
		t2.addActionListener(this);
		this.add(t2);
		
		t3 = new TextField();
		t3.setBounds(500,400,100,50);
		t3.addActionListener(this);
		this.add(t3);
		
		l1 = new Label();
		l1.setText("NUMBER 1 : ");
		l1.setBounds(250,200,100,50);
		this.add(l1);
		
		l2 = new Label();
		l2.setText("NUMBER 2 : ");
		l2.setBounds(250,300,100,50);
		this.add(l2);
		
		l1 = new Label();
		l1.setText("RESULT : ");
		l1.setBounds(250,400,100,50);
		this.add(l1);
	}
		
	public void actionPerformed(ActionEvent ae) {
		double num1 = Double.parseDouble(t1.getText());
		double num2 = Double.parseDouble(t2.getText());
		double result = 0;
	
		if(ae.getSource()==b1) {
			result = num1 + num2;
		}
		else if(ae.getSource()==b2) {
			result = num1 - num2;
		}
		else if(ae.getSource()==b3) {
			result = num1 * num2;
		}
		else if(ae.getSource()==b4) {
			result = num1 / num2;
		}
		else if(ae.getSource()==b5) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		t3.setText(String.valueOf(result));
	}
}

public class SimpleCalc {
	public static void main(String args[]) {
		Calc c = new Calc();
		c.setTitle("Simple Calculator");
		c.setVisible(true);
		c.setSize(800,800);
		c.addWindowListener(new CalcClass());
	}
}

class CalcClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
}
