import java .io.*;
class Test
{
public static void main(String[] args) throws IOException
{
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
System.out.println("enter age");
String S1=br.readLine();
int age =Integer.parseInt(S1);
System.out.print("enter roll");
String S2=br.readLine();
int rollno=Integer.parseInt(S2);
}
}