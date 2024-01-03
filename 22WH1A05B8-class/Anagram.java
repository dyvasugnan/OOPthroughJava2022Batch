import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char tempArray1[] = s1.toCharArray();
        char tempArray2[] = s2.toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        int count = 0;

        if (tempArray1.length == tempArray2.length) {
            for (int i = 0; i < tempArray1.length; i++) {
                if (tempArray1[i] == tempArray2[i]) {
                    count++;
                }
            }
        }

        if (count == tempArray1.length) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
