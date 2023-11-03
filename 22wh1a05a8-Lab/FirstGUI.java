package cseb225a8;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g) {
		Font f1 = new Font("Arial",Font.BOLD,30);
		this.setBackground(Color.BLACK);
		g.setColor(Color.RED);
		g.setFont(f1);
		g.drawString("I'm a smily girl", 180, 400);
		g.setColor(Color.RED);
		g.drawRect(0, 0, 400, 400);
		g.drawOval(20, 40, 350, 350);
		g.drawOval(100, 100, 50, 50);
		g.drawOval(250, 100, 50, 50);
		g.drawLine(200, 100, 200, 200);
		g.drawArc(100, 250, 200, 60, 180, 180);
	}
}
public class FirstGUI {
	public static void main(String[] args) {
	TestGui f = new TestGui();
		f.setVisible(true);
		f.setSize(450,450);
		f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
