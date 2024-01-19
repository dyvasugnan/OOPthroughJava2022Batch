package Java22543;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class FrameDemo extends JFrame implements ActionListener{
	File f1;
	JLabel l;
	JMenuBar mb;
	JMenu file,edit,help,font;
	JMenuItem op,sv,ext,ct,cp,pst;
	JFileChooser jf;
	FrameDemo(){
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		mb=new JMenuBar();
		c.add("North",mb);
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		font=new JMenu("Font");
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		mb.add(font);
		op=new JMenuItem("open");
		sv=new JMenuItem("Save");
		ext=new JMenuItem("Exit");
		file.add(op);
		file.add(sv);
		file.add(ext);
		file.addSeparator();
		file.add(font);
		op.setMnemonic('o');
		ext.setEnabled(false);
		
		op.addActionListener(this);
		sv.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae) {
		if(op.isArmed()) {
			jf=new JFileChooser();
			int i=jf.showOpenDialog(null);
			if(i==JFileChooser.APPROVE_OPTION) {
				f1=jf.getSelectedFile();
				String fname=f1.getPath();
				NewFrame nf=new NewFrame(fname);
				nf.setSize(500,500);
				nf.setVisible(true);
			}
			
		}
	}
}
public class Menubar{
	public static void main(String[] args) {
		FrameDemo f=new FrameDemo();
		f.setSize(800,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
