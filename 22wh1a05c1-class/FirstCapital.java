import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String name");
        String str = br.readLine().trim(); 
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' || i == 0) { 
                if (c == ' ') {
                    i++; 
                }
                char d = str.charAt(i); 
                if (d >= 'a' && d <= 'z') { 
                    d = Character.toUpperCase(d); 
                }
                result += d; 
            } else {
                result += c; 
            }
            if (i == str.length() - 1) { 
                break; 
            }
        }
        
        System.out.println(result);
    }
}

