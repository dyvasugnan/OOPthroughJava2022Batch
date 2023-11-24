package cseb;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java. awt. event. *;

class SetButton extends Frame implements ActionListener{      // Frame should be created within MyButton class, so we write extends
Button b;       // we write "implements ActionListener(it is interface)" for b.addActionListener, ...
TextField t;
SetButton(){                  //Constructor

this.setBackground(Color.PINK);
this.setLayout(null);

b = new Button("SET");  //this is only label of button
t = new TextField(30);

b.setBounds(400, 800, 100, 50);
t.setBounds(200, 100, 500, 50);

this.add(b);            //finally adding button to screen....now it is visible
this.add(t);

b.addActionListener(this);  

}



public void actionPerformed(ActionEvent ae) {

String str = ae.getActionCommand();  //returns label of b1, b2, b3

if(str.equals("SET"))
t.setText("I DID IT !!");
}

}
public class SetText {

public static void main(String[] args) {
// TODO Auto-generated method stub
SetButton s = new SetButton();         //creating object for creating a frame
s.setVisible(true);
s.setSize(900,900);
s.addWindowListener(new Class1());    //to perform any action on the components like close,....
 //in line 57 command is there and in the above line action is performed


}

}

class Class1 extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);               //this is just a command to close the window when we click on close
}
}
