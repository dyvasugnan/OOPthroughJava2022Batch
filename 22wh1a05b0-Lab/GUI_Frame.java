//Frame in Java
import java.awt.*;
import java.awt.event.*;

public class GUI_Frame {
	public static void main(String[] args) {
			TestGUI f = new TestGUI();
			f.setVisible(true);
			f.setSize(400 , 400);
			f.addWindowListener(new MyClass());
			
	}
}

class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class TestGUI extends Frame{
	public void paint(Graphics g) {
		Font f1 = new Font("Lucida Calligraphy",Font.PLAIN,20);
		g.setFont(f1);
		g.setColor(Color.MAGENTA);
		g.drawString("Always Be Happy...",100, 80);
		
		g.drawRect(100,100,200,200);	//Rectangle
		g.setColor(Color.lightGray);
		g.fillRect(100,100,200,200);
		
		g.drawOval(125,125,150,150);	//Face
		g.setColor(Color.yellow);
		g.fillOval(125,125,150,150);
		
		g.drawOval(160, 160, 20, 20);	//Eye 1
		g.setColor(Color.black);
		g.fillOval(160, 160, 20, 20);
		
		g.drawOval(220, 160, 20, 20);	//Eye 2
		g.setColor(Color.black);
		g.fillOval(220, 160, 20, 20);
		
		g.drawLine(200, 190, 200, 210);//Nose
		
		g.drawArc(163, 180, 75, 75, 180, 180);	//Smile
	}
}