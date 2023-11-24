package cseb225a8;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 
import java.util.StringTokenizer;
class Calc extends Frame implements ActionListener{
	Button calc,clr;
	TextField num;
	Calc(){
		this.setLayout(null);
		calc = new Button("Calculate");
		clr = new Button("Clear");
		num = new TextField();
		calc.setBounds(100,200,100,20);
		clr.setBounds(200,200,100,20);
		num.setBounds(200,40,100,20);
		this.add(calc);
		this.add(clr);
		this.add(num);
		calc.addActionListener(this);
		clr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("Calculate")) {
			String str1;
			str1 = num.getText();
			StringTokenizer br = new StringTokenizer(str1," ");
			String s1 = br.nextToken();
			int n1 = Integer.parseInt(s1);
			String s = br.nextToken();
			String s2 = br.nextToken();
			int n2 = Integer.parseInt(s2);
			if(s.equals("+")) {
				int res = n1+n2;
				String r1 = Integer.toString(res);
				num.setText(r1);
			}
			if(s.equals("-")) {
				int res = n1-n2;
				String r2 = Integer.toString(res);
				num.setText(r2);
			}
			if(s.equals("*")) {
				int res = n1*n2;
				String r2 = Integer.toString(res);
				num.setText(r2);
			}
			if(s.equals("/")) {
				int res = n1/n2;
				String r2 = Integer.toString(res);
				num.setText(r2);
			}
		}
		if(str.equals("Clear")) {
			num.setText(null);
		}
		
	}
	public void paint(Graphics g) {
		g.drawString("Num", 100, 50);
	}
}
public class CalculatorGui1 {
	public static void main(String[] args) {
		Calc f = new Calc();
		f.setTitle("Calculator");
		f.setVisible(true);
		f.setSize(500,500);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
