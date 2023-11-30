package gui;
import java.awt.event.*;
import java.awt.*;

class MyButton extends Frame implements ActionListener {

    TextArea t1;
    Button[] buttons;
    String s1, s2;

    MyButton() {
        this.setLayout(new BorderLayout());

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        t1 = new TextArea(3, 30);
        this.add(t1, BorderLayout.NORTH);

        buttons = new Button[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].addActionListener(this); 
            buttonPanel.add(buttons[i]);
        }

        this.add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < buttons.length; i++) {
            if (ae.getSource() == buttons[i]) {
                String buttonText = buttons[i].getLabel();


                if (!buttonText.equals("=") && !buttonText.equals("C")) {
                    s1 = t1.getText();
                    s2 = s1 + buttonText;
                    t1.setText(s2);
                } else if (buttonText.equals("C")) {
                    t1.setText("");
                    
                }
		else if(buttonText.equals("=")){
		evaluate();
		}

                break; 
            }
        }
    }
    public void evaluate() {
        String expression = t1.getText();

       
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        
        
        double result = Double.parseDouble(tokens[0]); 

        for (int i = 1; i < tokens.length - 1; i += 2) {
            String operator = tokens[i];
            double nextValue = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+":
                    result += nextValue;
                    break;
                case "-":
                    result -= nextValue;
                    break;
                case "*":
                    result *= nextValue;
                    break;
                case "/":
                    if (nextValue != 0) {
                        result /= nextValue;
                    } else {
                        t1.setText("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    break;
            }
        }

       
        t1.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        MyButton f = new MyButton();
        f.setTitle("Calculator");
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
