import java.io.*;
class Bufferedreader{
public static void main(String[] args) throws Exception{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("enter age:");
int age = Integer.parseInt(br.readLine());
System.out.print("enter weight:");
char gender = br.readLine().charAt(0);
System.out.print("enter height:");
float height = Float.parseFloat(br.readLine());
System.out.print("Age IS:"+age+'\n');
System.out.print("Weight IS:"+gender+'\n');
System.out.print("HeightT IS:"+height+'\n');
          }
}
