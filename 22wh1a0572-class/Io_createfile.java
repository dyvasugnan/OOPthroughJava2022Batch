import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Calci {
    public static void main(String[] args) {
        // Specify the path to the file you want to read
        try (DataInputStream dis = new DataInputStream(System.in);
             FileOutputStream fos = new FileOutputStream("ntfile.txt")) {

            char ch;
            while ((ch = (char) dis.read()) != 'n') {
                fos.write(ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
