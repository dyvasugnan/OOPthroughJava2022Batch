package Manvi;

import java.awt.*;
import java.awt.event.*;

class setfact extends Frame implements ActionListener {

    Button b1, b2;
    TextField t1, t2;
    Label l1, l2;

    setfact() {
        this.setLayout(null);

        b1 = new Button("COMPUTE");
        b2 = new Button("CLEAR");
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        t1 = new TextField(15);
        t2 = new TextField(25);
        
        t1.addActionListener(this);
        t2.addActionListener(this);

        l1 = new Label();
        l1.setText("Number:");
        l2 = new Label();
        l2.setText("Factorial:");

        b1.setBounds(200, 350, 100, 50);
        b2.setBounds(400, 350, 100, 50);

        t1.setBounds(400, 150, 150, 50);
        t2.setBounds(400, 250, 150, 50);

        l1.setBounds(200, 150, 150, 50);
        l2.setBounds(200, 250, 150, 50);

        this.add(b1);
        this.add(b2);
        this.add(t1);
        this.add(t2);
        this.add(l1);
        this.add(l2);
    }

    public int factcal(int n) {
        if (n >= 1) {
            return n * (factcal(n - 1));
        } else {
            return 1;
        }
    }

    public void actionPerformed(ActionEvent txt) {
        String t = txt.getActionCommand();
        if (t.equals("COMPUTE")) {
            int n = Integer.parseInt(t1.getText());
            String number = Integer.toString(factcal(n));
            t2.setText(number);
        }
        if (t.equals("CLEAR")) {
            t2.setText("");
            t1.setText("");
        }
    }
public class Fact{
    public static void main(String[] args) {
        setfact ss = new setfact();
        ss.setTitle("Fact Cal");
        ss.setVisible(true);
        ss.setSize(700, 800);
        ss.setBackground(Color.orange);
        ss.addWindowListener(new FactClass());
    }

    static class FactClass extends WindowAdapter {
        public void windowClosing(WindowEvent pe) {
            System.exit(0);
        }
    }
}
}

