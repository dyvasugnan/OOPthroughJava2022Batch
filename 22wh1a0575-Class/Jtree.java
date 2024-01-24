package JAVA;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class TreeDemo extends JFrame implements TreeSelectionListener{
	JTextArea ta;
	String msg=" ";
	JTree tree;
	DefaultMutableTreeNode root,dir1,dir2,file1,file2,file3;
	Container c;
	TreeDemo(){
		c = getContentPane();
        c.setLayout(new BorderLayout());
		root=new DefaultMutableTreeNode("\\:c");
		dir1=new DefaultMutableTreeNode("Java");
		dir2=new DefaultMutableTreeNode("java lab");
		file1=new DefaultMutableTreeNode("unit 1");
		file2=new DefaultMutableTreeNode("unit 2");
		file3=new DefaultMutableTreeNode(".javac");
		root.add(dir1);
		dir1.add(file1);
		dir1.add(file2);
		dir2.add(file3);
		dir1.add(dir2);
		tree=new JTree(root);
		c.add("North",tree);
		ta=new JTextArea(10,10);
		tree.addTreeSelectionListener(this);
		
		
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		TreePath tp=e.getNewLeadSelectionPath();
		msg+="path of the component selected"+tp;
		ta.setText(msg);
		
	}
	
	
}
public class Jtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeDemo td=new TreeDemo();
		td.setSize(400,400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}