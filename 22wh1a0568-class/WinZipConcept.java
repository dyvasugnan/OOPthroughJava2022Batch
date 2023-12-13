package LearningJava;
import java.io.*;
import java.util.zip.*;

public class WinZipConcept {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("sample");
        FileOutputStream fos = new FileOutputStream("destination");
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);
        int ch = fis.read();
        while (ch != -1) {
            dos.write(ch);
        }
        fis.close();
        dos.close();
        System.out.println("File compressed successfully.");
    }
}

