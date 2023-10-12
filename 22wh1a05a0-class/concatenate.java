import java.util.*;
public class Concatenate {
    public static void main(String[] args) {
        String s="welcome to java programming language ";
        String result = concatenate(s);
        System.out.println("Concatenating the first letters in a string : " + result);
    }

    public static String concatenate(String input) {
        String[] words = input.split(" ");
        String result="";

        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.charAt(0);
            }
        }

        return result;
    }
}
