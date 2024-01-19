package cseb;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
class JFrameDemo extends JFrame implements ActionListener{
	File fl;
	JMenuBar mb;
	JMenu file,edit,help,font;
	JMenuItem op,sv,ext;
	JFileChooser jf;
	JLabel l;
	JFrameDemo(){
		Container c = getContentPane();
		setLayout (new BorderLayout());
		mb = new JMenuBar();
		c.add("North",mb);
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		font = new JMenu("Font");
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		op = new JMenuItem("Open");
		op.setMnemonic('o');
		sv = new JMenuItem("Save");
		ext = new JMenuItem("Exit");
		file.add(op);
		file.add(sv);
		file.add(ext);
		file.addSeparator();
		op.addActionListener(this);
		sv.addActionListener(this);
		ext.addActionListener(this);
		l = new JLabel();
		c.add(l);
		file.add(font);
	}
	public void actionPerformed(ActionEvent e) {
		/*if(op.isArmed()){
			jf = new JFileChooser(FileSystemView.getFileSystemView());
			jf.showOpenDialog(null);
			l.setText(jf.getSelectedFile().getAbsolutePath());
		}*/
		if(op.isArmed()) {
			jf = new JFileChooser(FileSystemView.getFileSystemView());
			int i = jf.showOpenDialog(null);
			if(i == JFileChooser.APPROVE_OPTION) {
				fl = jf.getSelectedFile();
				String fn = fl.getPath();
				ReadFileFrame rf = new ReadFileFrame(fn);
				rf.setSize(500,500);
				rf.setVisible(true);
			}
		}
		if(ext.isArmed()) {
			JFrameDemo f = new JFrameDemo();
			f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		if(sv.isArmed()) {
			
		}
	}
}

public class SwingGui {
	public static void main(String[] args) {
		JFrameDemo f = new JFrameDemo();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
