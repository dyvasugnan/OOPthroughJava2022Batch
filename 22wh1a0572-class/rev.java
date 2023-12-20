import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calci {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string:");
        String str = br.readLine();

        StringBuffer s = new StringBuffer(str);
        System.out.println("Reversed string: " + s.reverse());
    }
}
