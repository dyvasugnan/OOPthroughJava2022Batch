import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame{
	Button b1,b2;
	TextField t1,t2;
	Checkbox c1,c2,c3;
	MyButton()
	{
		this.setLayout(null);
		b1 = new Button("Save");
		b2 = new Button("Update");
		t1 = new TextField();
		t2 = new TextField(30);
		c1 = new Checkbox();
		c2 = new Checkbox("Telugu");
		c3 = new Checkbox("English",true);
		b1.setBounds(100,100,100,50);
		b2.setBounds(200,100,100,50);
		t1.setBounds(300,100,100,50);
		t2.setBounds(400,100,100,50);
		c1.setBounds(150,350,100,50);
		c2.setBounds(250,350,100,50);
		c3.setBounds(350,350,100,50);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);


				}
}
public class StudentRegForm {
	public static void main(String[] args)
	{
		MyButton f= new MyButton();
		f.setTitle("FORM");
		f.setVisible(true);
		f.setSize(800,800);
		f.setBackground(Color.blue);
		f.addWindowListener(new MyClass1());
	}
	}
class MyClass1 extends WindowAdapter
{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}

	}
