import java.awt.*;
import java.awt.event.*;

public class ActiveButtons 
{

	public static void main(String[] args) 
	{
	
		OnlyButton f = new OnlyButton();
		f.setTitle("Active Buttons");
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new MynewClass());

	}

}

class MynewClass extends WindowAdapter 
{
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
}

class OnlyButton extends Frame implements ActionListener 
{
	Button b1,b2,b3;
	OnlyButton()
	{
		this.setLayout(null);
		b1 = new Button("Red");
		b2 = new Button("Blue");
		b3 = new Button("Green");
		
		b1.setBounds(100,100,100,50);
		b2.setBounds(300,100,100,50);
		b3.setBounds(500,100,100,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		String str;
		str = b1.getActionCommand();
		String str1 = b2.getActionCommand();
		String str2 = b3.getActionCommand();
		if(str.equals("Red"))
			this.setBackground(Color.RED);
		else if(str1.equals("Blue"))
			this.setBackground(Color.BLUE);
		else if(str2.equals("Green"))
			this.setBackground(Color.GREEN);
		else
			this.setBackground(Color.BLACK);
	}
}

