package LearningJava;
class OneD {
	int[] arr1D;
	OneD() {
        arr1D = new int[] {1, 2, 3}; 
        System.out.println("1D array in Superclass: ");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
        System.out.println();
    }

}

class TwoD extends OneD {
    int[] newColumns;
    int[][] arr2D;
    TwoD() {
        newColumns = new int[] {4, 5, 6};
        int term;
        /*if(arr1D.length==2)
        	term =0;
        else
        	term = arr1D.length/2;
        int rows = arr1D.length-term; // no.of rows 
        int cols = newColumns.length; // no.of columns */
	int rows =2;
	int cols = 3;
        int[][] arr2D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    arr2D[i][j] = arr1D[j];
                } else {
                    arr2D[i][j] = newColumns[j];
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
