package Manvi;
import java.util.*;
public class Subraction {

    public static void main(String[] args) {
        int n;
        int d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be divided: ");
        n = sc.nextInt();

        System.out.println("Enter the number to be divided by: ");
        d = sc.nextInt();

        int result = divide(n, d);
        System.out.println("Result: " + result);
    }

    public static int divide(int n, int d) {
        int ans = n;
        int count = 0;

        if ((n < 0 && d > 0) || (n > 0 && d < 0)) {
            n = Math.abs(n);
            d = Math.abs(d);
            while (ans >= d) {
                ans -= d;
                count++;
            }
        }
        if((n < 0 && d < 0)) {
        	n = Math.abs(n);
        	d = Math.abs(n);
        while (ans >= d) {
            ans -= d;
            count++;
        }
        }
        else {
        	  while (ans >= d) {
                  ans -= d;
                  count++;
        }
        }

        if ((n * d) < 0) {
            return -count;
        } else {
            return count;
        }
    }
}
