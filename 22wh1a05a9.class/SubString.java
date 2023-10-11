import java.util.Scanner;
class SubString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String sentence=sc.nextLine();
       String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1);
            String restOfWord = words[i].substring(1);
            words[i] = firstLetter;
        }
        String capitalizedSentence = String.join("", words);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
}

