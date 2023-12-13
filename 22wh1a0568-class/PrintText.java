package LearningJava;
import java.io.*;

public class PrintText {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("MyFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            System.out.print((char) ch);
        }

        bufferedReader.close();
    }
}
