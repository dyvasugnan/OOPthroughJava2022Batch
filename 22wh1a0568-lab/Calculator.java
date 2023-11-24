package cseb;

import java.awt.*;
import java.awt.event.*;

class MyButtons extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6 ,n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
    TextArea t1;
    Label l1;
    String currentOperation,expression;
    Panel p;
    MyButtons() {
        this.setLayout(new BorderLayout());
        p = new Panel(new GridLayout(4,4));
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("AC");
        b6 = new Button("=");
        n0 = new Button("0");
        n1 = new Button("1");
        n2 = new Button("2");
        n3 = new Button("3");
        n4 = new Button("4");
        n5 = new Button("5");
        n6 = new Button("6");
        n7 = new Button("7");
        n8 = new Button("8");
        n9 = new Button("9");
        this.add(p);
        p.add(n0);p.add(n1);p.add(n2);p.add(n3);p.add(n4);
        p.add(n5);p.add(n6);p.add(n7);p.add(n8);p.add(n9);
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
        p.add(b6);

        t1 = new TextArea(5,10);
        this.add(t1,BorderLayout.NORTH);
        
        n0.addActionListener(this);n4.addActionListener(this);n5.addActionListener(this);
        n1.addActionListener(this);n2.addActionListener(this);n3.addActionListener(this);
        n6.addActionListener(this);n7.addActionListener(this);n8.addActionListener(this);
        n9.addActionListener(this);
        b1.addActionListener(this);b2.addActionListener(this);
        b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);


        this.setBackground(Color.cyan);
    }

    public void actionPerformed(ActionEvent ae) {
        String str1 = ae.getActionCommand();
        if (str1.equals("AC")) {
            this.t1.setText("");
            expression = ""; 
        } 
        else if (str1.equals("=")) {
            if (currentOperation != null) {
                double result = this.performOperation();
                this.t1.setText(String.valueOf(result));      
                }
        } 
        else if(str1.equals("+")||str1.equals("-")||str1.equals("*")||str1.equals("/")) {
        	currentOperation = str1;
        	expression = this.t1.getText();
        	this.t1.setText(expression+currentOperation);
        }
        else {
        	expression = this.t1.getText();
        	for(int i=0;i<10;i++) {
        		if(str1.equals(String.valueOf(i))){
        			this.t1.setText(expression+String.valueOf(i));
        			break;
        		}
        	}
        }
    }

    public double performOperation() {
    	expression = this.t1.getText();
    	String[] parts = expression.split("[-+*/]");
        double n1 = Double.parseDouble(parts[0]);
        double n2 = Double.parseDouble(parts[1]);
        double result;
        if(expression.contains("+")) {
        	result = n1 + n2;
        }
        else if(expression.contains("-")) {
        	result = n1 - n2;
        }
        else if(expression.contains("*")) {
        	result = n1 * n2;
        }
        else{
        	try {
        		result = n1 / n2;
        	}
        	catch(ArithmeticException e) {
        		e.printStackTrace();
        	}
        	finally {
        		result = n1/n2;
        	}
        }
		return result;
    }
}

public class Calculator {
    public static void main(String[] args) {
        MyButtons f = new MyButtons();
        f.setVisible(true);
        f.setSize(400, 400);
        f.addWindowListener(new MyClass5());
    }
}

class MyClass5 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
