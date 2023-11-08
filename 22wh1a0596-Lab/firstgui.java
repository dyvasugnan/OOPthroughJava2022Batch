package pranavi;
import java.awt.*;
import java.awt.event.*;

class TestGui extends Frame{
	public void paint(Graphics g) {
		Font f = new Font("Sans Comic",Font.BOLD,20);
		g.setFont(f);
		g.drawRect(100,100,500,500);
		g.drawOval(175,175,350, 350);
		g.drawOval(250,270,30,30);
		g.drawOval(420,270,30,30);
		g.drawLine(350,300,350,400);
		g.drawArc(275,320,150, 150, 180, 180);
		g.drawString("Hello Smiley",300, 570);
	}
}
public class FirstGui {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGui f = new TestGui();
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new TestClass());
	}

}
class TestClass extends WindowAdapter{
	public void windowClosing(WindowEvent we){
	System.exit(0);
	}
}
