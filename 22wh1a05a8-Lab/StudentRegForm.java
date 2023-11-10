package cseb225a8;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyButton extends Frame{
	Button b1,b2;
	TextField t1,t2,t3,t4,t5;
	MyButton(){
		this.setLayout(null);
		//this.setBackground(Color.BLACK);
		b1 = new Button("Save");
		b2 = new Button("Update");
		t1 = new TextField();
		t2 = new TextField(30);      //Tells how many characters are required
		t3 = new TextField();
		t4 = new TextField();
		t5 = new TextField();
		//t1.setText("hi");            //To set the text
		b1.setBounds(150,400,100,20);
		b2.setBounds(250,400,100,20);
		t1.setBounds(200,50,100,20);
		t2.setBounds(200,100,100,20);
		t3.setBounds(200,150,100,20);
		t4.setBounds(200,250,100,20);
		t5.setBounds(200,350,100,20);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		Checkbox c1 = new Checkbox("Female");
		Checkbox c2 = new Checkbox("Male");
		Checkbox c3 = new Checkbox("Songs");
		Checkbox c4 = new Checkbox("Books");
		Checkbox c5 = new Checkbox("Food");
		c1.setBounds(200,200,100,20);
		c2.setBounds(300,200,100,20);
		c3.setBounds(200,300,100,20);
		c4.setBounds(300,300,100,20);
		c5.setBounds(400,300,100,20);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(c4);
		this.add(c5);
	}
	public void paint(Graphics g) {
		g.drawString("Name", 100, 50);
		g.drawString("Father Name", 100, 100);
		g.drawString("Age", 100, 150);
		g.drawString("Gender", 100, 200);
		g.drawString("Course", 100, 250);
		g.drawString("Hobbies", 100, 300);
		g.drawString("Address", 100, 350);
	}
}
public class StudentRegForm {
	public static void main(String[] args) {
		MyButton f = new MyButton();
		f.setTitle("Student Registration Form");
		f.setVisible(true);
		f.setSize(500,500);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
