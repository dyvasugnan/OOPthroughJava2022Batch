import java.awt.*;
import java.awt.event.*;

class ColorButtons extends Frame implements ActionListener 
{
	Button b1,b2,b3,b4,b5,b6,b7;

    ColorButtons()
    {
        this.setLayout(null);        
        Button b1 = new Button("YELLOW");
        Button b2 = new Button("PINK");
        Button b3 = new Button("GREEN");
        Button b4 = new Button("RED");
        Button b5 = new Button("BLACK");
        Button b7 = new Button("CLEAR");
        Button b6 = new Button("BLUE");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        b1.setBounds(200,200,100,50);
        b2.setBounds(200,500,100,50);
        b3.setBounds(500,200,100,50);
        b4.setBounds(500,500,100,50);
        b5.setBounds(350,200,100,50);
        b6.setBounds(350,500,100,50);
        b7.setBounds(350,350,100,50);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
    }
    public void actionPerformed(ActionEvent ae) 
	{
        String str = ae.getActionCommand();
        if(str.equals("YELLOW"))
            this.setBackground(Color.YELLOW);
        else if(str.equals("PINK"))
            this.setBackground(Color.PINK);
        else if(str.equals("GREEN"))
            this.setBackground(Color.GREEN);
        else if(str.equals("RED"))
            this.setBackground(Color.RED);
        else if(str.equals("BLACK"))
            this.setBackground(Color.BLACK);
        else if(str.equals("BLUE"))
            this.setBackground(Color.BLUE);
        else if(str.equals("CLEAR"))
            this.setBackground(Color.WHITE);
    }
}
public class ActiveButtons 
{
    public static void main(String[] args) 

	{
		ColorButtons f = new ColorButtons();
		f.setTitle("Active Buttons");
		f.setVisible(true);
		f.setSize(800,800);
        f.setBackground(Color.ORANGE);
		f.addWindowListener(new NewClass());
	}
}

class NewClass extends WindowAdapter 
{
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
}

