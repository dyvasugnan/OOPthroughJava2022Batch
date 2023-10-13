import java.util.Scanner;
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder new_sentence= new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                new_sentence.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        System.out.println("Required Sentence: " + new_sentence.toString().trim());
    }
}