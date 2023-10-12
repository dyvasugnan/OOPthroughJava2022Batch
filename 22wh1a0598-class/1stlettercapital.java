import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.charAt(0);
            }
        }
        System.out.println("Concatenated first letters: " + result);
    }
}







