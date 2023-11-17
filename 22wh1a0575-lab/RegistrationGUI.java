package GUI;

import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener{
	Button b1,b2;
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4,l5;
	Checkbox c1,c2,c3;
	MyButton(){
		this.setLayout(null);
		b1=new Button("SAVE ");
		b2=new Button("CLEAR ALL");
		l1=new Label("Name");
		l2=new Label("Age");
		l3=new Label("Father Name");
		l4=new Label("Address");
		l5=new Label("Languages known");
		t1=new TextField(15);
		t2=new TextField(30);
		t3=new TextField(45);
		t4=new TextField(60);
		
		b1.setBounds(400,600,80,30);
		b2.setBounds(600,600,80,30);
		l1.setBounds(100,130,100,20);
		l2.setBounds(100,180,100,20);
		l3.setBounds(100,230,100,20);
		l4.setBounds(100,280,100,20);
		l5.setBounds(100,400,100,20);
		t1.setBounds(400,130,250,20);      //name text field
		t2.setBounds(400,180,250,20);      //age text field
		t3.setBounds(400,230,250,20);     //Father Name text field
		t4.setBounds(400,280,250,40);
		
		this.add(b1);
		this.add(b2);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		
		c1=new Checkbox("Hindi");
		c1.setBounds(400,400,50,20);
		c1.setBackground(Color.pink);
		c2=new Checkbox("Telugu");
		c2.setBounds(500,400,50,20); 
		c2.setBackground(Color.pink);
		c3=new Checkbox("English");
		c3.setBounds(600,400,50,20);
		c3.setBackground(Color.pink);
		this.add(c1);
		this.add(c2);
		this.add(c3);

        b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str=ae.getActionCommand();
		if(str.equals("CLEAR ALL")) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
	}
	public void paint(Graphics g) { 
		Font f1=new Font ("Arial",Font.BOLD,40);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("REGISTRATION FORM", 300, 80);
	}
}
public class Registration {
	public static void main(String[] args) {
		MyButton f= new MyButton();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(1600,1600);
		f.setBackground(Color.pink);
		f.addWindowListener(new MyClass());	
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}