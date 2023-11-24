package cseb;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class TextButton extends Frame implements ActionListener{

Button b1,b2,b3;

Label l1;

TextField t1;

TextButton(){

this.setLayout(null);


b1=new Button("UP");

b1.setBounds(50,250,90,40);

this.add(b1);

b1.addActionListener(this);



b2=new Button("DOWN");

b2.setBounds(200,250,90,40);

this.add(b2);

b2.addActionListener(this);


b3=new Button("CLEAR");
b3.setBounds(350,250,90,40);

this.add(b3);

b3.addActionListener(this);


l1=new Label();

l1.setText("COUNTER");

l1.setBounds(40, 50, 90, 30);

this.add(l1);







t1=new TextField();

t1.setBounds(180,50,250,30);

this.add(t1);

}




public void actionPerformed(ActionEvent ae) {



// TODO Auto-generated method stub



String str1;



str1=ae.getActionCommand();

        int counter=Integer.parseInt(t1.getText());

if(str1.equals("UP"))
        {
            counter++;

            	t1.setText(String.valueOf(counter));
        }
        if(str1.equals("DOWN"))
        {
            if(counter>0){
            	
                counter--;
                t1.setText(String.valueOf(counter));
            }
            else{
               JOptionPane.showMessageDialog(this,"Enter a Valid Number","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(str1.equals("CLEAR"))
        {
            t1.setText("");
        }


}

}



public class IncDec {
	
public static void main(String[] args) {

// TODO Auto-generated method stub



TextButton f=new TextButton();



f.setTitle("SET");



f.setVisible(true);



f.setSize(500,500);



f.setBackground(Color.pink );



f.addWindowListener(new MyClass());



}


}



class MyClass extends WindowAdapter{


public void windowClosing(WindowEvent we) {

System.exit(0);


}
}


