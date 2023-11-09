package LearningJava;
import java.util.Scanner;
class OneD {
	int[] arr1D;
	OneD() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int size = sc.nextInt();
        arr1D = new int[size];
        System.out.println("Enter the elements:");
        for(int i =0 ;i<size;i++) {
        	arr1D[i] = sc.nextInt();
        }
        System.out.println("1D array in Superclass: ");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println();
    }

}

class TwoD extends OneD {
    int[] newData;
    int[][] arr2D;
    TwoD() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter column size:");
		int cols = sc.nextInt();
		newData = new int[cols];
        System.out.println("Enter the elements:");
        for(int i =0 ;i<cols;i++) {
        	newData[i] = sc.nextInt();
        }
        /*int term;
        if(arr1D.length==2)
        	term =0;
        else
        	term = arr1D.length/2;
        int rows = arr1D.length-term; // no.of rows 
        int cols = newColumns.length; // no.of columns */
        int rows = 2;
        //int cols = 3;
        int[][] arr2D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    arr2D[i][j] = arr1D[j];
                } else {
                    arr2D[i][j] = newData[j];
                }
            }
        }
       System.out.println("2D array in Subclass:");
       for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}		


public class SuperArray {
    public static void main(String[] args) {
        TwoD sub = new TwoD();
    }
}

