package cse22575;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FrameDemo1 extends JFrame{
	JLabel l;
	FrameDemo1(){
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		l=new JLabel();
		this.add(l);
	}
	public void paint(Graphics g) {
		String name=JOptionPane.showInputDialog("Enter Name");
		g.drawString(name, 200, 200);
	}
}	
public class DemoDialog {
	public static void main(String[] args){
		FrameDemo1 m=new FrameDemo1();
		m.setSize(400,400);
		m.setVisible(true);
		//m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}