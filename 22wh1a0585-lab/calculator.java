

  import java.awt.*;
import java.awt.event.*;
class MyButtons1 extends Frame implements ActionListener{
Button b1,b2,b3,b4,b5;
TextField t1,t2,t3;
Label l1,l2,l3;
MyButtons1(){
this.setLayout(null);
l1=new Label("Number1 ");
l2=new Label("Number2 ");
l3=new Label("Result ");
b1=new Button("ADD");
b2=new Button("SUBTRACT");
b3=new Button("MULTIPLY");
b4=new Button("DIVISION");
b5=new Button("CLEAR");
t1=new TextField(15);
t2=new TextField(30);
t3=new TextField(30);
l1.setBounds(100,60,80,30);
l2.setBounds(100,110,80,30);
l3.setBounds(100,160,80,30);
t1.setBounds(200,60,80,30);
t2.setBounds(200,110,80,30);
t3.setBounds(200,160,80,30);
b1.setBounds(30,250,70,30);
b2.setBounds(120,250,70,30);
b3.setBounds(210,250,70,30);
b4.setBounds(300,250,70,30);
b5.setBounds(180,300,70,30);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
this.add(b5);
this.add(t1);
this.add(t2);
this.add(t3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
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
public class Arithmetic {
public static void main(String[] args) {
MyButtons1 f= new MyButtons1();
f.setTitle("Sample Frame");
f.setVisible(true);
f.setSize(400,400);
f.setBackground(Color.white);
f.addWindowListener(new MyClass1());
}
}
class MyClass1 extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}

