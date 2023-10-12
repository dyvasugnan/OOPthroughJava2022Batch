import java.io.*;

public class WordFirstCap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string[] = new String[10];
        String string_new[] = new String[10];
        System.out.println("Enter any String: ");
        for(int i=0;i<10;i++)
            string[i] = br.readLine();
        for (int i = 0; i < 10; i++) {
                string_new[i] = string[i].substring(0,1).toUpperCase() + string[i].substring(1).toLowerCase();
        }
        System.out.println("New String: ");
        for(int i=0;i<10;i++)
            System.out.print(string_new[i]+" ");
    }
}
