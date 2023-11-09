package cseb;

import java.awt.*;



import java.awt.event.*;     //to perform actions and display

class TestGui extends Frame{

	public void paint(Graphics g) {

		Font f1=new Font("Arial",Font.BOLD,30);

		g.setFont(f1);

		g.setColor(Color.GREEN);

		g.drawString("Hello Cherry", 100, 400);

		g.setColor(Color.GRAY);

		

		g.drawRect(50, 50, 300, 300);

		g.setColor(Color.GRAY);

		g.fillRect(50,50,300,300);

		

		g.drawOval(70, 70, 250, 250);

		g.setColor(Color.YELLOW);

		g.fillOval(70, 70, 250, 250);

		

		g.drawOval(120, 130, 30, 30);

		g.setColor(Color.BLACK);

		g.fillOval(120, 130, 30, 30);

		

		g.drawOval(240, 130, 30, 30);

		g.setColor(Color.BLACK);

		g.fillOval(240, 130, 30, 30);

		

		g.drawLine(200, 220, 200, 160);

		

		g.drawArc(160, 200, 80, 80, 180, 180);

		g.setColor(Color.RED);

		g.fillArc(160, 200, 80, 80, 180, 180);

	

	}

}





public class CreateFrameGUI {



	public static void main(String[] args) {

       TestGui f=new TestGui();        

          f.setVisible(true);

          f.setSize(500,500);

          f.addWindowListener(new MyClass());

          

	}



}

class MyClass extends WindowAdapter{

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

}

