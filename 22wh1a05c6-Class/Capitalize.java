import java.util.*;
public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                capitalizedSentence.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        System.out.println("Capitalized first letter of Each word in the Sentence: " + capitalizedSentence.toString().trim());
    }
}