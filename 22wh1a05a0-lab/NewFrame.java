package cseb;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
public class NewFrame extends JFrame{
    JTextArea ta;
    NewFrame(String fname){
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        ta = new JTextArea(15,20);
        c.add(ta);
        String s = " ";
        String s1 = " ";
        try{
            BufferedReader br =  new BufferedReader(new FileReader(fname));
            while((s = br.readLine())!=null)
                s1 +=s + " ";
            ta.setText(s1);
            br.close();
        }
        catch(Exception e){
        }
    }
}