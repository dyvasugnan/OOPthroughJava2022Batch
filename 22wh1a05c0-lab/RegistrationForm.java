package cseb;

import java.awt.*;

import java.awt.event.*;

class MyButton extends Frame{

	Button b1,b2;

	Label l1,l2,l3,l4,l5,l6,l7;

	TextField t1,t2,t3,t4,t5;

	MyButton(){

		this.setLayout(null);

		b1=new Button("save");

		b2=new Button("update");

		t1=new TextField();

		t2=new TextField(30);

		t3=new TextField(35);

		t4=new TextField(40);

		t5=new TextField(45);

		

		

		l1=new Label();

		l1.setText("Name");

		l1.setBounds(100,100,70,70);

		

		l2=new Label();

		l2.setText("Father Name");

		l2.setBounds(100,150,80,70);

		

		l3=new Label();

		l3.setText("Mother Name");

		l3.setBounds(100,200,80,70);

		

		l4=new Label();

		l4.setText("Age");

		l4.setBounds(100,250,80,70);

		

		l5=new Label();

		l5.setText("Address");

		l5.setBounds(100,300,80,70);

		

		l6=new Label();

		l6.setText("gender");

		l6.setBounds(100,450,80,70);

		

		l7=new Label();

		l7.setText("language");

		l7.setBounds(100,500,80,70);

		

		

		b1.setBounds(200,600,100, 50);

		b2.setBounds(300,600,100, 50);

		t1.setBounds(200,100,500, 50);

		t2.setBounds(200,150,500, 50);

		t3.setBounds(200,200,500,50);

		t4.setBounds(200,250,500,50);

		t5.setBounds(200,300,500,100);

		

		this.add(b1);

		this.add(b2);

		this.add(t1);

		this.add(t2);

		this.add(t3);

		this.add(t4);

		this.add(t5);

		this.add(l1);

		this.add(l2);

		this.add(l3);

		this.add(l4);

		this.add(l5);

		this.add(l6);

		this.add(l7);

		

		Checkbox c1=new Checkbox("Hindi");

		Checkbox c2=new Checkbox("Telugu");

		Checkbox c3=new Checkbox("english");

		c1.setBounds(200,500,80,70);

		c2.setBounds(300,500,80,70);

		c3.setBounds(400,500,80,70);

		

		Checkbox c4=new Checkbox("Male");

		Checkbox c5=new Checkbox("Female");

		c4.setBounds(200,450,80,70);

		c5.setBounds(300,450,80,70);

		this.add(c1);

		this.add(c2);

		this.add(c3);

		this.add(c4);

		this.add(c5);

	}

}

public class RegistrationForm {

	

	public static void main(String[] args) {

		MyButton f=new MyButton();

		f.setTitle("Sample");

		f.setVisible(true);

		f.setSize(800,700);

		f.addWindowListener(new Myclass());

	}

}

class Myclass extends WindowAdapter {

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}