package java_third_lab;
import java.awt.*;
import java.awt.event.*;

class TestGUI extends Frame{
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.drawRect(40, 80, 300, 300);
		g.setColor(Color.red);
		g.drawOval(60, 100, 260, 260);
		g.setColor(Color.yellow);
		g.fillOval(60, 100, 260, 260);
		g.setColor(Color.blue);
		g.drawOval(120,160,20,30);
		g.drawOval(240,160, 20,30);
		g.drawLine(190,250,190,180);
		g.drawArc(140, 200, 100, 100, 180, 180);
		Font f1=new Font("Arial",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("NIKITHA",140, 60);
	}
}

public class FirstGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI f=new TestGUI();
		f.setTitle("First Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.setBackground(Color.gray);
		f.addWindowListener(new MyClass());
		/*Button b=new Button("Button");
		b.setVisible(true);
		b.setSize(50,50);*/
		
		
	}

}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
