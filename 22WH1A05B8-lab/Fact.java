package cseb22WH1A05B8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyButton4 extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button compute,clear;
	Label number,fact;
	TextField t1,t2;
	MyButton4(){
		this.setLayout(null);
		t1=new TextField();
		t2=new TextField();
		number=new Label("NUMBER");
		fact=new Label("FACT");
		compute=new Button("compute");
		clear=new Button("clear");
		t1.setBounds(600,150,300,40);
		t2.setBounds(600,200,300,40);
		number.setBounds(500,150,100,40);
		fact.setBounds(500,200,100,40);
		compute.setBounds(500,300,100,40);
		clear.setBounds(650,300,100,40);
		this.add(compute);
		this.add(clear);
		this.add(number);
		this.add(fact);
		this.add(t1);
		this.add(t2);
		compute.addActionListener(this);
		clear.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str=ae.getActionCommand();
		if (str.equals("compute")) {
			int n=Integer.parseInt(t1.getText());
			int fact=1;
			while(n>0) {
				fact=fact*n;
				n--;
			}
			String res=Integer.toString(fact);
			t2.setText(res);
		}
		if(str.equals("clear")){
			t1.setText("");
			t2.setText("");
		}
		
		
	}
	
}
public class Fact {

	public static void main(String[] args) {
		MyButton4 f=new MyButton4();
		f.setVisible(true);
		f.setTitle("Background");
		f.setSize(400,400);
		f.addWindowListener(new MyClass4());

	}

}
class MyClass4 extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
