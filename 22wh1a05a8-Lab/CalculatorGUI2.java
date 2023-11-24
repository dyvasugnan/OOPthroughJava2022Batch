package cseb225a8;
import java.awt.*;
import java.awt.event.*;
class MyButtonns extends Frame implements ActionListener {
	Button b1, b2, b3, b4, b5, b6;
	TextField t1;
	String operation = "";
	int firstNumber = 0;
	MyButtonns() {
		this.setLayout(null);
		t1 = new TextField(15);
		t1.setBounds(50, 50, 280, 30);
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("*");
		b4 = new Button("/");
		b5 = new Button("=");
		b6 = new Button("C");
		b1.setBounds(50, 100, 60, 30);
		b2.setBounds(120, 100, 60, 30);
		b3.setBounds(190, 100, 60, 30);
		b4.setBounds(260, 100, 60, 30);
		b5.setBounds(50, 150, 270, 30);
		b6.setBounds(50, 200, 270, 30);
		this.add(t1);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
				firstNumber = Integer.parseInt(t1.getText());
				operation = str;
				t1.setText("");
		}
		else if (str.equals("=")) {
				int secondNumber = Integer.parseInt(t1.getText());
				int result = 0;
				switch (operation) {
				case "+":
					result = firstNumber + secondNumber;
					break;
				case "-":
					result = firstNumber - secondNumber;
					break;
				case "*":
					result = firstNumber * secondNumber;
					break;
				case "/":
					if (secondNumber != 0) {
						result = firstNumber / secondNumber;
					}
					else {
						t1.setText("Error: Divide by zero");
					}
					break;
				}
				t1.setText(String.valueOf(result));
		} 
		else if (str.equals("C")) {
			t1.setText("");
			operation = "";
			firstNumber = 0;
		}
	}
}
public class New{
	public static void main(String[] args) {
		MyButtonns f = new MyButtonns();
		f.setTitle("Simple Calculator");
		f.setVisible(true);
		f.setSize(400, 300);
		f.addWindowListener(new MyClass6());
	}
}
class MyClass6 extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
