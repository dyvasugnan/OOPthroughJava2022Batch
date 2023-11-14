package pranavi;
import java.awt.*;
import java.awt.event.*;
class Buttons extends Frame{
	Button b1,b2;
	TextField t1,t2,t3;
	Checkbox c1,c2,c3,c4,c5,c6,c7;
	TextArea a1;
	Label l1,l2,l3,l5;
	Buttons(){
		this.setLayout(null);
		b1 = new Button("Save");
		b2 = new Button("Cancel");
		t1 = new TextField(50);
		t2 = new TextField(50);
		t3 = new TextField(50);
		c1 = new Checkbox("English",true);
		c2 = new Checkbox("Telugu",true);
		c3 = new Checkbox("Hindi",true);
		c4 = new Checkbox("Korean",true);
		c5 = new Checkbox("Others",true);
		c6 = new Checkbox("Male",true);
		c7 = new Checkbox("Female",true);
		a1 = new TextArea();
		l1 = new Label("Name");
		l2 = new Label("Father Name");
		l3 = new Label("Age");
		l5 = new Label("Address");
		b1.setBounds(300, 700, 100, 50);
		b2.setBounds(450, 700, 100, 50);
		t1.setBounds(300, 100, 300, 50);
		t2.setBounds(300, 200, 300, 50);
		t3.setBounds(300, 300, 300, 50);
		a1.setBounds(300, 500, 300, 100);
		l1.setBounds(200, 100, 300, 50);
		l2.setBounds(200, 200, 300, 50);
		l3.setBounds(200, 300, 300, 50);
		l5.setBounds(200, 500, 300, 100);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(c1);
		this.add(a1);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l5);
	}
}
public class StudRegForm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buttons f = new Buttons();
		f.setTitle("Student Registration form");
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
