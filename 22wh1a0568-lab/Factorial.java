package cseb;
import java.awt.*;
import java.awt.event.*;

class Fact extends Frame implements ActionListener{
	Button compute,clear;
	TextField t1,t2;
	Label number,factorial;
	Fact(){
		this.setLayout(null);
		compute = new Button("Compute");
		clear = new Button("Clear");
		t1 = new TextField(20);
		t2 = new TextField(20);
		number = new Label("Number:");
		factorial = new Label("Factorial:");
		t1.setBounds(200,100,100,50);
		t2.setBounds(200,200,150,50);
		compute.setBounds(100,300,100,50);
		clear.setBounds(300,300,100,50);
		number.setBounds(50,100,100,50);
		factorial.setBounds(50,200,100,50);
		this.add(compute);this.add(clear);
		this.add(t1);this.add(t2);
		this.add(number);this.add(factorial);
		compute.addActionListener(this);
		clear.addActionListener(this);
		this.setBackground(Color.darkGray);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("Compute")) {
			double n = Double.parseDouble(this.t1.getText());
			double fact = 1;
			while (n>0) {
				fact *= n;
				n = n-1;
			}
			t2.setText(String.valueOf(fact));
		}
		if(str.equals("Clear")) {
			t1.setText("");
			t2.setText("");
		}
	}
}


public class Factorial {
	public static void main(String[] args) {
		Frame f = new Fact();
		  f.setTitle("Factorial");
		  f.setVisible(true);
		  f.setSize(500, 500);
		  f.addWindowListener(new MyClass2());
	}
}
class MyClass2 extends WindowAdapter{
public void windowClosing(WindowEvent we) {
	System.exit(0);
	}
}