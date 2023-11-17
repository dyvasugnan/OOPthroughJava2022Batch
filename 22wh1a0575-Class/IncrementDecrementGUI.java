package frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyButtons extends Frame implements ActionListener{
	Button b1,b2,b3;
	TextField t1;
	Label l1;
	MyButtons(){
		this.setLayout(null);
		l1=new Label("Counter");
		b1=new Button("Up");
		b2=new Button("Down");
		b3=new Button("Clear");
		t1=new TextField(15);
		
		l1.setBounds(100,100,100,40);
		t1.setBounds(200,100,80,30);
		b1.setBounds(60,250,80,30);
		b2.setBounds(150,250,80,30);
		b3.setBounds(250,250,80,30);
		
		this.add(l1);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(t1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		String str;
		str=ae.getActionCommand();
		int counter=Integer.parseInt(t1.getText());
		if(str.equals("Up")) {
			counter++;
			t1.setText(String.valueOf(counter));
		}
		if(str.equals("Down")) {
			counter--;
			if(counter>=0){
				t1.setText(String.valueOf(counter));
			}
			else {
				JOptionPane.showMessageDialog(this, "Counter is negative",
                        "MESSAGE WARNING", JOptionPane.WARNING_MESSAGE);
			}
		}
		if(str.equals("Clear")) {
			t1.setText("");
		}
	}
}
public class IncrementDecrement {
	public static void main(String[] args) {
		MyButtons f= new MyButtons();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.setBackground(Color.white);
		f.addWindowListener(new MyClass1());
	}
}
class MyClass1 extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
}
}