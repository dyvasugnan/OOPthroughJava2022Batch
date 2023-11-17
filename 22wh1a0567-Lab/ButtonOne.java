package cse22567;
import java.awt.*;
import java.awt.event.*;
class MyButton2 extends Frame implements ActionListener{
Button b1,b2,b3;
MyButton2(){
this.setLayout(null);
        b1=new Button("Red");
        b2=new Button("Green");
        b3=new Button("Cyan");
        b1.setBounds(200,200,50,20);
        b2.setBounds(200,300,50,20);
        b3.setBounds(200,400,50,20);
       
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
String str=ae.getActionCommand();
if(str=="Red"){
this.setBackground(Color.red);
}
if(str=="Green") {
this.setBackground(Color.green);
}
if(str=="Cyan") {
this.setBackground(Color.cyan);
}
}
}
public class ButtonOne {

public static void main(String[] args) {
MyButton2 f=new MyButton2();
f.setVisible(true);
f.setSize(600,600);
f.addWindowListener(new MyClass2());
}
}
class MyClass2 extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}