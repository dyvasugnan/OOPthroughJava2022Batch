package JAVA;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FrameDemos extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu file,help,edit;
	JMenuItem op,sv,ext;
	FrameDemos(){
		Container c= getContentPane();
		c.setLayout(new BorderLayout());
		mb=new JMenuBar();
		c.add("North",mb);
		file=new JMenu("File");
		help=new JMenu("Help");
		edit=new JMenu("Edit");
		mb.add(file);
		mb.add(help);
		mb.add(edit);
		op=new JMenuItem("Open");
		sv=new JMenuItem("Save");
		ext=new JMenuItem("Exit");
		file.add(op);
		file.add(sv);
		file.add(ext);
	}

	public void ActionPerformed(ActionEvent ae) {
	}
}

public class MenuDemo {
	public static void main(String[] args) {
		FrameDemos f=new FrameDemos();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}