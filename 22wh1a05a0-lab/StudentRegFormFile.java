package cseb;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
class GetDetailss extends Frame implements ActionListener{
	Button b1,b2;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	GetDetailss(){
		this.setLayout(null);
		//add(t1, BorderLayout.NORTH);
		b1 = new Button("Save");
		b2 = new Button("Clear");
		t1 = new TextField(40);
		t2 = new TextField(40);
		t3 = new TextField(40);
		l1 = new Label(" Name");
		l2 = new Label(" RollNo ");
		l3 = new Label(" Branch ");
		b1.setBounds(300, 400, 50, 50);
		b2.setBounds(400, 400, 50, 50);
		t1.setBounds(300, 100, 250, 50);
		t2.setBounds(300, 200, 250, 50);
		t3.setBounds(300, 300, 250, 50);
		l1.setBounds(200, 100, 250, 50);
		l2.setBounds(200, 200, 300, 50);
		l3.setBounds(200, 300, 300, 50);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)  {
		String s1 = t1.getText();
		String s2 = t2.getText();
		String s3 = t3.getText();
		if(ae.getSource() == b1) {
			try {
				FileWriter fw = new FileWriter("Student.txt",true);
				fw.write(s1+"\n");
				fw.write(s2+"\n");
				fw.write(s3+"\n");
				fw.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		String str;
		str = ae.getActionCommand();
		if(str.equals("Save")) {
			
		}
		if(str.equals("Clear")){
			System.exit(0);
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
	public class StudentRegFormFile {
		public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			GetDetailss s = new GetDetailss();
			s.setTitle("Student Details");
			s.setVisible(true);
			s.setSize(800,800);
			//s.setBackground(Color.pink);
			s.addWindowListener(new Demo1());	
		}
}
class Demo1 extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
