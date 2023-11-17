package Gui2;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame{
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6,t7;
Label l1,l2,l3,l4,l5,l6,l7;
Checkbox c1,c2;
MyButton(){
this.setLayout(null);
l1=new Label("Name");
l2=new Label("Father Name");
l3=new Label("Age");
l4=new Label("Gender");
c1=new Checkbox("Female");
c2=new Checkbox("Male");
l5=new Label("Course");
l6=new Label("Hobbies");
l7=new Label("Address");
b1=new Button("Save");
b2=new Button("Exit");
t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
//t4=new TextField(30);
t5=new TextField(30);
t6=new TextField(30);
t7=new TextField(30);
l1.setBounds(100, 150, 100, 50);
c1.setBounds(200, 300, 10, 20);
c2.setBounds(300, 300, 10, 20);
l2.setBounds(100, 200, 100, 50);
l3.setBounds(100, 250, 100, 50);
l4.setBounds(100, 300, 100, 50);
l5.setBounds(100, 350, 100, 50);
l6.setBounds(100, 400, 100, 50);
l7.setBounds(100, 450, 100, 50);
b1.setBounds(100, 500, 100, 50);
b2.setBounds(250, 500, 100, 50);
t1.setBounds(200, 150, 270, 40);
t2.setBounds(200, 200, 270, 40);
t3.setBounds(200, 250, 270, 40);
//t4.setBounds(200, 300, 270, 40);
t5.setBounds(200, 350, 270, 40);
t6.setBounds(200, 400, 270, 40);
t7.setBounds(200, 450, 270, 40);
this.add(b1);
this.add(b2);
this.add(t1);
this.add(t2);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(l4);
this.add(l5);
this.add(l6);
this.add(l7);
this.add(t3);
//this.add(t4);
this.add(t5);
this.add(t6);
this.add(t7);
this.add(c1);
this.add(c2);
this.setBackground(Color.pink);
}
}
public class StudentForm {

public static void main(String[] args) {
MyButton f=new MyButton();
f.setVisible(true);
f.setSize(600,600);
f.addWindowListener(new MyClass());
}
}
class MyClass extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}
