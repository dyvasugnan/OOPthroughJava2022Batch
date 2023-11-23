package prathibha5b8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyButton2 extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button add, sub,mul,div,clear;
    Label num1, num2,Res;
    TextField t1, t2,res1;
    MyButton2(){
    	this.setLayout(null);
		t1=new TextField();
		t2=new TextField();
		res1=new TextField();
		add=new Button("ADD");
		sub=new Button("SUB");
		mul=new Button("MUL");
		div=new Button("DIV");
		num1=new Label("Num1");
		num2=new Label("Num2");
		Res=new Label("Result");
		clear=new Button("CLEAR");
		t1.setBounds(600,150,300,40);
		t2.setBounds(600,200,300,40);
		num1.setBounds(500,150,100,40);
		num2.setBounds(500,200,100,40);
		Res.setBounds(500,250,100,40);
		res1.setBounds(600,250,300,40);
		add.setBounds(500,300,100,40);
		sub.setBounds(650,300,100,40);
		mul.setBounds(500,400,100,40);
		div.setBounds(650,400,100,40);
		clear.setBounds(500,500,100,40);
		this.add(t1);
		this.add(t2);
		this.add(add);
		this.add(sub);
		this.add(div);
		this.add(mul);
		this.add(num1);
		this.add(num2);
		this.add(clear);
		this.add(res1);
		this.add(Res);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
    	String str1;
    	str1=ae.getActionCommand();
    	
    	if(str1.equals("ADD")) {
    		int x1=Integer.parseInt(t1.getText());
    		int y1=Integer.parseInt(t2.getText());
    		int c1=x1+y1;
    		String res12=Integer.toString(c1);
        	res1.setText(res12);
    		
    	}
    	if(str1.equals("SUB")) {
    		int x2=Integer.parseInt(t1.getText());
    		int y2=Integer.parseInt(t2.getText());
    		int c2=x2-y2;
    		String res2=Integer.toString(c2);
        	res1.setText(res2);
    		
    	}
    	if(str1.equals("DIV")) {
    		int x=Integer.parseInt(t1.getText());
    		int y=Integer.parseInt(t2.getText());
    		int c=x/y;
    		String res=Integer.toString(c);
        	res1.setText(res);
    		
    	}
    	if(str1.equals("MUL")) {
    		int x=Integer.parseInt(t1.getText());
    		int y=Integer.parseInt(t2.getText());
    		int c=x*y;
    		String res=Integer.toString(c);
        	res1.setText(res);
    		
    	}
    	if(str1.equals("CLEAR")){
			t1.setText("");
			t2.setText("");
		}
    }
	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class MyClass1 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
public class Arithmetic {
	public static void main(String[] args) {
		MyButton2 f = new MyButton2();
        f.setSize(1000, 500);
        f.setVisible(true);
        f.addWindowListener(new MyClass1());
	}

}
