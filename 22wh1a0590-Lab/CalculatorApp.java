import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calculator extends Frame implements ActionListener {
    TextField operand1, operand2, result;
    Button add, subtract, multiply, divide;

    Calculator() {
        operand1 = new TextField();
        operand2 = new TextField();
        result = new TextField();

        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");

        operand1.setBounds(50, 50, 100, 20);
        operand2.setBounds(50, 80, 100, 20);
        result.setBounds(50, 110, 100, 20);

        add.setBounds(50, 150, 40, 20);
        subtract.setBounds(100, 150, 40, 20);
        multiply.setBounds(150, 150, 40, 20);
        divide.setBounds(200, 150, 40, 20);

        this.add(operand1);
        this.add(operand2);
        this.add(result);

        this.add(add);
        this.add(subtract);
        this.add(multiply);
        this.add(divide);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        this.setLayout(null);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            double num1 = Double.parseDouble(operand1.getText());
            double num2 = Double.parseDouble(operand2.getText());
            double res = 0;

            String str = ae.getActionCommand();

            switch (str) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        res = num1 / num2;
                    } else {
                        result.setText("Cannot divide by zero");
                        return;
                    }
                    break;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException e) {
            result.setText("Invalid input");
        }
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setTitle("Calculator");
        calculator.setSize(300, 250);
        calculator.setVisible(true);
        calculator.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
