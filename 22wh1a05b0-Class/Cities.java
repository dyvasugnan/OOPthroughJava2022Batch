import java.io.*;
import java.util.*;

public class Cities {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cities = new String[10];

        System.out.println("Enter cities (separated by comma): ");
        String input = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        int size = tokenizer.countTokens();
        for (int i = 0; i < size; i++) {
            cities[i] = br.readLine();
        }

        System.out.print("Enter City to Search: ");
        String city = br.readLine();
        int search = -1; 
        for (int i = 0; i < 10; i++) {
            if (cities[i].equals(city)) {
                search = i; 
                break; 
            }
        }
        if (search != -1) {
            System.out.println("City found at index: " + search);
        } else {
            System.out.println("City not found in the list.");
        }
    }
}