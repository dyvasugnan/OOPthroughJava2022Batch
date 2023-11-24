package prathibha5b8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyBtn extends Frame implements ActionListener {

    private static final long serialVersionUID = 1L;
    Button equal, clear;
    Label Res;
    TextField t1;

    MyBtn() {
        this.setLayout(null);
        t1 = new TextField();
        equal = new Button("=");
        clear = new Button("CLEAR");
        t1.setBounds(500, 150, 300, 40);
        equal.setBounds(500, 250, 100, 40);
        clear.setBounds(700, 250, 100, 40);
        this.add(t1);
        this.add(equal);
        this.add(clear);
        equal.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str1 = ae.getActionCommand();

        if (str1.equals("=")) {
            String expression = t1.getText();
            String[] operands = expression.split("\\+|-|\\*|/"); // Splitting the expression based on operators

            if (operands.length == 2) {
                int x1 = Integer.parseInt(operands[0].trim());
                int y1 = Integer.parseInt(operands[1].trim());
                int c1 = 0;

                if (expression.contains("+")) {
                    c1 = x1 + y1;
                    String res12 = Integer.toString(c1);
                    t1.setText(res12);
                } else if (expression.contains("-")) {
                    c1 = x1 - y1;
                    String res12 = Integer.toString(c1);
                    t1.setText(res12);
                } else if (expression.contains("*")) {
                    c1 = x1 * y1;
                    String res12 = Integer.toString(c1);
                    t1.setText(res12);
                } else if (expression.contains("/")) {
                	try {
                    c1 = x1 / y1;
                    String res12 = Integer.toString(c1);
                    t1.setText(res12);
                	}
                	catch(ArithmeticException ae1) {
                		t1.setText("Error");                	}
                }

                 
            }
        }

        if (str1.equals("CLEAR")) {
            t1.setText("");
             // Clear the result label as well
        }
    }
}

class MyClsss1 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

public class Calculator {
    public static void main(String[] args) {
        MyBtn f = new MyBtn();
        f.setSize(1000, 600); // Increased the height for better visibility
        f.setVisible(true);
        f.addWindowListener(new MyClsss1());
    }
}
