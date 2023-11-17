package pranavi;
import java.awt.*;
import java.awt.event.*;
class Buttons1 extends Frame implements ActionListener{
	Button b1,b2,b3;
	Buttons1(){
		this.setLayout(null);
	b1 = new Button("Red");
	b2 = new Button("Yellow");
	b3 = new Button("Green");
	b1.setBounds(100, 100, 100, 50);
	b2.setBounds(100, 200, 100, 50);
	b3.setBounds(100, 300, 100, 50);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str;
		str = ae.getActionCommand();
		if(str.equals("Red")){
			this.setBackground(Color.red);
		}
		if(str.equals("Yellow")) {
			this.setBackground(Color.yellow);
		}
		if(str.equals("Green")) {
			this.setBackground(Color.green);
		}
		
}

class TestClass extends WindowAdapter{
	public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}
	}

public class ThirdGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buttons1 f = new Buttons1();
		f.setVisible(true);
		f.setSize(800,800);
		f.addWindowListener(new TestClass());
	}
	}


