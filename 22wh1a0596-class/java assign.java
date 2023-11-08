import java.io.*;
import java.util.*;

abstract class OneD {
    int m;
    int[] arr;

    OneD() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the 1D array: ");
        this.m = Integer.parseInt(br.readLine());
        this.arr = new int[m];
        System.out.println("Enter the elements for the 1D array: ");
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    abstract void printArray();
}

class TwoD extends OneD {
    int n;
    int[][] twoD;

    TwoD() throws IOException {
        super();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows for the 2D array: ");
        this.n = Integer.parseInt(br.readLine());
        twoD = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                twoD[i][j] = arr[i];
            }
        }
    }

    void printArray() {
        System.out.print("OneD array elements: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    void print2DArray() {
        System.out.println("TwoD array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class ThreeD extends TwoD {
    int z;
    int[][][] threeD;

    ThreeD() throws IOException {
        super();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows for the 3D array: ");
        this.n = Integer.parseInt(br.readLine());
        threeD = new int[m][n][z];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0;k < z;k++){
                threeD[i][j][k] = twoD[i][j];
            }
        }
    }
    }
    void print3DArray() {
        System.out.println("ThreeD array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0; k < z; k++){ 
                System.out.print(three[i][j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
}   
class Demo {
    public static void main(String[] args) throws IOException {
        ThreeD[] array = new ThreeD[1];
        for (int i = 0; i < 1; i++) {
            array[i] = new ThreeD();
        }
        for (int i = 0; i < 1; i++) {
            array[i].printArray();
            array[i].print2DArray();
            array[i].print3DArray();
        }
    }
}
