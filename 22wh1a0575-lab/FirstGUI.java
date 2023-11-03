package cseb22575;
import java.awt.*;
import java.awt.event.*;
class TestGui extends Frame{
	public void paint(Graphics g) { 
		//abstract method so we cannot change parameters name
		Font f1=new Font ("Arial",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.BLUE);
		g.drawString("HELLO", 200, 70);
		
		g.setColor(Color.pink);
	   	g.drawRect(100, 100, 300, 300);
	   	g.fillRect(100, 100, 300, 300);
	   	
	   	g.setColor(Color.white);
		g.drawOval(150, 150, 200, 200);
		g.fillOval(150,150,200,200);
		
		g.setColor(Color.black);
		g.drawOval(200,200,25,25);
		g.fillOval(200, 200, 25,25);
		
		g.setColor(Color.black);
		g.drawOval(280,200,25,25);
		g.fillOval(280,200, 25,25);
		
		g.setColor(Color.black);
		g.drawArc(225,245,50,50,180,180);
		
		g.setColor(Color.black);
	    g.drawLine(250,220,250,250); 
	}
}
public class FirstGUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGui f= new TestGui();
		f.setVisible(true);
		f.setSize(550,550);
		f.addWindowListener(new MyClass());      //listeners are interfaces
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}