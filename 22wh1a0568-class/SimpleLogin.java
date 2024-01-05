package LearningJava2;
import java.awt.*;
import java.awt.event.*;

class Simple extends Frame implements ActionListener{
	Label name,pwd,nul;
	Button sub;
	TextField n,p;
	TextArea prints;
	Simple(){
		this.setBackground(Color.CYAN);
		name = new Label("Name:",Label.LEFT);
		pwd = new Label("Password:",Label.LEFT);
		nul = new Label("");
		n = new TextField(32);
		p = new TextField(10);
		p.setEchoChar('*');
		prints = new TextArea(50,50);
		//prints = new TextField();
		sub = new Button("Submit");
		name.setBounds(50, 50, 70, 20);
        pwd.setBounds(50, 100, 70, 20);
        nul.setBounds(50, 110, 5, 5);
        n.setBounds(150, 50, 150, 20);
        p.setBounds(150, 100, 150, 20);
        prints.setBounds(110, 210, 100, 50);
        sub.setBounds(130, 130, 70, 20);
        this.add(n);
        this.add(p);
        this.add(prints);
        this.add(sub);
        this.add(name);this.add(pwd);this.add(nul);
        sub.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
	    String str1 = ae.getActionCommand();
	    if ("Submit".equals(str1)) { 
	        prints.setText(n.getText() + "\n" + p.getText());
	    }
	}

}

public class SimpleLogin {

	public static void main(String[] args) {
		Simple s = new Simple();
		s.setSize(350, 350);
        s.setVisible(true);
        s.addWindowListener(new Myclass1());
    }
}

class Myclass1 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
