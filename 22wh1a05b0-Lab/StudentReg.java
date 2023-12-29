import java.awt.*;
import java.awt.event.*;
public class StudentReg {
public static void main(String[] args) {
	AllComps f = new AllComps();
	f.setTitle("Student Registration Form");
	f.setVisible(true);
	f.setSize(800,800);
	f.addWindowListener(new MyClass());

	}

}


class MyClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class AllComps extends Frame{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2,l3,l4,l5,l6,l7;
	AllComps(){
		b1 = new Button("SAVE");
		b2 = new Button("Update");
		t1 = new TextField();
		t2 = new TextField(30);
		l1 = new Label("Name");
		Checkbox c2 = new Checkbox("Telugu");
		Checkbox c3 = new Checkbox("English");
		b1.setBounds(100,100,100,50);
		b2.setBounds(200,100,100,50);
		t1.setBounds(100,200,100,50);
		t2.setBounds(200,200,100,50);
		c2.setBounds(200,400,100,50);
		c3.setBounds(100,400,100,50);
		l1.setAlignment(Label.CENTER);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(l1);
		this.add(c2);
		this.add(c3);
	}
}