package JAVA;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FrameDemo extends JFrame implements ActionListener{
	JButton b;
	FrameDemo(){
		Container c = getContentPane();
		setLayout (new FlowLayout());
		b=new JButton("Save");
		c.add(b);
		b.setToolTipText("This is button");
		b.setMnemonic('S');
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
	}
}

public class WindowPanes {
	public static void main(String[] args) {
		FrameDemo f=new FrameDemo();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}