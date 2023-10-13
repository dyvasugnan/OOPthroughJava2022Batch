#joining first letters of the string
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String name");
        String str = br.readLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' || i == 0) {
                if (c == ' ') {
                    i++;
                }
                char a = str.charAt(i);
                result += a;
            }
        }
        System.out.println(result);
    }
}

