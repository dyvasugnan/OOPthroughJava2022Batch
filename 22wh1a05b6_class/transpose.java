import java.util.*;

class Transpose {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int rows = 3;
        int columns = 3;
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        int temp;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
