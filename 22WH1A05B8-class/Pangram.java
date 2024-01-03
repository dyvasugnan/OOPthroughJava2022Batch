import java.util.Scanner;
import java.util.Arrays;

public class Pangram {
    public static String removeDuplicates(char a[]) {
        int c = 0, i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (j == i) {
                a[c++] = a[i];
            }
        }
        
        return String.valueOf(Arrays.copyOf(a, c));
    }

    public static void main(String[] args) {
        int count = 0, c = 0;
        
        Scanner sc = new Scanner(System.in);
        
        String s = "abcdefghijklmnopqrstuvwxyz";
        
        String inputString = sc.nextLine();
        
        inputString=inputString.toLowerCase();
        
        char tempArray[] = inputString.toCharArray();
        
        Arrays.sort(tempArray);
        
        String str = removeDuplicates(tempArray);
    
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                c++;
            } else {
                break;
            }
        }
        
        str = str.substring(c);
        
        if (str.length() == 26) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==str.charAt(i)) {
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }
}
