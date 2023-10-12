import java.util.*;
public class Capitalized_firstletter {
    public static void main(String[] args) {
        String s = "welcome to java programming language";
        String result = capitalize(s);

        System.out.println("capatalized string = " + result);
    }

    public static String capitalized_firstletter(String input) {
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                result +=Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ";
            }
        }

       return result;
    }
}
