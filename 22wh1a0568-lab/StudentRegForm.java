package LearningJava;
import java.awt.*;
import java.awt.event.*;
class MyComponents extends Frame{
	Button b1,b2;
	TextField t1,t2,t3,t4;
	TextArea t5;
	Label Title,Name,Fathername,Age,Gender,Course,Hobbies,Addr;
	Checkbox c1,c2,c3,c4;
	MyComponents(){
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		b1 = new Button("Save");
		b2 = new Button("Clear");
		Title = new Label("Registration Form");
		Name = new Label("Name:");
		Fathername = new Label("Father Name:");
		Age = new Label("Age:");
		Gender = new Label("Gender:");
		Course = new Label("Course:");
		Hobbies = new Label("Hobbies:");
		Addr = new Label("Address:");
		t1 = new TextField(32);
		t2 = new TextField(32);
		t3 = new TextField(5);
		t4 = new TextField(30);
		t5 = new TextArea(50,50);
		c1 = new Checkbox("Dance");
		c2 = new Checkbox("Singing");
		c3 = new Checkbox("Drawing");
		c4 = new Checkbox("Others",true);
		Title.setBounds(50, 50, 200, 40);
		Font f1 = new Font("Serif",Font.ITALIC,25);
		Title.setFont(f1);
		Name.setBounds(110, 100, 50, 25);
		Fathername.setBounds(110, 150, 80, 25);
		Age.setBounds(110, 200, 80, 25);
		Gender.setBounds(110, 250, 80, 25);
		Course.setBounds(110, 300, 80, 25);
		Hobbies.setBounds(110, 350, 80, 25);
		Addr.setBounds(110, 400, 80, 25);
		t1.setBounds(210, 100, 200, 20);
		t2.setBounds(210, 150, 200, 20);
		t3.setBounds(210, 200, 200, 20);
		t4.setBounds(210, 300, 200, 20);
		t5.setBounds(210, 400, 200, 100);
		b1.setBounds(210, 550, 80, 20);
		b2.setBounds(310, 550, 80, 20);
		c1.setBounds(210, 350, 50, 25);
		c2.setBounds(260, 350, 55, 25);
		c3.setBounds(315, 350, 60, 25);
		c4.setBounds(375, 350, 50, 25);
		this.add(t1);this.add(t2);this.add(t3);this.add(t4);this.add(t5);
		this.add(b1);this.add(b2);
		this.add(Age);this.add(Gender);this.add(Course);
		this.add(Hobbies);this.add(Addr);this.add(Fathername);
		this.add(Name);this.add(Title);
		this.add(c1);this.add(c2);this.add(c3);this.add(c4);
	}
}
public class StudentRegForm {
	public static void main(String[] args) {
		Frame f = new MyComponents();
		  f.setTitle("Student Register Form");
		  f.setVisible(true);
		  f.setSize(650, 650);
		  f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
public void windowClosing(WindowEvent we) {
	System.exit(0);
	}
}