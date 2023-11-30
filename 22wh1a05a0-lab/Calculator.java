package cseb;
import java.awt.event.*;
import java.awt.*;
public class Calculator extends Frame implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    TextArea t1;
    Calculator() {
        this.setLayout(new BorderLayout());
        t1 = new TextArea(3, 5);
        add(t1, BorderLayout.NORTH);
        Panel p = new Panel(new GridLayout(4, 4));
        add(p);

        b1 = new Button("7");
        b2 = new Button("8");
        b3 = new Button("9");
        b4 = new Button("/");
        b5 = new Button("4");
        b6 = new Button("5");
        b7 = new Button("6");
        b8 = new Button("*");
        b9 = new Button("1");
        b10 = new Button("2");
        b11 = new Button("3");
        b12 = new Button("-");
        b13 = new Button("CLEAR");
        b14 = new Button("0");
        b15 = new Button("+");
        b16 = new Button("=");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    String s = this.t1.getText();
    if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
        this.t1.setText(s + str);
    }
    if (str.equals("=")) {
        if (s.contains("+")) {
            int n = s.indexOf("+");
            double n1 = Double.parseDouble(s.substring(0, n));
            double n2 = Double.parseDouble(s.substring(n + 1, s.length()));
            this.t1.setText(String.valueOf(n1 + n2));
        }
        if (s.contains("-")) {
            int n = s.indexOf("-");
            double n1 = Double.parseDouble(s.substring(0, n));
            double n2 = Double.parseDouble(s.substring(n + 1, s.length()));
            this.t1.setText(String.valueOf(n1 - n2));
        }
        if (s.contains("*")) {
            int n = s.indexOf("*");
            double n1 = Double.parseDouble(s.substring(0, n));
            double n2 = Double.parseDouble(s.substring(n + 1, s.length()));
            this.t1.setText(String.valueOf(n1 * n2));
        }
        if (s.contains("/")) {
            int n = s.indexOf("/");
            double n1 = Double.parseDouble(s.substring(0, n));
            double n2 = Double.parseDouble(s.substring(n + 1, s.length()));
            try {
                this.t1.setText(String.valueOf(n1 / n2));
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } finally {
                this.t1.setText(String.valueOf(n1 / n2));
            }
        }
    }
    if (str.equals("CLEAR")) {
        this.t1.setText("");
    } else {
        for (int i = 0; i < 10; i++) {
            if (str.equals(String.valueOf(i))) {
                this.t1.setText(s + String.valueOf(i));
                break;
            }
        }
    }
}
    public static void main(String[] args) {
        Calculator f = new Calculator();
        f.setTitle("CALCULATOR");
        f.setVisible(true);
        f.setSize(300, 300);
        f.addWindowListener(new MyClass());
    }
}

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}