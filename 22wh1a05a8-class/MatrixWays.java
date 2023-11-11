import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int result = countPaths(r, c, array);
        System.out.println(result);
    }
    static int countPaths(int m, int n, int[][] array) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];
    }
}
