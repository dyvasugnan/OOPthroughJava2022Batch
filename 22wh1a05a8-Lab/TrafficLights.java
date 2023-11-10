package cseb225a8;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyButton1 extends Frame implements ActionListener{
	Button b1,b2,b3;
	TextField t1,t2,t3,t4,t5;
	MyButton1(){
		this.setLayout(null);
		b1 = new Button("Red");
		b2 = new Button("Green");
		b2 = new Button("Blue");
		b1.setBounds(100,100,100,50);
		b2.setBounds(200,100,100,50);
		b3.setBounds(250,100,100,50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str = b1.getActionCommand();
		if(str.equals("Blue"))
			this.setBackground(Color.blue);
	}
}
public class StudentRegistrationForm1 {
	public static void main(String[] args) {
		MyButton1 f = new MyButton1();
		f.setTitle("Student Registration Form");
		f.setVisible(true);
		f.setSize(500,500);
		f.addWindowListener(new MyClass());
	}
}
class MyClass1 extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
