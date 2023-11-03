package cse22567;
import java.awt.*;
import java.awt.event.*;

class TestGui extends Frame{
	public void paint(Graphics g) {
		Font f1 = new Font("Arial",Font.ITALIC,60);
		g.setFont(f1);
		g.setColor(Color.pink);
		g.drawString("HELLO" ,80, 80);
		g.setColor(Color .orange);
		g.drawRect(50, 90,300, 280);
		g.fillRect(50, 90,300, 280);
		g.setColor(Color .yellow);
		g.drawOval(60, 100, 280, 260);
		g.fillOval(60, 100, 280, 260);
		g.setColor(Color .black);
		g.drawOval(100, 160, 60, 60);
		g.fillOval(100, 160, 60, 60);
		g.setColor(Color .black);
		g.drawOval(240,160,60,60);
		g.fillOval(240,160,60,60);
		g.setColor(Color .black);
		g.drawLine(200,200, 200, 270);
		g.drawArc(120, 180, 160, 160, 180, 180);

		
		
	}
}

public class FirstGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  TestGui f  = new TestGui();
			  f.setTitle("FIrst Frame");
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