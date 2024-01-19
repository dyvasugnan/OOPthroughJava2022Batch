package cseb;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
class FrameDemo extends JFrame implements ActionListener{
    JMenuBar mb;
    JLabel l;
    JFileChooser jf;
    File fl;
    JMenu file,edit,help;
    JMenuItem op,sv,ext;
    FrameDemo(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        mb = new JMenuBar();
        c.add("north",mb);
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        op = new JMenuItem("Open");
        sv = new JMenuItem("Save");
        ext = new JMenuItem("exist");
        file.add(op);
        op.setMnemonic('o');
        file.add(sv);
        file.add(ext);
        ext.setEnabled(false);
        file.addSeparator();
        op.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(op.isArmed()){
            jf = new JFileChooser(FileSystemView.getFileSystemView());
            int i = jf.showOpenDialog(null);
            if(i == JFileChooser.APPROVE_OPTION){
                fl = jf.getSelectedFile();
                String fname = fl.getPath();
                NewFrame nf = new NewFrame(fname);
                    nf.setSize(800, 800);
                    nf.setVisible(true);
            }
        }
    }
}
public class Menubar {
    public static void main(String[] args) {
        FrameDemo f1 = new FrameDemo();
        f1.setSize(800, 800);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}