package cseb;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener{
	Button b1,b2;
	Label l1,l2,l3,l4,l5,l6,l7;
	TextField t1,t2,t3,t4,t5;
	MyButton(){
		this.setLayout(null);
		
		b1=new Button("Save");
	//	g.setColor(Color.GREEN);
		b2=new Button("Update");
		t1=new TextField();
		t2=new TextField(20);
		t3=new TextField();
		t4=new TextField(30);
		t5=new TextField();
		
		l1=new Label();
		l1.setText("Name");
		l1.setBounds(40, 50, 40, 30);
		
		l2=new Label();
		l2.setText("Father name");
		l2.setBounds(40, 90, 80, 30);
		
		l3=new Label();
		l3.setText("Mother Name");
		l3.setBounds(40, 130, 80, 30);
		
		l4=new Label();
		l4.setText("Age");
		l4.setBounds(40, 200, 40, 30);
		
		l5=new Label();
		l5.setText("Address");
		l5.setBounds(40, 300, 50, 30);
		
		l6=new Label();
		l6.setText("Gender");
		l6.setBounds(40, 170, 50, 30);
		
		l7=new Label();
		l7.setText("Language");
		l7.setBounds(40, 240, 80, 30);
		
		
		t1.setBounds(180,50,250,30);
		t2.setBounds(180,90,250,30);
		t3.setBounds(180,130,250,30);
		t4.setBounds(180,200,250,30);
		t5.setBounds(180,300,250,90);
		b1.setBounds(80,400,90,40);
		//b1.setColor(Color.YELLOW);
		b2.setBounds(250,400,90,40);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(l7);
		
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
	    Checkbox c1=new Checkbox("Hindi");
	    Checkbox c2=new Checkbox("Telugu");
	    Checkbox c3=new Checkbox("English",true);
	    c1.setBounds(180,240,70,20);
		c2.setBounds(260,240,80,20);
		c3.setBounds(350,240,250,20);
		this.add(c1);
		this.add(c2);
		this.add(c3);
	}
 }


public class RegistrationFormGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyButton f=new MyButton();
         f.setTitle("Student Registration Form");
         f.setVisible(true);
         f.setSize(500,500);
         f.addWindowListener(new Myclass());
	}

}
class Myclass extends WindowAdapter{

	  public void windowClosing(WindowEvent we) {
		  
		  System.exit(0);
	  }
}

