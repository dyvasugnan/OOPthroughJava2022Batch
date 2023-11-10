import java.util.*;

class OneD {
    int arr_one[];

    void arr_1() {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr_one = new int[size]; 
        for (int i = 0; i < size; i++) { 
            arr_one[i] = sc.nextInt();
        }
        System.out.println("OneD array is: ");
        for (int i = 0; i < size; i++) { 
            System.out.print(arr_one[i] + " "); 
        }
    }
}

class TwoD extends OneD {
    int arr_2[][];

    void arr_2() {
        System.out.println("Enter no of rows");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        System.out.println("Enter no of columns");
        int columns = s.nextInt();
        
        arr_2 = new int[rows][columns]; 
        
        int index = 0; // Initialize index
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < arr_one.length) {
                    arr_2[i][j] = arr_one[index++];
                }
            }
        }
        for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
             System.out.println(
}
}

public class Array{
    public static void main(String[] args) { 
        TwoD t = new TwoD(); 
        t.arr_1();
        t.arr_2();
    }
}