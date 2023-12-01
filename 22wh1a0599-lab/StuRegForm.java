package javalabcseb;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
class RegForm extends Frame implements ActionListener {
    Button b1, b2;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    RegForm() {
    	this.setLayout(null);
        b1 = new Button("SAVE");
        b2 = new Button("CLEAR");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        l1 = new Label("NAME");
        l2 = new Label("ROLL NO");
        l3 = new Label ("BRANCH");
        b1.setFont(new Font("Arial", Font.PLAIN, 20));
        b2.setFont(new Font("Arial", Font.PLAIN, 20));
        b1.setBounds(150,400,90,50);
        b2.setBounds(400,400,90,50);
        l1.setBounds(100,100,100,50);
        l2.setBounds(100,200,100,50);
        l3.setBounds(100,300,100,50);
        t1.setBounds(250,100,300,50);
        t2.setBounds(250,200,300,50);
        t3.setBounds(250,300,300,50);
        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(t3);
        add(l1);
        add(l2);
        add(l3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
    	String str = ae.getActionCommand();
    	String s1 = t1.getText();
    	String s2 = t2.getText();
    	String s3 = t3.getText();
    	if (str.equals("SAVE")) {
    		try {
    			FileWriter fw = new FileWriter("Student.txt",true);
    			fw.write(s1 + "\n");
    			fw.write(s2 + "\n");
    			fw.write(s3 + "\n");
    			fw.close();;
    		}
    		catch(Exception ex) {
    			ex.printStackTrace();
    		}
    	}  
    	if (str.equals("CLEAR")) {
    		this.t1.setText("");
    		this.t2.setText("");
    		this.t3.setText("");
    	}
    }
}    
   	public class StuRegForm {
   		public static void main(String[] args) {
   			RegForm s = new RegForm();
   			s.setTitle("STUDENT REGISTRATION FORM");
   			s.setVisible(true);
   			s.setSize(600,500);
   			s.addWindowListener(new MyClass());
   		}
   	}

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
