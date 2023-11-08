import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g) {
		g.draw3DRect(60, 60, 200, 200,true);
		g.setColor(Color.pink);
		g.fill3DRect(60, 60, 200, 200, getFocusTraversalKeysEnabled());
		g.drawOval(80,80,170,170);
		g.setColor(Color.yellow);
		g.fillOval(80, 80,170, 170);
		g.drawOval(120,120,20,20);
		g.setColor(Color.black);
		g.fillOval(120, 120, 20, 20);
		g.drawOval(120,120,20,20);
		g.setColor(Color.black);
		g.fillOval(190, 120, 20, 20);
		g.drawLine(170,150,170,170);
		g.drawArc(140,150,60,60, 180, 180);
		g.setColor(Color.red);
		g.fillArc(140,150,60,60, 180, 180);
		
		Font f1 = new Font("Times New Roman",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.gray);
		g.drawString("Hello Message", 200,300);
		
	}
	
}
class FirstGui {
	public static void main(String args[]) {
	TestGui f= new TestGui();//f.setTitle("First Frame")
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
