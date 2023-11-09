package cseb;

import java.awt.*;

import java.awt.event.*;



class TestGui extends Frame{

	public void paint(Graphics g) {

		g.drawRect(50, 50, 300, 250);

		g.setColor(Color.green);

		g.fillRect(50, 50, 300, 250);

		

		g.drawOval(90, 70, 200, 200);

		g.setColor(Color.yellow);

		g.fillOval(90,70,200,200);

		

		g.drawOval(120, 120, 20, 20);

		g.setColor(Color.black);

		g.fillOval(120,120,20,20);

		

		g.drawOval(240,120, 20, 20);

		g.setColor(Color.black);

		g.fillOval(240,120,20,20);

		

		g.drawLine(190, 140, 190, 180);

		

		g.drawArc(150,170, 75, 74, 180,180);

		g.setColor(Color.red);

		g.fillArc(150,170, 75, 74, 180,180);

		

		Font f1=new Font("Arial",Font.BOLD,30);

		g.setFont(f1);

		g.setColor(Color.red);

		g.drawString("Hello Meera!!", 100, 350);

		//g.setColor(Color.blue);

	}

}

public class FirstGUI {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		TestGui f=new TestGui();// f.setTitle("First Frame");

			f.setVisible(true);

			f.setSize(400,400);

			f.addWindowListener(new MyClass());

	 		

	}



}

class MyClass extends WindowAdapter{

	public void windowClosing(WindowEvent we){

		System.exit(0);

	}

}

