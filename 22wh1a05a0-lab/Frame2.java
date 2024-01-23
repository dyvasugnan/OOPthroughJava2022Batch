package cseb;
import java.awt.*;
import java.awt.event.*;

class Frame2 extends Frame implements ActionListener {
    Button b1;
    Label l1;

    Frame2() {
        this.setLayout(null);
        b1 = new Button("back");
        l1 = new Label("  Hello ");
        b1.setBounds(150, 250, 100, 50);
        l1.setBounds(150, 190, 100, 50);
        this.add(b1);
        this.add(l1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.dispose();
             // Close the current frame
        }
    }
}