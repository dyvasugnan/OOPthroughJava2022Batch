package cseb;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g) {
		
		Font f1=new Font ("Arial",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.GRAY);
		g.drawString("Hello ",250,100);
		g.setColor(Color.blue);
		
		
		
		g.setColor(Color.blue);
		g.drawRect(100, 200,400, 400);
		g.fillRect(100, 200,400, 400);
		
		
		g.setColor(Color.yellow);
		g.drawOval(150, 250, 300, 300);
		g.fillOval(150, 250, 300, 300);
		
		g.setColor(Color.black);
		g.drawOval(200,300,50,50);
		g.fillOval(200,300,50,50);
		
		
		
		
		
		g.setColor(Color.black);
		g.drawOval(350,300,50,50);
		g.fillOval(350,300,50,50);
		
		g.setColor(Color.black);
		g.drawLine(300, 300, 300, 400);
		
		g.setColor(Color.black);
		g.drawArc(210, 270, 200,200, -140, 100);
		
		
		
	}
}

	

public class FristGUI {

	public static void main(String[] args) {
		TestGui f=new TestGui(); //f.setTitle("First Frame);
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

class Button extends Frame{
	f1.add(button b1);
}