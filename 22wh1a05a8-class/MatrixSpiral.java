import java.util.*;
import java.io.*;
class MatrixSpiral{
    public static void main(String[] args) throws IOException {
        int r, c;
        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        r = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        int left = 0;
        int top = 0;
        int down = r;
        int right = c;
        System.out.println("Enter the array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        }
        while (left < right && top < down) {
            if (d == 0) {
                for (int i = left; i < right; i++)
                    System.out.print(arr[top][i] + " ");
                top++;
            }
            if (d == 1) {
                for (int i = top; i < down; i++)
                    System.out.print(arr[i][right - 1] + " ");
                right--;
            }
            if (d == 2) {
                for (int i = right - 1; i >= left; i--)
                    System.out.print(arr[down - 1][i] + " ");
                down--;
            }
            if (d == 3) {
                for (int i = down - 1; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
            d = (d + 1) % 4;
        }
    }
}
