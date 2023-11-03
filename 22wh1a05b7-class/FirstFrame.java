package cseB22WH1A05B7;
import java.awt.*;
import java.awt.event.*;


class TestGui extends Frame{
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(600,250,450,450);
		g.setColor(Color.YELLOW);
		g.fillOval(625,275,400,400);
		g.setColor(Color.BLACK);
	    g.fillOval(700, 400, 40,40);
		g.fillOval(910, 400, 40, 40);
		g.drawLine(820, 400, 820, 500);
		g.drawArc(700,500,210,100,180,160);
		
		Font f1=new Font("Arial",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.RED);
		g.drawString("Keep Smiling (^-^)",700,200);
		//g.setColor(Color.blue);
	}
}
public class FirstFrame {

	public static void main(String[] args) {
		TestGui f=new TestGui();
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass());	
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
