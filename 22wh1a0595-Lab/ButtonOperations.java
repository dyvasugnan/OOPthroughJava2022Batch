package cseb;
import java.awt.*;
import java.awt.event.*;

 

class MyButtons extends Frame implements ActionListener{      // Frame should be created within MyButton class, so we write extends
Button b1, b2, b3;       // we write "implements ActionListener(it is interface)" for b1.addActionListener, ...

MyButtons(){                  //Constructor
this.setBackground(Color.PINK);
this.setLayout(null);

b1 = new Button("Red");  //these r only labels of buttons
b2 = new Button("Green");
b3 = new Button("Blue");

b1.setBounds(400, 800, 100, 50);
b2.setBounds(600, 800, 100, 50);
b3.setBounds(800, 800, 100, 50);

this.add(b1);     //finally adding button to screen....now it is visible
this.add(b2);
this.add(b3);

b1.addActionListener(this);  
b2.addActionListener(this);
b3.addActionListener(this);


}

public void actionPerformed(ActionEvent ae) {

String str = ae.getActionCommand();  //returns label of b1, b2, b3

if(str.equals("Blue"))
this.setBackground(Color.blue);
else if(str.equals("Green"))
this.setBackground(Color.green);
else
this.setBackground(Color.red);



   }
}


public class ButtonOperations {

public static void main(String[] args) {
// TODO Auto-generated method stub

MyButtons f = new MyButtons();   //creating object for creating a frame
f.setVisible(true);
f.setSize(900,900);
f.addWindowListener(new MClass());    //to perform any action on the components like close,....
   
}

}

class MClass extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);               //this will close the window when we click on close
}
}
