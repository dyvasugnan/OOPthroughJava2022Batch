import java.awt.*;
import java.awt.event.*;

public class Calci implements ItemListener {
    private Frame f;
    private Label label;

    public Calci() {
        f = new Frame("CheckboxGroup Example");

        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("C++", cbg, false);
        checkBox1.setBounds(100, 100, 50, 50);
        Checkbox checkBox2 = new Checkbox("Java", cbg, false);
        checkBox2.setBounds(100, 150, 50, 50);

        f.add(checkBox1);
        f.add(checkBox2);
        f.add(label);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new Myclass());
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        Checkbox sourceCheckbox = (Checkbox) e.getSource();

        if (sourceCheckbox.getLabel().equals("C++")) {
            label.setText("C++ checkbox: Checked");
        } else {
            label.setText("Java checkbox: Checked");
        }
    }

    public static void main(String args[]) {
      new Calci();
    }
}
class Myclass extends WindowAdapter{
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
}
