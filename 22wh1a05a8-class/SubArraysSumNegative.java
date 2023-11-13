import java.io.*;
import java.util.*;
public class SubArraysSumNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i] = sc.nextInt();
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += array[i];
                }
                if(sum<0)
                    x++;
            }
        }
        System.out.print(x);
    }
}
