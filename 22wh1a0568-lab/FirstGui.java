package cseb;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint (Graphics g) {
		Font f1 = new Font("Arial",Font.ITALIC,60);
		g.setFont(f1);
		g.setColor(Color.PINK);
		g.drawString("HEYYYYYYYY", 100, 100);
		g.drawRect(200, 200, 190, 190);
		g.fillRect(200,200,190,190);
		g.setColor(Color.yellow);
		g.drawOval(210, 210, 170, 170);
		g.fillOval(210, 210, 170, 170);
		g.setColor(Color.black);
		g.drawOval(250, 250, 20, 20);
		g.fillOval(250, 250, 20, 20);
		g.drawOval(320, 250, 20, 20);
		g.fillOval(320, 250, 20, 20);
		g.drawLine(295, 250, 295, 320);
		g.drawArc(250, 250, 100, 100, 180, 180);
		this.setBackground(Color.green);
	}
}
public class FirstGui {
	public static void main(String[] args) {
		Frame f = new TestGui();
			  f.setVisible(true);
			  f.setSize(600, 600);
			  f.addWindowListener(new MyClass());

}}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}