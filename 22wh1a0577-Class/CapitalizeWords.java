
import java.util.Scanner;

 class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String capitalizedSentence = capitalizeFirstLetter(sentence);
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
    }

    public static String capitalizeFirstLetter(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstLetter).append(restOfWord).append(" ");
            } else {
                result.append(" ");
            }
        }

        return result.toString().trim(); // Remove extra trailing space
    }
}
