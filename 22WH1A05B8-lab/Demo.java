package cse5b8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;



class FrameDemo extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mb;
	JMenu file,edit,help,font;
	JLabel l;
	File f1;
	JMenuItem op,sv,ext,ct,cp,pst,it,b,u;
	FrameDemo(){
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		mb=new JMenuBar();
		c.add("North",mb);
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		l=new JLabel();
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		op=new JMenuItem("Open");
		sv=new JMenuItem("Save");
		ext=new JMenuItem("Exit");
		file.add(op);
		op.setMnemonic('o');
		file.add(sv);
		file.add(ext);
		ext.setEnabled(false);
		op.addActionListener(this);
		ct=new JMenuItem("Cut");
		cp=new JMenuItem("Copy");
		pst=new JMenuItem("paste");
		it=new JMenuItem("Italic");
		b=new JMenuItem("Bold");
		u=new JMenuItem("UnderLined");
		edit.add(ct);
		edit.add(cp);
		edit.add(pst);
		file.addSeparator();
		font=new JMenu("Font");
		file.add(font);
		font.add(it);
		font.add(b);
		font.add(u);
		this.add(l);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(op.isArmed()) {
			JFileChooser jf=new JFileChooser();
			jf.showOpenDialog(null);
			}
		if(op.isArmed()) {
			JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());
			jf.showOpenDialog(null);
			l.setText(jf.getSelectedFile().getAbsolutePath());
			
		}
		if(op.isArmed()) {
			JFileChooser jf = new JFileChooser();
			int i=jf.showOpenDialog(null);
			if(i==JFileChooser.APPROVE_OPTION) {
				f1=jf.getSelectedFile();
				String fname=f1.getPath();
				NewFrame nf = null;
				try {
					nf = new NewFrame(fname);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				nf.setSize(500,500);
				nf.setVisible(true);
			}
		}
	}
	
	
}
public class Demo {

	public static void main(String[] args) {
		
		JFrame jf = new FrameDemo();
        jf.setSize(500, 500);
        jf.setVisible(true);

	}

}
