package oops;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

class SwingFrame extends JFrame implements ActionListener {
    JMenuBar mb;
    JFileChooser jf;
    JMenu file, edit, help, font;
    JLabel l;
    JMenuItem op, sv, ex;

    SwingFrame() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        mb = new JMenuBar();
        c.add("North", mb);
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        setJMenuBar(mb);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        l = new JLabel();
        c.add(l, BorderLayout.SOUTH);

        op = new JMenuItem("Open");
        sv = new JMenuItem("Save");
        ex = new JMenuItem("Exit");
        file.add(op);
        file.add(sv);
        file.add(ex);
        ex.setEnabled(false);
        file.addSeparator();
        font = new JMenu("Font");
        file.add(font);
        op.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (op.isArmed()) {
            jf = new JFileChooser(FileSystemView.getFileSystemView());
            jf.showOpenDialog(null);
            l.setText(jf.getSelectedFile().getAbsolutePath());

            // Read file and display content in a new frame with JTable
            new FileAsTable(jf.getSelectedFile());
        }
    }
}

class FileAsTable extends JFrame {
    FileAsTable(File file) {
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        c.setLayout(new BorderLayout());

        String[] columnNames = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String firstLine = br.readLine();
            columnNames = (firstLine != null) ? firstLine.split("\\|") : new String[0];
        } catch (Exception e) {}

        Object[][] rowData = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();

            String line;
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (rowData == null)
                    rowData = new Object[tokens.length][columnNames.length];

                if (tokens.length == columnNames.length) {
                    rowData[row] = tokens;
                    row++;
                }
            }
        } catch (Exception e) {}

        JTable table = new JTable(rowData, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        c.add(scrollPane, BorderLayout.CENTER);
    }
}

public class FileAsTableGUI {
    public static void main(String[] args) {
        new SwingFrame();
    }
}
