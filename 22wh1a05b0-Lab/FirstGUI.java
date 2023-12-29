import java.awt.*;
import java.awt.event.*;

public class FirstGUI {
	public static void main(String[] args) {
		TestGUI f = new TestGUI();
			f.setVisible(true);
			f.setSize(400,400);
			f.addWindowListener(new NewClass());
	}
}

class NewClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class TestGUI extends Frame {
	public void paint(Graphics g) {
		
		g.drawRect(50, 50, 300, 300);
		g.setColor(Color.PINK);
		g.fillRect(50, 50, 300, 300);
		
		g.drawOval(100, 100, 200 ,200);
		g.setColor(Color.ORANGE);
		g.fillOval(100, 100, 200 ,200);
		
		g.drawOval(135,  150,  25, 25);
		g.setColor(Color.black);
		g.fillOval(135,  150,  25, 25);
				
		g.drawOval(238, 150, 25, 25);
		g.setColor(Color.black);
		g.fillOval(238, 150, 25, 25);
				
		g.drawLine(200,180,200,205);
		
		g.drawArc(150,170,100,100,180,180);
		

Font f1= new Font ("Constantia",Font.BOLD,30);
g.setFont(f1);
g.setColor(Color.MAGENTA);
g.drawString("HI GURLIE!",120,340);
g.setColor(Color.blue);
	}
}


