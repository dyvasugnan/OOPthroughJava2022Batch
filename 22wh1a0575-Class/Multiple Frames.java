package JAVA;
import java.awt.*;
import java.awt.event.*;

class FirstFrame extends Frame implements ActionListener{
	TextField t1,t2;
	Label l1,l2,l3,l4,l5,l6;
	Button b1,b2;
	FirstFrame(){
		t1=new TextField(10);
		t2=new TextField(20);
		l1=new Label("Username");
		l2=new Label("Password");
		l3=new Label("Username");
		l5=new Label();
		l4=new Label("Password");
		l6=new Label();
		b1=new Button("Submit");
		b2=new Button("Next");
		this.add(t1);
		this.add(t2);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(b1);
		this.add(b2);
		t2.setEchoChar('*');
		l1.setBounds(100, 100, 100, 30);
		l2.setBounds(100, 200, 100, 30);
		l3.setBounds(100, 400, 100, 30);
        l4.setBounds(100, 500, 100, 30);
        l5.setBounds(250, 400, 100, 30);
        l6.setBounds(250, 500, 100, 30);
		t1.setBounds(250, 100, 100, 30);
		t2.setBounds(250, 200, 100, 30);
		b1.setBounds(200, 300, 100, 30);
        b2.setBounds(350, 200, 100, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			l5.setText(t1.getText());
			l6.setText(t2.getText());
		}
		if (ae.getSource() == b2) {
            SecondFrame f1 = new SecondFrame();
            f1.setSize(400, 400);
            f1.setVisible(true);
        }
	}
}
class MultipleFrames {
	public static void main(String[] args) {
		FirstFrame f=new FirstFrame();
		f.setSize(700,700);
		f.setVisible(true);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}


package JAVA;
import java.awt.*;
import java.awt.event.*;

class SecondFrame extends Frame implements ActionListener{
	Button b3,b4;
	SecondFrame() {
        b3 = new Button(" Next ");
        b4 = new Button("Close");
        this.add(b3);
        this.add(b4);
        b3.setBounds(150, 130, 100, 30);
        b4.setBounds(100, 200, 100, 30);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
	public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b3) {
            ThirdFrame f2 = new ThirdFrame();
            f2.setSize(400, 400);
            f2.setVisible(true);
        }
        if (ae.getSource() == b4) {
            System.exit(1);
        }
    }

}


package JAVA;

import java.awt.*;
import java.awt.event.*;

public class ThirdFrame extends Frame implements ActionListener {
    Label l1;
    Button b1;

    ThirdFrame() {
        l1 = new Label("Hello");
        b1 = new Button("Exit");

        this.add(l1);
        this.add(b1);

        l1.setBounds(170, 150, 70, 30);
        b1.setBounds(90, 300, 70, 30);
        l1.setForeground(Color.blue);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            System.exit(1);
        }
    }
}