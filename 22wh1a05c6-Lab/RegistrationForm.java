import java.awt.*;

import java.awt.event.*;



class MyButton extends Frame{

	Button b1,b2;

	TextField t1,t2,t3,t4;

	Label l1,l2,l3,l4,l5,l6,l7;

	Checkbox c1,c2,c3,c4,c5,c6;

	MyButton(){

		this.setLayout(null);

		Checkbox c1 = new Checkbox("Painting",true);

		Checkbox c2 = new Checkbox("Singing",true);

		Checkbox c3 = new Checkbox("Dancing",true);

		Checkbox c4 = new Checkbox("Tennis",true);

		Checkbox c5 = new Checkbox("Male",true);

		Checkbox c6 = new Checkbox("Female",true);

		b1 = new Button("Save");

		b2 = new Button("Update");

		t1 = new TextField(50);

		t2 = new TextField(50);

		t3 = new TextField(5);

		t4 = new TextField(200);

		l1 = new Label("Name");

		l2 = new Label("Father's Name");

		l3 = new Label("Age");

		l4 = new Label("Gender");

		l5 = new Label("Course");

		l6 = new Label("Hobbies");

		l7 = new Label("Address");

		b1.setBounds(200,400,70,30);

		b2.setBounds(280,400,70,30);

		t1.setBounds(250,50,300,30);

		t2.setBounds(250,100,300,30);

		t3.setBounds(250,350,300,30);

		t4.setBounds(250,150,300,30);

		l1.setBounds(50,50,100,30);

		l2.setBounds(50,100,100,30);

		l3.setBounds(50,150,100,30);

		l4.setBounds(50,200,100,30);

		l5.setBounds(50,250,100,30);

		l6.setBounds(50,300,100,30);

		l7.setBounds(50,350,100,30);

		c1.setBounds(250,300,70,30);

		c2.setBounds(330,300,70,30);

		c3.setBounds(420,300,70,30);

		c4.setBounds(500,300,70,30);

		c5.setBounds(250,200,70,30);

		c6.setBounds(330,200,70,30);

		this.add(b1);

		this.add(b2);

		this.add(t1);

		this.add(t2);

		this.add(t3);

		this.add(t4);

		this.add(l1);

		this.add(l2);

		this.add(l3);

		this.add(l4);

		this.add(l5);

		this.add(l6);

		this.add(l7);

		this.add(c1);

		this.add(c2);

		this.add(c3);

		this.add(c4);

		this.add(c5);

		this.add(c6);

	}

}

public class StudentRegForm {



	public static void main(String[] args) {

		MyButton f = new MyButton();

		f.setTitle("Registration Form");

		f.setVisible(true);

		f.setSize(600,600);

		f.setBackground(Color.black);

		f.addWindowListener(new MyClass2());



	}



}



class MyClass2 extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}