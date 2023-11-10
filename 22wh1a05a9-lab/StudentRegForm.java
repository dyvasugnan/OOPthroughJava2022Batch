package cse5a9;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyButton extends Frame implements ActionListener{
	Button b1,b2;
	MyButton(){
		this.setLayout(null);
		b1=new Button("Red");
		b2=new Button("Green");
		b1.setBounds(100,700,100,20);
		b2.setBounds(300,700,100,20);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		//b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str=b1.getActionCommand();
		if(str.equals("Blue"))
			this.setBackground(Color.blue);
	}
}

public class ButtonAction {
	public static void main(String[] args) {
		//Frame f=new Frame("sample");
		MyButton f=new MyButton();
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void WindowClosing(WindowEvent We) {
		System.exit(0);
	}
}

