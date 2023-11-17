package cseb;
import java.awt.*;
import java.awt.event.*;

class Click extends Frame implements ActionListener{
	Button b1;
	TextField t1;
	Click(){
		this.setLayout(null);
		t1=new TextField();
		b1=new Button("Set");
		
		
		
		b1.setBounds(100,200,100,50);
		t1.setBounds(100,100,100,50);
		
		
		this.add(b1);
		this.add(t1);
		
		b1.addActionListener(this);
	}
		
	public void actionPerformed(ActionEvent ae) {
		String str;	
		str=ae.getActionCommand();
		if(str.equals("Set"))
			this.t1.setText("Welcome");
		
		
		
		
	}
	
}
public class Gui_4 {

	public static void main(String[] args) {
		Click f=new Click();
		f.setTitle("Sample Frame");
		f.setVisible(true);
		f.setSize(500,500);
		
		f.addWindowListener(new What());
	}

}

class What extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	
}
