package cse22575;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
@SuppressWarnings("serial")
class MenuDemo extends JFrame implements ActionListener{
	JFileChooser jf;
	JMenuBar mb;
	JLabel l;
	File f1;
	JMenu file,edit,help,font;
	JMenuItem op,sv,ext,ct,cp,pst;
	MenuDemo(){
		Container c= getContentPane();
		c.setLayout(new BorderLayout());
		mb=new JMenuBar();
		c.add("North",mb);
		l=new JLabel();
		this.add(l);
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		op=new JMenuItem("Open");
		sv=new JMenuItem("Save");
		ext=new JMenuItem("Exit");
		ct=new JMenuItem("Cut");
		cp=new JMenuItem("Copy");
		pst=new JMenuItem("Paste");
		file.add(op);
		op.setMnemonic('O');
		file.add(sv);
		file.add(ext);
		file.addSeparator();
		edit.add(ct);
		edit.add(cp);
		edit.add(pst);
		ext.setEnabled(false);
		font=new JMenu("Font");
		file.add(font);	
		op.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(op.isArmed()) {
			JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());
			jf.showOpenDialog(null);
			l.setText(jf.getSelectedFile().getAbsolutePath());
			int i=jf.showOpenDialog(null);
			if(i==JFileChooser.APPROVE_OPTION) {
				f1=jf.getSelectedFile();
				String fname=f1.getPath();
				NewFrame n=new NewFrame(fname);
				n.setSize(500,500);
				n.setVisible(true);
			}
		}
	}
}
public class CreateMenu {
	public static void main(String[] args){
		MenuDemo m=new MenuDemo();
		m.setVisible(true);
		m.setSize(400,400);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}










//SECOND FRAME



package cse22575;
import java.awt.*;
import java.io.*;
import javax.swing.*;
@SuppressWarnings("serial")
class NewFrame extends JFrame {
	JTextArea ta;
	NewFrame(String fname){
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		ta=new JTextArea(15,30);
		c.add(ta);
		String s="";
		String s1="";
		try {
			BufferedReader br=new BufferedReader(new FileReader(fname));
			while((s=br.readLine())!=null) {
				s1+=s+" ";
				ta.setText(s1);
				br.close();
			}
		}
		catch(Exception e) {
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}