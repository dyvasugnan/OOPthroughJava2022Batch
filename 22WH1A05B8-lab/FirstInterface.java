package cseb22WH1A05B8;
import java.awt.*;
import java.awt.event.*;


public class FirstInterface {
	public static void main(String[] args) {
		TestGui f=new TestGui();
			f.setVisible(true);
			f.setTitle("Smiley");
			f.setSize(400,400);
			f.addWindowListener(new MyClass());
			
	}
}
class TestGui extends Frame{
	public void paint(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(100, 100, 150, 200);
		g.setColor(Color.yellow);
		g.fillOval(125, 150, 100, 100);
		g.setColor(Color.black);
		g.fillOval(150, 180, 10, 10);
		g.fillOval(190, 180, 10, 10);
		g.drawLine(175, 210, 175, 180);
		g.drawArc(150, 210, 50, 20, 195, 150);
		Font f1 =new Font("Bold",Font.BOLD,50);
		g.setColor(Color.BLUE);
		g.drawString("Hello Message",135, 90);
		g.setColor(Color.blue);
		
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}