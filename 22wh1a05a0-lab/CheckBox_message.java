package cseb;
import java.awt.*;
import java.awt.event.*;

class MyButton extends Frame implements ItemListener {
    TextField t1;
    Label title;
    Checkbox c1, c2, c3;

    MyButton() {
        // Frame setup
        this.setLayout(null);
        this.setBackground(Color.pink);

        // Components setup
        title = new Label("messages Check boxes");
        t1 = new TextField(32);
        c1 = new Checkbox("Bold");
        c2 = new Checkbox("Italic");
        c3 = new Checkbox("Underline", true);

        // Set positions and sizes for components
        title.setBounds(40, 40, 275, 70);
        Font f1 = new Font("Bold", Font.ITALIC, 25);
        title.setFont(f1);
        t1.setBounds(300, 150, 300, 20);
        c1.setBounds(210, 350, 50, 25);
        c2.setBounds(260, 350, 55, 25);
        c3.setBounds(315, 350, 70, 25);

        // Add components to the frame
        this.add(title);
        this.add(t1);
        this.add(c1);
        this.add(c2);
        this.add(c3);

        // Add item listener to checkboxes
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        // Update the text field based on checkbox states
        String message = "selected : ";
        if (c1.getState()) {
            message += " Bold ";
        }
        if (c2.getState()) {
            message += " Italic ";
        }
        if (c3.getState()) {
            message += " Underline";
        }

        t1.setText(message);
    }
}

public class Checkboxes {
    public static void main(String[] args) {
        MyButton f = new MyButton();
        f.setTitle("Checkbox messages");
        f.setVisible(true);
        f.setSize(650, 650);
        f.addWindowListener(new MyClass());
    }
}

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
