import java.io.*;
class Data{
    public static void main(String[]arg)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter age of a person");
        String s1 = br.readLine();
        int age = Integer.parseInt(s1);
        System.out.println("marks:");
        String s2 = br.readLine();
        double marks  = Double.parseDouble(s2);
        System.out.println("Name:");
        String name = br.readLine();
        System.out.println("Gender:");
        char c = br.readLine().charAt(0);




    }
}
