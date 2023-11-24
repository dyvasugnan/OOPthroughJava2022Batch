import java.awt.*;
import java.awt.event.*;

class TwoButtons extends Frame implements ActionListener 
{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;

    TwoButtons()

	{
        this.setLayout(null);
        this.setBackground(Color.pink);
		b1 = new Button("Compute");
		b2 = new Button("Clear");

		b1.setBounds(200,500,100,50);
		b2.setBounds(500,500,100,50);

		b1.addActionListener(this);
		b2.addActionListener(this);

		this.add(b1);
		this.add(b2);

		t1 = new TextField();
		t2= new TextField();

		t1.setBounds(400,100,150,50);
		t2.setBounds(400,200,150,50);

		t1.addActionListener(this);
		t2.addActionListener(this);

		this.add(t1);
		this.add(t2);

		l1 = new Label();
		l1.setText("NUMBER : ");

		l2 = new Label();
		l2.setText("FACTORIAL : ");

		l1.setBounds(150,100,100,50);
		l2.setBounds(150,200,100,50);

		this.add(l1);
		this.add(l2);
	}

	public void actionPerformed(ActionEvent ae) 
	{
        if (ae.getSource() == b1) 
        {
            try 
            {
                int num = Integer.parseInt(t1.getText());
                int result = calculateFactorial(num);
                t2.setText(Integer.toString(result));
            } 
            catch (NumberFormatException e) 
            {
                t2.setText("Invalid Input");
            }
        } 
        else if (ae.getSource() == b2 ) 
        {
            t1.setText("");
            t2.setText("");
        }
    
    }
    private int calculateFactorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } 
        else 
        {
            return n * calculateFactorial(n - 1);
        }
    }
}

public class Factorial 
{
	public static void main(String[] args) 

	{
		TwoButtons f = new TwoButtons();
		f.setTitle("Factorial");
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new NumberClass());
	}
}

class NumberClass extends WindowAdapter 
{
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
}