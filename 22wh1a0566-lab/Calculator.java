

import java.awt.Button;
import java.awt.*;
import java.awt.event.*;


class TestFiveGUI extends Frame implements ActionListener{
	Button add,sub,prod,div,clear,equals;
	TextField entry,result;
	Label entryl,resultl;
	TestFiveGUI(){
		this.setLayout(null);
		
		add=new Button("+");
		sub=new Button("-");
		prod=new Button("*");
		div=new Button("/");
		clear=new Button("Clear");
		
		equals=new Button("calculate");
		entry=new TextField();
		result=new TextField();
		entryl=new Label("Enter Number : ");
		resultl=new Label("Result : ");
		
		entry.setBounds(300,50,200,50);
		result.setBounds(300,150,200,50);
		entryl.setBounds(120,50,100,50);
		resultl.setBounds(120,150,100,50);

		
		add.setBounds(100,300,80,50);
		prod.setBounds(200,300,80,50);
		div.setBounds(300,300,80,50);
		sub.setBounds(400, 300, 80, 50);
		clear.setBounds(500,300,80,50);


		
		this.add(entry);
		this.add(result);
		this.add(entryl);
		this.add(resultl);
		this.add(add);
		this.add(sub);
		this.add(prod);
		this.add(div);
		this.add(clear);
		this.add(equals);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		prod.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		String s=this.entry.getText();
		if(str.equals("+")) {
			String st=this.entry.getText();
			this.entry.setText(st+"+");
		}
		if(str.equals("-")) {
			String st=this.entry.getText();
			this.entry.setText(st+"-");
		}
		if(str.equals("*")) {
			String st=this.entry.getText();
			this.entry.setText(st+"*");
		}
		if(str.equals("/")) {
			String st=this.entry.getText();
			this.entry.setText(st+"/");
		}
		if(str.equals("calculate")) {
			if(s.contains("+")) {
				int n=s.indexOf("+");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				this.result.setText(String.valueOf(n1+n2));
			}
			if(s.contains("-")) {
				int n=s.indexOf("-");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				this.result.setText(String.valueOf(n1-n2));
			}
			if(s.contains("*")) {
				int n=s.indexOf("*");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				this.result.setText(String.valueOf(n1*n2));
			}
			if(s.contains("/")) {
				int n=s.indexOf("/");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				try {
					this.result.setText(String.valueOf(n1/n2));
				}
				catch(ArithmeticException e) {
					e.printStackTrace();
				}
				finally {
					this.result.setText(String.valueOf(n1/n2));				
				}
			}
		}
		if(str.equals("Clear")) {
			this.result.setText("");
			this.entry.setText("");
		}
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFiveGUI f=new TestFiveGUI();
		f.setTitle("First Frame");
		f.setVisible(true);
		f.setSize(600,600);
		f.addWindowListener(new MyNewFourClass());
	}

}
class MyNewFourClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
