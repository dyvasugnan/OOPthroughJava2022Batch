import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Mybutton1 extends Frame implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    Label l1, l2, l3;

    TextField t1, t2, t3;

    String currentExpression = "";

    Mybutton1() {
        this.setLayout(new BorderLayout());

        Panel p = new Panel(new GridLayout(4, 4));

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("Div");
        b5 = new Button("Clear");
        b6 = new Button("1");
        b7 = new Button("2");
        b8 = new Button("3");
        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("7");
        b13 = new Button("8");
        b14 = new Button("9");
        b15 = new Button("0");
        b16 = new Button("=");

        t1 = new TextField(50);

        this.add(t1);
        this.add(t1, BorderLayout.NORTH);
        this.add(p);

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

        // Add action listeners
        for (int i = 1; i <= 16; i++) {
            Button btn = (Button) p.getComponent(i - 1);
            btn.addActionListener(this);
        }

        t1.addActionListener(this);
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
        if (n2 != 0) {
            return n1 / n2;
        } else {
            return Double.NaN; // Handle division by zero
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("ADD") || str.equals("SUB") || str.equals("MUL") || str.equals("Div")) {
            // Handle operator buttons
            // Perform calculations based on the operator
            // Update the TextField with the result
            String num1 = currentExpression;
            String operator = str;
            t1.setText("");
            t1.requestFocus();
            currentExpression = num1 + " " + operator + " ";
        } else if (str.equals("=")) {
            // Handle "=" button
            // Perform the calculation
            StringTokenizer st = new StringTokenizer(currentExpression, " ");
            double n1 = Double.parseDouble(st.nextToken());
            String operator = st.nextToken();
            double n2 = Double.parseDouble(st.nextToken());

            double result = 0;
            switch (operator) {
                case "ADD":
                    result = Add(n1, n2);
                    break;
                case "SUB":
                    result = Sub(n1, n2);
                    break;
                case "MUL":
                    result = Mul(n1, n2);
                    break;
                case "Div":
                    result = Div(n1, n2);
                    break;
            }

            t1.setText(Double.toString(result));
            currentExpression = "";
        } else if (str.equals("Clear")) {
            // Handle Clear button
            t1.setText("");
            currentExpression = "";
        } else {
            // Handle number buttons
            // Append the button text to the TextField
            String buttonText = ((Button) ae.getSource()).getLabel();
            t1.setText(t1.getText() + buttonText);
            currentExpression += buttonText;
        }
    }

    public static void main(String[] args) {
        Mybutton1 g1 = new Mybutton1();
        g1.setTitle("Calculator");
        g1.setVisible(true);
        g1.setSize(400, 400);
        g1.setBackground(Color.pink);
        g1.addWindowListener(new Demo());
    }
}

class Demo extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
