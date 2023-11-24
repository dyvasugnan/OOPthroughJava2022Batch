package cseb;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame  {
	public void paint(Graphics g) {
		// text message at the top
		Font f1 = new Font("Arial", Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.CYAN);
		g.drawString("Smiley face",300,90);
		// Rectangle box 
		g.setColor(Color.BLACK);
		g.fillRect(100,100,600,600);
		g.drawRect(100,100,600,600);
		// circle inside the box
		g.setColor(Color.YELLOW);
		g.fillOval(150,150,500,500);
		g.drawOval(150,150,500,500);
		// 2 small circles inside the big cirle for eyes
		g.setColor(Color.BLACK);
		g.fillOval(270,270,50,50);
		g.drawOval(270,270,50,50);
		// 2 small circles inside the big cirle for eyes
		g.setColor(Color.BLACK);
		g.fillOval(480,270,50,50);
		g.drawOval(480,270,50,50);
		// line for nose
		g.setColor(Color.BLACK);
		g.drawLine(390,300,390,430);
		// arc for smile 
		g.setColor(Color.BLACK);
		g.fillArc(250,300,300,300,180,180);
		g.drawArc(250,300,300,300,180,180);
	}
}
public class FirstGUI 
	public static void main(String[] args) {
		TestGui f = new TestGui();
			f.setVisible(true); // to make the window visible we write this
			f.setSize(800,800); // Here in the window we can use minimize and maximize but the close funtion wont be working 
			f.addWindowListener(new MyClass());
	}
}
class MyClass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);         // to close the window we wrote the sub class
	}
}
