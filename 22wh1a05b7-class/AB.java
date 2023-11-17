package gui;



import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
class MyLabel extends Frame implements ActionListener{
	Button compute,clear;
	Label number,factorial;
	TextField tf1,tf2;
	MyLabel(){
		this.setLayout(null);
		compute=new Button("Compute");
		compute.setBounds(80,200,80,25);
		compute.setBackground(Color.PINK);
		this.add(compute);
		compute.addActionListener( this);
		
		clear=new Button("Clear");
		clear.setBounds(160,200,80,25);
		clear.setBackground(Color.GREEN);
		this.add(clear);
		clear.addActionListener(this);
		
		number=new Label("Number ");
		number.setBounds(80,50,80,25);
		number.setBackground(Color.YELLOW);
		this.add(number);
		
		factorial=new Label("Factorial");
		factorial.setBounds(80,100,80,25);
		factorial.setBackground(Color.YELLOW);
		this.add(factorial);
		
		tf1=new TextField();
		tf1.setBounds(160,50,80,25);
		tf1.setBackground(Color.ORANGE);
		this.add(tf1);
		
		tf2=new TextField();
		tf2.setBounds(160,100,80,25);
		tf2.setBackground(Color.ORANGE);
		this.add(tf2);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="Compute") {
			int x=Integer.parseInt(tf1.getText());
			int fact=1;
			for(int i=1;i<=x;i++) {
				fact=fact*i;
			}
			
			String y=Integer.toString(fact);
			tf2.setText(y);
			
			}
		if(str=="Clear") {
			tf1.setText(" ");
			tf2.setText(" ");
		}
	
}
		
}

public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLabel f=new MyLabel();
		f.setTitle("Factorial");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new Close());
	}

}
class Close extends WindowAdapter{
	public void WindowClosing(WindowEvent we) {
		System.exit(0);
	}
}