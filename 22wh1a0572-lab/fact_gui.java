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
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
	gui(){
	this.setLayout(null);
	b1=new Button("compute");
	b2=new Button("clear");
	t1=new TextField();
	t2=new TextField();
	l1=new Label("Number");
	l2=new Label("Factorial");
	b1.setBounds(100,300,100,50);
	b2.setBounds(200,300,100,50);
	l1.setBounds(100,100,100,50);
	l2.setBounds(200,100,100,50);
	t1.setBounds(100,200,100,50);
	t2.setBounds(200,200,100,50);
	this.add(b1);
	this.add(b2);
	this.add(t1);
	this.add(t2);
	this.add(l1);
	this.add(l2);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equals("compute")) {
			String n=t1.getText();
			int i;
			int fact=1;
			for(i=1;i<=Integer.parseInt(n);i++) {
				fact=fact*i;
			}
			t1.setText(n);
			t2.setText(String.valueOf(fact));}
		if(str.equals("clear"))	{
			t1.setText("");
			t2.setText(String.valueOf(""));
			
		}
			
	}

	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		gui f= new gui();
		f.setTitle("FACTORIAL");
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
