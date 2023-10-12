import java.util.*;
import java.io.*;
public class FirstLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        String sentence = br.readLine();
        StringBuilder firstLetters = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                firstLetters.append(word.charAt(0));
            }
        }
        System.out.println("First Letters: " + firstLetters.toString());
    }
}