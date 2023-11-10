package cseB22WH1A05B7;
import java.awt.*;
import java.awt.event.*;
//creating a Button
class MyButton extends Frame{
	Button b1,b2;
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4,l5,l6,l7,la;
	
	MyButton(){
		this.setLayout(null);
		la=new Label("Regestration Form");
		b1=new Button("SAVE");
		b2=new Button("UPDATE");
		l1=new Label("Name");
		t1=new TextField();
		l2=new Label("Father Name");
		t2=new TextField(30);
		l3=new Label("Age");
		t3=new TextField();
		l4=new Label("Gender");
		
		l5=new Label("Course");
		
		l6=new Label("Hobbies");
		
		l7=new Label("Address");
		t4=new TextField();
		Font f=new Font("TimesRoman",Font.BOLD,25);
		la.setFont(f);
		la.setForeground(Color.RED);
		la.setBackground(Color.gray);
		la.setBounds(600,90,300,40);
		b1.setBounds(500,700,100,40);
		b2.setBounds(700,700,100,40);
		l1.setBounds(500,150,100,40);
		t1.setBounds(700,150,300,40);
		l2.setBounds(500,200,100,40);
		t2.setBounds(700,200,300,40);
		l3.setBounds(500,250,100,40);
		t3.setBounds(700,250,300,40);
		l4.setBounds(500,300,100,40);
		l5.setBounds(500,350,100,40);
		
		l6.setBounds(500,400,100,40);
		
		l7.setBounds(500,450,100,40);
		t4.setBounds(700,450,300,100);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(l1);
		this.add(t2);
		this.add(l2);
		this.add(t3);
		this.add(l3);
		this.add(t4);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(l7);
		this.add(t4);
		this.add(la);
	
		Checkbox c1=new Checkbox("Female",true);
		Checkbox c2=new Checkbox("Male");
		c1.setBounds(700,300,70,40);
		c2.setBounds(900,300,70,40);
		this.add(c1);
		this.add(c2);
		Checkbox c3=new Checkbox("Drawing",true);
		Checkbox c4=new Checkbox("Reading");
		Checkbox c5=new Checkbox("Dancing");
		c3.setBounds(700,400,70,40);
		c4.setBounds(800,400,70,40);
		c5.setBounds(900,400,70,40);
		this.add(c3);
		this.add(c4);
		this.add(c5);
	}
}
public class RegestrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton f=new MyButton();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass());
	}

}
class MyClass extends WindowAdapter{
	public void WindowClosing(WindowEvent we) {
		System.exit(0);
	}
}