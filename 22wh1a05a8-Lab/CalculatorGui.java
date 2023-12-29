package cseb225a8;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calc extends Frame implements ActionListener{
	Button a,s,m,d,clr;
	TextField num1,num2,r;
	Calc(){
		this.setLayout(null);
		a = new Button("Add");
		s = new Button("Substract");
		m = new Button("Multiply");
		d = new Button("Divide");
		clr = new Button("Clear");
		num1 = new TextField();
		num2 = new TextField();
		r = new TextField();
		a.setBounds(100,200,100,20);
		s.setBounds(200,200,100,20);
		m.setBounds(300,200,100,20);
		d.setBounds(100,250,100,20);
		clr.setBounds(200,250,100,20);
		num1.setBounds(200,40,100,20);
		num2.setBounds(200,80,100,20);
		r.setBounds(350,65,100,20);
		this.add(a);
		this.add(s);
		this.add(m);
		this.add(d);
		this.add(clr);
		this.add(num1);
		this.add(num2);
		this.add(r);
		a.addActionListener(this);
		s.addActionListener(this);
		m.addActionListener(this);
		d.addActionListener(this);
		clr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str = ae.getActionCommand();
		if(str.equals("Add")) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			int res = n1+n2;
			String s = Integer.toString(res);
			r.setText(s);
		}
		if(str.equals("Substract")) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			int res = n1-n2;
			String s = Integer.toString(res);
			r.setText(s);
		}
		if(str.equals("Multiply")) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			int res = n1*n2;
			String s = Integer.toString(res);
			r.setText(s);
		}
		if(str.equals("Divide")) {
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			try{
				int res = n1/n2;
				String s = Integer.toString(res);
				r.setText(s);
			}
			catch(ArithmeticException ae1){
				r.setText("Arithmetic Exception");
			}
		}
		if(str.equals("Clear")) {
			num1.setText(null);
			num2.setText(null);
			r.setText(null);
		}
	}
	public void paint(Graphics g) {
		g.drawString("Num1", 100, 50);
		g.drawString("Num2", 100, 100);
		g.drawString("Result", 300, 75);
	}
}
public class CalculatorGui {
	public static void main(String[] args) {
		Calc f = new Calc();
		f.setTitle("Calculator");
		f.setVisible(true);
		f.setSize(500,500);
		f.addWindowListener(new MyClass());
	}
}
