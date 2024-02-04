import javax.swing.*;

import java.awt.event.*;

class Converter extends JFrame implements ActionListener, KeyListener {

    JButton b1;
    JTextArea t1, t2;
    JLabel l1, l2;

    Converter() {
        this.setLayout(null);
        l1 = new JLabel("Celsius:");
        l2 = new JLabel("Fahrenheit:");
        t1 = new JTextArea();
        t2 = new JTextArea();
        b1 = new JButton("Convert");
        l1.setBounds(100, 100, 100, 40);
        l2.setBounds(100, 150, 100, 40);
        t1.setBounds(200, 100, 100, 40);
        t2.setBounds(200, 150, 100, 40);
        b1.setBounds(130, 200, 100, 40);
        this.add(t1);
        this.add(t2);
        this.add(l1);
        this.add(l2);
        this.add(b1);

        b1.addActionListener(this);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Convert")) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            if (s2.equals("")) {
                float num = Float.parseFloat(s1);
                float res = (9 * num) / 5 + 32;
                t2.setText(Float.toString(res));
            }
            if (s1.equals("")) {
                float num = Float.parseFloat(s2);
                float res = 5 * (num - 32) / 9;
                t1.setText(Float.toString(res));
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            b1.doClick();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}

public class TempConveter {
    public static void main(String[] args) {
        Converter c = new Converter();
        c.setVisible(true);
        c.setSize(400, 400);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}