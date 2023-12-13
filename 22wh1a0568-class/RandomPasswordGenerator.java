package LearningJava;
import java.util.*;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length:");
        int length = scanner.nextInt();

        System.out.println("Choose character types to include:");
        System.out.println("1.Uppercase Letters\n2.Lowercase Letters\n3.Digits\n4.Special Characters");
        System.out.print("Enter choices: ");
        String choices = scanner.next();

        String sequence = generateRandom(length, choices);

        System.out.println("Generated Password:" + sequence);

    }

    private static String generateRandom(int length, String choices) {
        StringBuilder sequence = new StringBuilder();
        String uppercaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowercaseLetters = "qwertyuiopasdfghjklzxcvbnm";
        String digits = "1234567890";
        String specialChar = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

        String selectedChar = "";

        if (choices.contains("1")) {
            selectedChar += uppercaseLetters;
        }
        if (choices.contains("2")) {
            selectedChar += lowercaseLetters;
        }
        if (choices.contains("3")) {
            selectedChar += digits;
        }
        if (choices.contains("4")) {
            selectedChar += specialChar;
        }

        if (selectedChar.isEmpty()) {
            System.out.println("No character type selected. Exiting.");
            System.exit(0);
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(selectedChar.length());
            char randomChar = selectedChar.charAt(randomIndex);
            sequence.append(randomChar);
        }

        return sequence.toString();
    }
}

