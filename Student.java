import java.io.*;
class Student {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the age: ");
        String s1 = br.readLine();
        int age = Integer.parseInt(s1);
        System.out.println("The age of the student is :" + age);

        System.out.println("Enter the marks: ");
        String s2 = br.readLine();
        float marks = Float.parseFloat(s2);
        System.out.println("The marks of the student is: " + marks);

        System.out.println("Enter the name: ");
        String name = br.readLine();
        System.out.println("The name of the student is : " + name);


    }
}
