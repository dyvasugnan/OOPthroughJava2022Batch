package package1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calci1 extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    Label l1, l2, l3;
    TextField t1;
    double num1, num2, result;
    String operator;

    Calci1() {
        this.setLayout(new BorderLayout());
        Panel pp = new Panel(new GridLayout(4, 4));
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("*");
        b14 = new Button("/");
        b15 = new Button("=");
        b16 = new Button("c");
        t1 = new TextField();

        this.add(t1, BorderLayout.NORTH);
        this.add(pp);

        pp.add(b1);
        pp.add(b2);
        pp.add(b3);
        pp.add(b4);
        pp.add(b5);
        pp.add(b6);
        pp.add(b7);
        pp.add(b8);
        pp.add(b9);
        pp.add(b10);
        pp.add(b11);
        pp.add(b12);
        pp.add(b13);
        pp.add(b14);
        pp.add(b15);
        pp.add(b16);

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

    public double Add(double x, double y) {
        return x + y;
    }

    public double Sub(double n1, double n2) {
        return n1 - n2;
    }

    public double Mul(double n1, double n2) {
        return n1 * n2;
    }

    public double Div(double n1, double n2) {
        return n1 / n2;
    }

    public void actionPerformed(ActionEvent ae) {
        String str;
        str = ae.getActionCommand();
        if (str.equals("1")) {
            t1.setText(t1.getText() + "1");
        } else if (str.equals("2")) {
            t1.setText(t1.getText() + "2");
        } else if (str.equals("3")) {
            t1.setText(t1.getText() + "3");
        } else if (str.equals("4")) {
            t1.setText(t1.getText() + "4");
        } else if (str.equals("5")) {
            t1.setText(t1.getText() + "5");
        } else if (str.equals("6")) {
            t1.setText(t1.getText() + "6");
        } else if (str.equals("7")) {
            t1.setText(t1.getText() + "7");
        } else if (str.equals("8")) {
            t1.setText(t1.getText() + "8");
        } else if (str.equals("9")) {
            t1.setText(t1.getText() + "9");
        } else if (str.equals("0")) {
            t1.setText(t1.getText() + "0");
        } else if (str.equals("+")) {
            t1.setText(t1.getText() + "+");
        } else if (str.equals("-")) {
            t1.setText(t1.getText() + "-");
        } else if (str.equals("*")) {
            t1.setText(t1.getText() + "*");
        } else if (str.equals("/")) {
            t1.setText(t1.getText() + "/");
        }

        else if (str.equals("=")) {
            // num2 = Double.parseDouble(t1.getText());
            switch (operator) {
                case "+":
                    result = Add(num1, num2);
                    break;
                case "-":
                    result = Sub(num1, num2);
                    break;
                case "*":
                    result = Mul(num1, num2);
                    break;
                case "/":
                    result = Div(num1, num2);
                    break;
            }
            t1.setText(Double.toString(result));
        }

        else if (str.equals("c")) {
            t1.setText("");
        }
    }
}
    public class MiniCalciP{
    public static void main(String[] args) {
        Calci1 g1 = new Calci1();
        g1.setTitle("Calculator");
        g1.setVisible(true);
        g1.setSize(600, 600);
        g1.setBackground(Color.pink);
        g1.addWindowListener(new Demo1());
    }
    }
 class Demo1 extends WindowAdapter {
        public void windowClosing(WindowEvent w) {
            System.exit(0);
        }
    }

