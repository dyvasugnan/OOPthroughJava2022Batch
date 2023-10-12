import java.util.*;
class CapitalizeWords {
    public static void main(String[] args) {
        String input = "she is a good girl";
        String result = "";
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            if (!result.isEmpty()) {
                result += " ";
            }
            result += word;
        }

        System.out.println(result);
    }
}
