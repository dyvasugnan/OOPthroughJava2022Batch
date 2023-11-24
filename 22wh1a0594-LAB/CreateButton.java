package cseb;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener {
	Button b1,b2,b3;
	MyButton(){
		this.setLayout(null);
		b1 = new Button("Red");
		b2 = new Button("Green");
		b3 = new Button("Blue");
		b1.setBounds(300, 700, 70, 30);
		b2.setBounds(400, 700, 70, 30);
		b3.setBounds(500, 700, 70, 30);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);   //to perform any action with the button we use this listener called action listene
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str,str1,str2
		str = b1.getActionCommand();
		str1 = b2.getActionCommand();
		str2 = b3.getActionCommand();
		if(str.equals("Red")) {
			this.setBackground(Color.green);
		}
		if(str1.equals("Green")) {
			this.setBackground(Color.blue);
		}
		if(str2.equals("Blue")) {
			this.setBackground(Color.red);
		}
	}
}
public class SecGui {
	public static void main(String[] args) {
		MyButton f = new MyButton();
			f.setVisible(true); // to make the window visible we write this 
			f.setSize(800,800); // Here in the window we can use minimize and maximize but the close funtion wont be working 
			f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);         // to close the window we wrote the sub class
	}
}
