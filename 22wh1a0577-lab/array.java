import java.util.*;

class Array1D {
    int n;
    int[] arr1;

    public Array1D(){
        System.out.println("enter the size of Array1D:");
        Scanner sc=new Scanner(system.in);
        n = sc.nextInt();
        arr1 = new int[n];
        System.out.println("enter array elements for 1D Array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("1D Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}

class Array2D extends Array1D {
    int m;
    int[][] arr2;

    public Array2D(){
        System.out.println("enter the size of columns for 2D Array:");
        Scanner sc=new Scanner(system.in);
        m = sc.nextInt();
        arr2 = new int[n][m];
        System.out.println("enter elements for 2D Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Array3D extends Array2D {
    int p;
    int[][][] arr3;

    public Array3D(){
        System.out.println("enter size of 3rd dimension elements:");
        Scanner sc=new Scanner(system.in);
        d = sc.nextInt();
        arr3 = new int[n][m][d];
        System.out.println("Enter elements of 3D Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < d; k++) {
                    arr3[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("3D Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < d; k++) {
                    System.out.print(arr3[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array3D a3 = new Array3D();
        int[][][] arr3 = a3.arr3;
    }
}
