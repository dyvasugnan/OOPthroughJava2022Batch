import java.util.*;
   class CombineFirstLetters {
    public static void main(String[] args) {
        String input = "akshitha and reethu are good friends";
        String combinedLetters = "";
        String[] words = input.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                combinedLetters += word.charAt(0);
            }
        }

        System.out.println(combinedLetters);
    }
}
