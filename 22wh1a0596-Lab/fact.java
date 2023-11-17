package pranavi596;
import java.awt.*;
import java.awt.event.*;
class Mybuttongu extends Frame implements ActionListener{
	Button b1,b2;
	Label l1,l2;
	TextField t1,t2;
	Mybuttongu(){
		this.setLayout(null);
	b1 = new Button("Comp");
	b2 = new Button("Clear");
	t1 = new TextField(50);
	t2 = new TextField(50);
	l1 = new Label("Number");
	l2 = new Label("Factorial");
	b1.setBounds(200, 600, 100, 50);
	b2.setBounds(500, 600, 100, 50);
	t1.setBounds(300, 100, 300, 50);
	t2.setBounds(300, 200, 300, 50);
	l1.setBounds(200, 100, 300, 50);
	l2.setBounds(200, 200, 300, 50);
	this.add(b1);
	this.add(b2);
	this.add(t1);
	this.add(t2);
	this.add(l1);
	this.add(l2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	}
public int Calculate(int n) {
	if(n>=1) {
		return n*Calculate(n-1);
	}
	return 1;
}
public void actionPerformed(ActionEvent ae) {
	String str;
	int n = Integer.parseInt(t1.getText());
	str = ae.getActionCommand();
	if(str.equals("Comp")) {
		String num = Integer.toString(Calculate(n));
		t2.setText(num);
	}
	if(str.equals("Clear")){
		t1.setText("");
		t2.setText("");
	}
}
}
public class Mybutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybuttongu f = new Mybuttongu();
		f.setTitle("Calculate factorial");
		f.setVisible(true);
		f.setSize(800,800);
		f.setBackground(Color.pink);
		f.addWindowListener(new MyClass());
	}

}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

