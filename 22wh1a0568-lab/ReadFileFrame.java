package cseb;
import javax.swing.*;
import java.awt.*;
import java.io.*;
class ReadFileFrame extends JFrame{
		JTextArea ta;
		ReadFileFrame(String fn){
			Container c = getContentPane();
			setLayout(new FlowLayout());
			ta = new JTextArea(100,100);
			c.add(ta);
			String s =" ";
			String s1 =" ";
			try {
				BufferedReader br = new BufferedReader(new FileReader(fn));
				while((s = br.readLine()) != null)
					s1 += s+" ";
				ta.setText(s1);
				br.close();
			}
			catch(Exception e) { }
		}
}
