package cseb;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

class Swing_FileRead extends JFrame implements ActionListener{
    JMenuBar mb;
    JFileChooser jf;
    JMenu file,edit,help,font;
    JLabel l;
    JMenuItem op,sv,ex;
    Swing_FileRead(){
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
        new Swing_FileWrite(jf.getSelectedFile());
    }
}
class Swing_FileWrite extends JFrame{
    JLabel ta;
    Swing_FileWrite(File file){
        Container c=getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);    
        c.setLayout(new FlowLayout());
        ta=new JLabel();
        c.add(ta);
        String s=" ";
        String s1 = "";
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            while((s=br.readLine())!=null) {
              s1=s1+s;
              }
            
            ta.setText(s1);
            br.close();
        }
        catch(Exception e) {
    }
    
}}
public class FileReadGUI {
    public static void main(String[] args) {
        new Swing_FileRead();
    }
}