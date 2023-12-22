import java.util.Arrays;
import java.util.Scanner;

public class transportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight[] = new int[100000];
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter the maximum limit:");
        int target = sc.nextInt();
        System.out.println("Enter the weights:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        int k = 0;
        int count = 0;
        int arr[] = new int[100000];
        Arrays.sort(weight, 0, n);
        for (int i = 0; i < n; i++) {
            if (weight[i] != 0) {
                arr[k] = weight[i];
                k++;
            }
        }
        int l = 0;
        int r = k - 1;
        while (l <= r) {
            if (arr[l] + arr[r] <= target) {
                count++;
                l++;
            }
            r--;
        }
        System.out.println("The minimum no. of vehicles required for transportation:" + count);
    }
}
