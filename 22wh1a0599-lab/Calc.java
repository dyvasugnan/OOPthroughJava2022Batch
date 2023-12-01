import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    MyButton() {
        this.setLayout(null);
        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");
        b5 = new Button("CLEAR");
        l1 = new Label("NUMBER 1");
        l2 = new Label("NUMBER 2");
        l3 = new Label("RESULT");
	t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1.setBounds(90,400,70,50);
        b2.setBounds(240,400,70,50);
        b3.setBounds(390,400,70,50);
        b4.setBounds(540,400,70,50);
        b5.setBounds(320,500,70,50);
        t1.setBounds(400,100,200,50);
        t2.setBounds(400,200,200,50);
        t3.setBounds(400,300,200,50);
        l1.setBounds(100,100,200,50);
        l2.setBounds(100,200,200,50);
        l3.setBounds(100,300,200,50);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
    }
    public int Add(int n1, int n2) {
        return n1 + n2;
    }
    public int Sub(int n1, int n2) {
        return n1 - n2;
    }
    public int Mul(int n1, int n2) {
        return n1 * n2;
    }
    public int Div(int n1, int n2){
	 return n1 / n2;
    }
    public void actionPerformed(ActionEvent ue) {
        String str;
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        str = ue.getActionCommand();
        if (str.equals("ADD")) {
                String num = Integer.toString(Add(n1, n2));
                t3.setText(num);
	}
        if (str.equals("SUB")) {
                String num = Integer.toString(Sub(n1, n2));
                t3.setText(num);
        }
        if (str.equals("MUL")) {
                String num = Integer.toString(Mul(n1, n2));
                t3.setText(num);
	}
        if (str.equals("DIV")) {
                String num = Integer.toString(Div(n1, n2));
                t3.setText(num);
	}
        if (str.equals("CLEAR")) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}

public class Calc{
    public static void main(String[] args) {
        MyButton c = new MyButton();
        c.setTitle("CALCULATOR");
        c.setVisible(true);
        c.setSize(700,600);
        c.setBackground(Color.blue);
        c.addWindowListener(new Demo());
    }
}

class Demo extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}