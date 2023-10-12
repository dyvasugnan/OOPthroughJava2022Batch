import java.io.*;
class readData{
public static void main(String[ ] args) throws  IOException{
int age;
char gender;
String name;
InputStreamReader is  = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
System.out.println("Enter the age of the person");
String  s  = br.readLine();
int a  = Integer.parseInt(s);
System.out.println("Enter the gender of the person");
char c = (char)  br.read(); 
System.out.println("Enter the name of the person");
String name = br.readLine();
}
}


