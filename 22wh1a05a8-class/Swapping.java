package javahvk;
import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        int[] result = swap(n1, n2);
        n1 = result[0];
        n2 = result[1];
        System.out.println("After swapping: n1 = " + n1 + ", n2 = " + n2);
    }
    public static int[] swap(int a, int b) {
        return new int[]{b, a};
    }
}
