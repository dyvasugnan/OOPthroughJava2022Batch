package guiA2;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		Font f1 = new Font("Arial",Font.BOLD,30);
		g.drawString("HELLO MESSAGE",285,95);
		g.drawRect(30,60,200,200);
		g.setColor(Color.blue);
		g.fillRect(30,60,200,200);
		
	
	g.drawOval(60,90, 150, 150);
	g.setColor(Color.yellow);
	g.fillOval(60,90, 150, 150);
	g.setColor(Color.black);
	g.fillOval(80,130, 40, 40);
	g.drawOval(80,130, 40, 40);
	g.drawOval(150,130, 40, 40);
	g.fillOval(150,130, 40, 40);
	
	g.drawLine(135,140,135,180);

	g.drawArc(99,200,70,30,900,200);
	
		
		
	}
}
public class firstGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGui  f = new TestGui();
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
