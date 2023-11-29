package package2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Serialize implements Serializable {
    public String name;
    public String city;
    public int age;
    public Date joining;
    public static void main(String[] args) throws IOException {
        Serialize h = new Serialize();
        h.name = "Manvitha";
        h.city = "Delhi";
        h.age = 18;
        h.joining = new Date();
        
            FileOutputStream fos = new FileOutputStream("Manvi.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            fos.close();
            System.out.println("Serializable data is saved");

    }
}

