
import java.awt.*;
import java.awt.event.*;


class TestSixGUI extends Frame implements ActionListener{
	Button addi,sub,prod,div,clear,equals;
	Button[] b=new Button[10];
	TextField entry;
	Panel p;
	TestSixGUI(){
		this.setLayout(new BorderLayout());
		
		p=new Panel(new GridLayout(4,4));
	
		addi=new Button("+");
		sub=new Button("-");
		prod=new Button("*");
		div=new Button("/");
		clear=new Button("Clear");		
		equals=new Button("calculate");

		
		entry=new TextField();
		this.add(entry,BorderLayout.NORTH);

		p.add(addi);
		p.add(sub);
		p.add(prod);
		p.add(div);
		p.add(equals);
		p.add(clear);
		
		for(int i=0;i<10;i++) {
			b[i]=new Button(String.valueOf(i));
			p.add(b[i]);
			b[i].addActionListener(this);
		}
		this.add(p);
				
		addi.addActionListener(this);
		sub.addActionListener(this);
		prod.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		String s=this.entry.getText();
		if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")) {
			this.entry.setText(s+str);
		}
		if(str.equals("calculate")) {
			if(s.contains("+")) {
				int n=s.indexOf("+");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				this.entry.setText(String.valueOf(n1+n2));
			}
			if(s.contains("-")) {
				int n=s.indexOf("-");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				this.entry.setText(String.valueOf(n1-n2));
			}
			if(s.contains("*")) {
				int n=s.indexOf("*");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				this.entry.setText(String.valueOf(n1*n2));
			}
			if(s.contains("/")) {
				int n=s.indexOf("/");
				double n1=Double.parseDouble(s.substring(0,n));
				double n2=Double.parseDouble(s.substring(n+1,s.length()));
				try {
					this.entry.setText(String.valueOf(n1/n2));
				}
				catch(ArithmeticException e) {
					e.printStackTrace();
				}
				finally {
					this.entry.setText(String.valueOf(n1/n2));				
				}
			}
		}
		if(str.equals("Clear")) {
			this.entry.setText("");
		}
		else {
			for(int i=0;i<10;i++) {
				if(str.equals(String.valueOf(i))) {
					this.entry.setText(s+String.valueOf(i));
					break;
				}
			}
		}
	}
}
public class CalculatorUsingGrid{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSixGUI f=new TestSixGUI();
		f.setTitle("First Frame");
		f.setVisible(true);
		f.setSize(300,300);
		f.addWindowListener(new MyNewFiveClass());
	}

}
class MyNewFiveClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
