import java.awt.*;
import java.awt.event.*;

class Calcii extends Frame implements ActionListener {

    Button b1, b2, b3, b4, b5, b6;
    TextField t1;
    double num1, num2;
    char operator;

    Calcii() {
        this.setLayout(null);
        this.setBackground(Color.pink);

        b1 = new Button("+");
        b1.setBounds(125, 300, 100, 50);
        b1.addActionListener(this);
        this.add(b1);

        b2 = new Button("-");
        b2.setBounds(275, 300, 100, 50);
        b2.addActionListener(this);
        this.add(b2);

        b3 = new Button("*");
        b3.setBounds(425, 300, 100, 50);
        b3.addActionListener(this);
        this.add(b3);

        b4 = new Button("/");
        b4.setBounds(575, 300, 100, 50);
        b4.addActionListener(this);
        this.add(b4);

        b5 = new Button("=");
        b5.setBounds(125, 425, 200, 50);
        b5.addActionListener(this);
        this.add(b5);

        b6 = new Button("CLEAR");
        b6.setBounds(475, 425, 200, 50);
        b6.addActionListener(this);
        this.add(b6);

        t1 = new TextField();
        t1.setBounds(200, 200, 400, 50);
        t1.addActionListener(this);
        this.add(t1);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1 || ae.getSource() == b2 || ae.getSource() == b3 || ae.getSource() == b4) {
            operator = ae.getActionCommand().charAt(0);
            num1 = Double.parseDouble(t1.getText());
            t1.setText("");
        } 
        else if (ae.getSource() == b5) {
            if (operator != 0) {
                num2 = Double.parseDouble(t1.getText());
                double result = performOperation(num1, num2, operator);
                t1.setText(String.valueOf(result));
                operator = 0;
            }
        } 
        else if (ae.getSource() == b6) {
            t1.setText("");
            operator = 0;
        }
    }
    double performOperation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                    return num1 / num2;
            default:
                return 0;
        }
    }
}

public class Calculator {
    public static void main(String args[]) {
        Calcii cal = new Calcii();
        cal.setVisible(true);
        cal.setSize(800, 800);
        cal.addWindowListener(new CalClass());
    }
    static class CalClass extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}