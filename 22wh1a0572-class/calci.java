package java_gui_72;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class gui extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5;
	TextField t1,t2,t3;
	Label l1,l2;
	gui(){
	this.setLayout(null);
	b2=new Button("Add");
	b3=new Button("Subtract");
	b4=new Button("Multiply");
	b5=new Button("Divide");
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	l1=new Label("operand1");
	l2=new Label("operand2");
	
	b2.setBounds(200,300,100,50);
	b3.setBounds(200,400,100,50);
	b4.setBounds(200,500,100,50);
	b5.setBounds(200,600,100,50);
	l1.setBounds(100,100,100,50);
	l2.setBounds(200,100,100,50);
	t1.setBounds(100,200,100,50);
	t2.setBounds(200,200,100,50);
	t3.setBounds(300,100,100,50);
	
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	this.add(l1);
	this.add(l2);
	this.add(t1);
	this.add(t2);
	this.add(t3);

	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equals("Add")) {
			String a=t1.getText();
			String b=t2.getText();
			int res=Integer.parseInt(a)+Integer.parseInt(b);
			t3.setText(String.valueOf(res));}
		if(str.equals("Subtract")) {
			String a=t1.getText();
			String b=t2.getText();
			int res=Integer.parseInt(a)-Integer.parseInt(b);
			t3.setText(String.valueOf(res));}
		if(str.equals("Multiply")) {
			String a=t1.getText();
			String b=t2.getText();
			int res=Integer.parseInt(a)*Integer.parseInt(b);
			t3.setText(String.valueOf(res));}
		if(str.equals("Divide")) {
			String a=t1.getText();
			String b=t2.getText();
			double res=Integer.parseInt(a)/Integer.parseInt(b);
			t3.setText(String.valueOf(res));}
		
		if(str.equals("clear"))	{
			t1.setText("");
			t2.setText(String.valueOf(""));
			
		}
			
	}

	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		gui f= new gui();
		f.setTitle("Calci");
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new MyClass1());
		}
		}

class MyClass1 extends WindowAdapter
		{
		public void windowClosing(WindowEvent we) {
		System.exit(0);
		}}

