package LearningJava2;
import java.awt.*;
import java.awt.event.*;

class Banner extends Frame implements Runnable {
    String str = "BVRITH";
    Banner() {
        setLayout(null);
        setBackground(Color.CYAN);
        setForeground(Color.RED);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(str, 50, 100);
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(700);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            char ch = str.charAt(0);
            str = str.substring(1, str.length());
            str += ch;
        }
    }
}

public class BvritBanner {
    public static void main(String[] args) {
        Banner b = new Banner();
        b.setSize(200, 200);
        b.setVisible(true);
        b.addWindowListener(new Myclass());
        Thread t = new Thread(b);
        t.start();
    }
}

class Myclass extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

