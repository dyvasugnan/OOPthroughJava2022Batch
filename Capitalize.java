import java.util.Scanner;
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                capitalizedSentence.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        System.out.println("Capitalized Sentence: " + capitalizedSentence.toString().trim());
    }
}
