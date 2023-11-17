package cseb225a8;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Fact extends Frame implements ActionListener{
	Button calc,clr;
	TextField num,fact;
	Fact(){
		this.setLayout(null);
		calc = new Button("Calculate");
		clr = new Button("Clear");
		num = new TextField();
		fact = new TextField();
		calc.setBounds(150,400,100,20);
		clr.setBounds(250,400,100,20);
		num.setBounds(200,50,100,20);
		fact.setBounds(200,100,100,20);
		this.add(calc);
		this.add(clr);
		this.add(num);
		this.add(fact);
	}
	public void paint(Graphics g) {
		g.drawString("Number", 100, 50);
		g.drawString("Factorial", 100, 100);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str = ae.getActionCommand();
		if(str.equals("Add")) {
			int n = Integer.parseInt(num.getText());
			int x = 1;
			for(int i=1;i<=n;i++)
				x = x*i;
			String s = Integer.toString(x);
			fact.setText(s);
		}
		if(str.equals("Clear")) {
			num.setText(null);
			fact.setText(null);
		}
	}
}
public class FactorialGui {
	public static void main(String[] args) {
		Fact f = new Fact();
		f.setTitle("Student Registration Form");
		f.setVisible(true);
		f.setSize(500,500);
		f.addWindowListener(new MyClass1());
	}
}
