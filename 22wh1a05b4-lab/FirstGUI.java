package cseb_5b4;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g) {
		g.drawRect(600, 300, 450, 350);
		g.drawOval(700, 335, 250, 250);
		g.drawOval(750, 400, 30, 30);
		g.drawOval(870, 400, 30, 30);
		g.drawLine(825, 430, 825, 480);
		g.drawArc(795, 500, 60, 30, 180, 180);
		g.setColor(Color.GRAY);
        g.fillOval(750,400,30,30);
	}
}
public class FirstGUI {

	public static void main(String[] args) {
       TestGui f=new TestGui();
             f.setTitle("First Frame");
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