import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame{
	Button b1,b2;
	TextField t1,t2;
	 MyButton(){
		//DrawString("Registration Form",100,100);
		 this.setLayout(null);
		b1 = new Button("Save");
		b2 = new Button("Update");
		t1 = new TextField(15);
		t2 = new TextField(50);
		b1.setBounds(100,300,50,50);
		b2.setBounds(200,300,50,50);
		t1.setBounds(200,100,100,50);
		t1.setBounds(250,100,100,50);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		Checkbox c1 = new Checkbox();
		Checkbox c2 = new Checkbox("Telugu");
		Checkbox c3 = new Checkbox("English",true);
		setLayout(new GridLayout(0, 1));
		add(new Checkbox("one", null, true));
		add(new Checkbox("two"));
		add(new Checkbox("three"));
		 
	}
	 public void paint(Graphics g) {
		 g.setColor(Color.BLACK);
		 g.drawString("Registration form", 100, 100);
		 
	 }
}

public class StudentRegForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyButton f = new MyButton();
       f.setVisible(true);
       f.setSize(400,400);
       f.setBackground(Color.pink);
       
       f.addWindowListener(new MyClass());
       
	}

}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
