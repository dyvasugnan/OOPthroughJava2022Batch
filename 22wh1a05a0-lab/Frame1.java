package cseb;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends Frame implements ActionListener {
    Button b1, b2;

    MainFrame() {
        this.setLayout(null);
        b1 = new Button("next");
        b2 = new Button("close");
        b1.setBounds(350, 350, 100, 50);
        b2.setBounds(350, 500, 100, 50);
        this.add(b1);
        this.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            Frame2 f2 = new Frame2();
            f2.setSize(400, 400);
            f2.setVisible(true);
            f2.setTitle("Frame2");
            f2.setBackground(Color.gray);
            //this.isDisplayable();
        }
        if (ae.getSource() == b2) {
            System.exit(0);
        }
    }
}

class Frame1 {
    public static void main(String[] args) {
        MainFrame g1 = new MainFrame();
        g1.setTitle("Frame1");
        g1.setVisible(true);
        g1.setSize(800, 800);
        g1.setBackground(Color.pink);
        g1.addWindowListener(new Name());
    }
}

class Name extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}