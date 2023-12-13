package LearningJava;

import java.awt.*;
import java.awt.event.*;

class MyButton23 extends Frame implements ActionListener {
    Button b1, b2, b3, b4;
    int ovalY = 150;
    int ovalX = 150;
    TextField t1;
    Label l1;

    MyButton23() {
        this.setLayout(null);
        b1 = new Button("UP");
        b2 = new Button("DOWN");
        b3 = new Button("LEFT");
        b4 = new Button("RIGHT");
        t1 = new TextField();
        l1 = new Label("BALL MOVEMENT");
        b1.setBounds(100, 300, 50, 20);
        b2.setBounds(200, 300, 50, 20);
        b3.setBounds(100, 350, 50, 20);
        b4.setBounds(200, 350, 50, 20);
        t1.setBounds(100, 400, 150, 30);
        l1.setBounds(100, 50, 210, 40);
        Font f1 = new Font("Serif",Font.ITALIC,25);
        l1.setFont(f1);
        l1.setBackground(Color.cyan);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(t1);
        this.add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        t1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str1 = ae.getActionCommand();
        switch (str1) {
            case "UP":
                if (ovalY - 10 >= 0) {
                    ovalY -= 10;
                } else {
                    t1.setText("No Action can be performed.");
                }
                break;
            case "DOWN":
                if (ovalY + 10 <= this.getHeight() - 60) {
                    ovalY += 10;
                } else {
                	t1.setText("No Action can be performed.");
                }
                break;
            case "LEFT":
                if (ovalX - 10 >= 0) {
                    ovalX -= 10;
                } else {
                	t1.setText("No Action can be performed.");
                }
                break;
            case "RIGHT":
                if (ovalX + 10 <= this.getWidth() - 60) {
                    ovalX += 10;
                } else {
                	t1.setText("No Action can be performed.");
                }
                break;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(ovalX, ovalY, 60, 60);
        g.setColor(Color.red);
        g.fillOval(ovalX, ovalY, 60, 60);
        //Font f1 = new Font("Arial", Font.BOLD, 30);
        //g.setFont(f1);
        //g.setColor(Color.black);
        //g.drawString("BAll MOVEMENT", 70, 100);
    }
}

public class BallMove {
    public static void main(String[] args) {
        MyButton23 f = new MyButton23();
        f.setTitle("SET");
        f.setVisible(true);
        f.setSize(450, 450);
        f.setBackground(Color.cyan);
        f.addWindowListener(new MyClass2());
    }
}

class MyClass2 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
