import java.util.*;
import java.io.*;
public class FirstLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        String input = reader.readLine();
        StringBuilder firstLetters = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                firstLetters.append(word.charAt(0));
            }
        }

        System.out.println("First Letters: " + firstLetters.toString());
    }
}

