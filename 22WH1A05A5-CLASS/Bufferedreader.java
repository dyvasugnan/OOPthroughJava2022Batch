//reading various data types in java using buffered reader
import java.io.*;
class Bufferedreader{
public static void main(String[] args) throws Exception{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("enter age:");
int age = Integer.parseInt(br.readLine());
System.out.print("enter gender:");
char gender = br.readLine().charAt(0);
System.out.print("enter height:");
float height = Float.parseFloat(br.readLine());
System.out.print("AGE IS:"+age+'\n');
System.out.print("GENDER IS:"+gender+'\n');
System.out.print("HEIGHT IS:"+height+'\n');
}
}

