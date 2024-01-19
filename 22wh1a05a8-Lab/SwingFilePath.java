package cse_c;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileSystemView;
class Swing1 extends JFrame implements ActionListener{
	JMenuBar mb;
	JFileChooser jf;
	JMenu file,edit,help,font;
	JLabel l;
	JMenuItem op,sv,ex;
	Swing1(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
			mb = new JMenuBar();
			c.add("North",mb);
			file = new JMenu("File");
			edit = new JMenu("Edit");
			help = new JMenu("Help");
			setJMenuBar(mb);
			mb.add(file);
			mb.add(edit);
			mb.add(help);
			l = new JLabel();
			c.add(l);
			op = new JMenuItem("Open");
			sv  = new JMenuItem("Save");
			ex = new JMenuItem("Exit");
			file.add(op);
			file.add(sv);
			file.add(ex);
			ex.setEnabled(false);
			file.addSeparator();
			font = new JMenu("Font");
			file.add(font);
			op.addActionListener(this);
			sv.addActionListener(this);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 400);
	        setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(op.isArmed())
			jf = new JFileChooser (FileSystemView.getFileSystemView());
		jf.showOpenDialog(null);
		l.setText(jf.getSelectedFile().getAbsolutePath());
	}
}
public class SwingFilePath {
	public static void main(String[] args) {
		new Swing1();
	}
}
