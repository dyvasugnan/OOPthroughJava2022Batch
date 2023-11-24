package java22585;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
TextField t1;
Label l1;
TextArea t;
panel p;
	setlayout(new Border layout());
	t=
}
MyButton(){
this.setLayout(null);
l1=new Label("text");

b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b10=new Button("0");
b11=new Button("+");
b12=new Button("-");
b13=new Button("*");
b14=new Button("%");
b15=new Button("clear");
b16=new Button("=");
t1=new TextField(50);

l1.setBounds(100,60,80,30);

t1.setBounds(200,60,80,30);

this.add(l1);
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
this.add(b5);
this.add(b7);
this.add(b8);
this.add(b9);
this.add(b10);
this.add(b11);
this.add(b12);
this.add(b13);
this.add(b14);
this.add(b15);
this.add(b16);
this.add(t1);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
String str;
str=ae.getActionCommand();
int n1=Integer.parseInt(t1.getText());
   int n2=Integer.parseInt(t2.getText());
int result;
if(str.equals("ADD")) {
result=n1+n2;
t3.setText(String.valueOf(result));
}
if(str.equals("SUBTRACT")) {
result=n1-n2;
t3.setText(String.valueOf(result));
}
if(str.equals("MULTIPLY")) {
result=n1*n2;
t3.setText(String.valueOf(result));
}
if(str.equals("DIVISION")) {
result=n1/n2;
t3.setText(String.valueOf(result));
}
if(str.equals("CLEAR")) {
t1.setText("");
t2.setText("");
t3.setText("");
}
}
}
public class calci{
public static void main(String[] args) {
MyButton f= new MyButton();

f.setTitle("Sample Frame");
f.setVisible(true);
f.setSize(400,400);
f.setBackground(Color.white);
f.addWindowListener(new MyClass4());
}
}
class MyClass4 extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}




	}


