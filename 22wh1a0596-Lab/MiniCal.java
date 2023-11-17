package pranavi596;
import java.awt.*;
import java.awt.event.*;
class Mybutton1 extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Mybutton1(){
		this.setLayout(null);
	b1 = new Button("ADD");
	b2 = new Button("SUB");
	b3 = new Button("MUL");
	b4 = new Button("Div");
	b5 = new Button("Clear");
	t1 = new TextField(50);
	t2 = new TextField(50);
	t3 = new TextField(50);
	l1 = new Label("Number 1");
	l2 = new Label("Number 2");
	l3 = new Label("Result");
	b1.setBounds(100, 600, 50, 50);
	b2.setBounds(200, 600, 50, 50);
	b3.setBounds(300, 600, 50, 50);
	b4.setBounds(400, 600, 50, 50);
	b5.setBounds(500, 600, 50, 50);
	t1.setBounds(300, 100, 300, 50);
	t2.setBounds(300, 200, 300, 50);
	t3.setBounds(300, 300, 300, 50);
	l1.setBounds(200, 100, 300, 50);
	l2.setBounds(200, 200, 300, 50);
	l3.setBounds(200, 300, 300, 50);
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
	t1.addActionListener(this);
	t2.addActionListener(this);
	t3.addActionListener(this);
	}
public int Add(int x,int y) {
	return x + y;
}
public int Sub(int n1,int n2) {
	return n1 - n2;
}
public int Mul(int n1,int n2) {
	return n1 * n2;
}
public int Div(int n1,int n2) {
	return n1 / n2;
}
public void actionPerformed(ActionEvent ae) {
	String str;
	int n1 = Integer.parseInt(t1.getText());
	int n2 = Integer.parseInt(t2.getText());
	str = ae.getActionCommand();
	if(str.equals("ADD")) {
		String num = Integer.toString(Add(n1,n2));
		t3.setText(num);
	}
	if(str.equals("SUB")) {
		String num = Integer.toString(Sub(n1,n2));
		t3.setText(num);
	}
	if(str.equals("MUL")) {
		String num = Integer.toString(Mul(n1,n2));
		t3.setText(num);
	}
	if(str.equals("Div")) {
		String num = Integer.toString(Div(n1,n2));
		t3.setText(num);
	}
	if(str.equals("Clear")){
		t1.setText("");
		t2.setText("");
		t3.setText("");
	}
}
}
public class MiniCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybutton1 g1 = new Mybutton1();
		g1.setTitle("Calculator");
		g1.setVisible(true);
		g1.setSize(800,800);
		g1.setBackground(Color.pink);
		g1.addWindowListener(new Demo());
	}

}
class Demo extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

