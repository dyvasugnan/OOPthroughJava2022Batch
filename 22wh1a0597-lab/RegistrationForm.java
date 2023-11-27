package package1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameButtons extends Frame {
    Checkbox c1,c2,c3;
    Button b1, b2;
    TextField t1, t2, t3, t4;
    Label l1, l2,l3,l4;

    FrameButtons() {

        b1 = new Button("Save details");
        b2 = new Button("Update details");

        t1 = new TextField(15);
        t2 = new TextField(25);
        t3 = new TextField(35);
        t4 = new TextField(45);

        l1 = new Label("Name");
        l2 = new Label("Fathers Name");
        l3 = new Label("email");
        l4 = new Label("Hobbies");

        b1.setBounds(300, 700, 150, 50);
        b2.setBounds(500, 700, 150, 50);

        t1.setBounds(450, 150, 250, 40);
        t2.setBounds(450, 250, 250, 40);
        t3.setBounds(450, 350, 250, 40);
        t4.setBounds(450, 450, 250, 40);

        l1.setBounds(250, 150, 250,70);
        l2.setBounds(250, 250, 250, 70);
        l3.setBounds(250, 350, 250, 70);
        l4.setBounds(450, 450, 250, 70);

        Font labelFont = new Font("Arial", Font.BOLD, 16);
        l1.setFont(labelFont);
        l2.setFont(labelFont);
        l3.setFont(labelFont);
        l4.setFont(labelFont);
        b1.setFont(labelFont);
        b2.setFont(labelFont);

        Checkbox c1 = new Checkbox();
        Checkbox c2 = new Checkbox("English");
        Checkbox c3 = new Checkbox("Hindi", true);

        this.add(b1);
        this.add(b2);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.setBackground(Color.pink);
    }


    public static void main(String[] args) {
        FrameButtons f = new FrameButtons();
        f.setTitle("Registration Form");
        f.setVisible(true);
        f.setSize(1000, 1000);
        f.addWindowListener(new Theclass());
        
    }
}

class Theclass extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
