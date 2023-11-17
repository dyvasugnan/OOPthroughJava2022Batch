
import java.io.IOException;
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) throws IOException {
        String[] arr = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s1 = sc.nextLine();

        arr = s1.split("\\s+");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}