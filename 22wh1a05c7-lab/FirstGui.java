package akshithac7;

import java.awt.*;

import java.awt.event.*;



class TestGui extends Frame{

	public void paint(Graphics g) {

		g.drawRect(200, 200, 100, 100);

		g.setColor(Color.green);

		g.fillRect(150, 150, 500, 500);

		g.setColor(Color.yellow);

		g.fillOval(210,210,400,400);

		g.setColor(Color.black);

		g.fillOval(290, 280, 60, 60);

		g.fillOval(460, 280, 60, 60);

		g.setColor(Color.red);

		g.drawArc(310,400,190,150,180,180);

		g.setColor(Color.black);

		g.drawLine(408,390,408,340);

		Font f1=new Font("Arial",Font.BOLD,30);

		g.setFont(f1);
                		g.setColor(Color.DARK_GRAY);

		g.drawString("Hello Message",100,100);

		

		

	}

}

public class FirstGui {

	public static void main(String[] args) {

	      TestGui f=new TestGui();

	      f.setVisible(true);

	      f.setSize(400,400);
              	      f.addWindowListener(new MyClass());

	      

	}



}

class MyClass extends WindowAdapter{

	public void WindowClosing(WindowEvent we) {

	System.exit(0);

 }

}



