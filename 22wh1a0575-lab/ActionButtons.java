import java.awt.*;
import java.awt.event.*;
class MyButton1 extends Frame implements ActionListener{
	Button b1,b2,b3;
	MyButton1(){
		this.setLayout(null);
		b1=new Button("Red");
		b2=new Button("Green");
		b3=new Button("Blue");
		b1.setBounds(100,100,80,50);
		b2.setBounds(200,100,80,50);
		b3.setBounds(300,100,80,50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str=ae.getActionCommand();
		if(str.equals("Red"))
			this.setBackground(Color.red);
		if(str.equals("Green"))
			this.setBackground(Color.green);
		if(str.equals("Blue"))
			this.setBackground(Color.blue);
	}
}
public class ActionButtons {
	public static void main(String[] args) {
		MyButton1 f= new MyButton1();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.setBackground(Color.pink);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
