import java.util.*;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
	MyButton(){
		this.setLayout(null);
		t1=new TextField(100);
		t2=new TextField(100);
		t1.setBounds(150,50,100,50);
		t2.setBounds(150,100,100,50);
		this.add(t1);
		this.add(t2);
		t1.addActionListener(this);
		t2.addActionListener(this);
		b1 = new Button("Compute");
		b2 = new Button("Clear");
		b1.setBounds(50,200,100,50);
		b2.setBounds(200,200,100,50);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);     
		b2.addActionListener(this);
		l1 = new Label("Number");
		l2 = new Label("Fact");
		this.add(l1);
		this.add(l2);
		l1.setBounds(50,50,100,50);
		l2.setBounds(50,100,100,50);
	}
	public void actionPerformed(ActionEvent ae) { 
		b1.getActionCommand();
	}

}

public class First {
	public static void main(String[] args) {
		MyButton f = new MyButton();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new Demo());
	}

}
class Demo extends WindowAdapter
{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}