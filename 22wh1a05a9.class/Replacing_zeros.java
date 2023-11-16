import java.util.Scanner;
public class MatrixZero {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4x4 matrix (enter 16 integers):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                     matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        setZeros(matrix);
        System.out.println("Matrix with Zeros:");
        printMatrix(matrix);
    }
    private static void setZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
