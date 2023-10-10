\\printing multiplication table by taking input from user using buffer reader
import java.io.*;
class Multiplication{
public static void main(String[] args)throws Exception{
int i;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("enter number");
String s1 = br.readLine();
int num = Integer.parseInt(s1);
for(i=0;i<10;i++)
{
System.out.print(num + "x" + (i+1) + "="+ (num*(i+1))+'\n');
}
}
}
