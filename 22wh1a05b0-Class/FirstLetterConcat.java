import java.io.*;

class FirstLetterConcat{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string[] = new String[10];
        String capitals = "";
        System.out.println("Enter the String:");
        for (int i = 0; i < 10; i++) 
            string[i] = br.readLine();

        for (int i = 0; i < 10; i++) 
            string[i] = br.readLine();
        for (int i = 0; i < 10; i++) {
                char firstLetter = string[i].charAt(0);
                capitals += firstLetter;
        }
        System.out.println(capitals);
    }
}