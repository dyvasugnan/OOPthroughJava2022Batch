import java.util.Scanner;

class D1 {
    int[] get1DArray(int size) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for 1D array:");
        for (int i = 0; i < size; i++) 
            array[i] = scan.nextInt();
        return array;
    }
}

class D2 extends D1 {
    int[][] get2DArray(int rows, int cols) {
        int[][] array2D = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
            array2D[i] = get1DArray(cols);
        return array2D;
    }
}

class D3 extends D2 {
    int[][][] get3DArray(int depth, int rows, int cols) {
        int[][][] array3D = new int[depth][rows][cols];
        for (int i = 0; i < depth; i++) 
            array3D[i] = get2DArray(rows, cols);
        return array3D;
    }
}

public class Array_3D {
    public static void main(String[] args) {
        D3 matrix = new D3();
        
        int depth = 3;
        int rows = 3;   
        int cols = 3;   
        
        int[][][] threeDArray = matrix.get3DArray(depth, rows, cols);

        System.out.println("Matrix with 3 rows, 3 columns, 3 depth:\n");
        
        System.out.println("3D Array:\n");
        for (int i = 0; i < depth; i++) {
            System.out.println("Depth " + i + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) 
                    System.out.print(threeDArray[i][j][k] + " ");
                System.out.println();
            }
        }
    }
}
