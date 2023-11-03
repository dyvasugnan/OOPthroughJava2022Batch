package csb;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawRect(50, 100, 500, 500);
		g.drawOval(80, 150, 400, 300);
		g.drawOval(150, 220, 50, 50);
		g.drawOval(350, 220, 50, 50);
		//g.drawLine( 13, ERROR, ALLBITS, ABORT);
		//g.drawArc(80, 220, 10, 300, 500,400);
	}
}
public class FirstGui extends TestGui {
public static void main(String[] args)
{
	TestGui f = new TestGui();
	f.setVisible(true);
	f.setSize(800,500);
	f.addWindowListener(new MyClass());
	f.add()
}
}
class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
