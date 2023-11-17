package Gui2;

import java.awt.*;
import java.awt.event.*;
class MyButton2 extends Frame implements ActionListener{
	Button b ;
	TextField t ;
	MyButton2(){
		this.setLayout(null);
        b =new Button("Set");
        t =new TextField(30);
        t.setBounds(100,100,100,50);
        b.setBounds(200,200,50,20);
        this.add(b);
        this.add(t);
        b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str =ae.getActionCommand();
		if(str.equals("Set")) {
			t.setText("welcome");}
		}
	}
public class SetFram {
	public static void main(String[] args) {
		MyButton2 f=new MyButton2();
		f.setVisible(true);
		f.setSize(600,600);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
public void windowClosing(WindowEvent we) {
	System.exit(0);
	}
}