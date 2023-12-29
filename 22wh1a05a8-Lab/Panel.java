package cseb225a8;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 
import java.util.StringTokenizer;
class Calc1 extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextArea t1;
	Panel p;
	int num1,num2,res;
	Calc1(){
		setLayout(new BorderLayout());
		t1 = new TextArea(3,5);
		add(t1,BorderLayout.NORTH);
		p = new Panel(new GridLayout(4,4));
		add(p);
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
		b15 = new Button("Clear");
		b16 = new Button("=");
		b1.setBounds(50, 100, 60, 30);
		b2.setBounds(120, 100, 60, 30);
		b3.setBounds(190, 100, 60, 30);
		b4.setBounds(260, 100, 60, 30);
		b5.setBounds(50, 150, 60, 30);
		b6.setBounds(120, 150, 60, 30);
		b7.setBounds(190, 150, 60, 30);
		b8.setBounds(260, 150, 60, 30);
		b9.setBounds(50, 200, 60, 30);
		b10.setBounds(120, 200, 60, 30);
		b11.setBounds(190, 200, 60, 30);
		b12.setBounds(260, 200, 60, 30);
		b13.setBounds(50, 250, 60, 30);
		b14.setBounds(120, 250, 60, 30);
		b15.setBounds(190, 250, 60, 30);
		b16.setBounds(260, 250, 60, 30);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b10);
		this.add(b11);
		this.add(b12);
		this.add(b13);
		this.add(b14);
		this.add(b15);
		this.add(b16);
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
		String s1,s2;
		if(ae.getSource()==b1) {
			s1 = t1.getText();
			s2 = s1 + "1";
			t1.setText(s2);
		}
		if(ae.getSource()==b2) {
			s1 = t1.getText();
			s2 = s1 + "2";
			t1.setText(s2);
		}
		if(ae.getSource()==b3) {
			s1 = t1.getText();
			s2 = s1 + "3";
			t1.setText(s2);
		}
		if(ae.getSource()==b4) {
			s1 = t1.getText();
			s2 = s1 + "4";
			t1.setText(s2);
		}
		if(ae.getSource()==b5) {
			s1 = t1.getText();
			s2 = s1 + "5";
			t1.setText(s2);
		}
		if(ae.getSource()==b6) {
			s1 = t1.getText();
			s2 = s1 + "6";
			t1.setText(s2);
		}
		if(ae.getSource()==b7) {
			s1 = t1.getText();
			s2 = s1 + "7";
			t1.setText(s2);
		}
		if(ae.getSource()==b8) {
			s1 = t1.getText();
			s2 = s1 + "8";
			t1.setText(s2);
		}
		if(ae.getSource()==b9) {
			s1 = t1.getText();
			s2 = s1 + "9";
			t1.setText(s2);
		}
		if(ae.getSource()==b10) {
			s1 = t1.getText();
			s2 = s1 + "0";
			t1.setText(s2);
		}
		if(ae.getSource()==b11) {
			s1 = t1.getText();
			s2 = s1 + "+";
			t1.setText(s2);
		}
		if(ae.getSource()==b12) {
			s1 = t1.getText();
			s2 = s1 + "-";
			t1.setText(s2);
		}
		if(ae.getSource()==b13) {
			s1 = t1.getText();
			s2 = s1 + "*";
			t1.setText(s2);
		}
		if(ae.getSource()==b14) {
			s1 = t1.getText();
			s2 = s1 + "/";
			t1.setText(s2);
		}
		if(ae.getSource()==b15) {
			s1 = t1.getText();
			s2 = s1 + "Clear";
			t1.setText(s2);
		}
		if(ae.getSource()==b16) {
			s1 = t1.getText();
			s2 = s1 + "=";
			t1.setText(s2);
		}
	}
}
public class Panel {
	public static void main(String[] args) {
		Calc1 f = new Calc1();
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
