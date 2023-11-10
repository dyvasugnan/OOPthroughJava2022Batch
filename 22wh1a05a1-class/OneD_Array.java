import java.util.*;

class OneD_Array {
    int arr1[ ];

    void read_array1(){
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr1 = new int[size]; 
        for (int i = 0 : arr1[i]);
        System.out.println("OneD array is: ",+ arr1[i]);
        
        }
    }
}

class TwoD_Array  extends OneD_Array {
    int arr2[ ] [ ];

    void read_array2() {
        System.out.println("Enter no of rows");
        Scanner sc1 = new Scanner(System.in);
        int rows = sc1.nextInt();
        System.out.println("Enter no of columns");
        int columns = sc1.nextInt();
        
       int [ ] [ ]  arr2 = new int[rows][columns]; // Initialize arr_2
        
      int value = 1;
      for (int i = 0;i < rows; i ++){
      for (int j = 0;j<columns;j++){
      arr2[i ] [j ] = value;
      value ++;
      System.out.println("the two dimensional array is  :", + arr2[i ] [j ]);
                }
            }
        }
    }
}

public class Array{
    public static void main(String[] args) { 
        TwoD_Array  t = new TwoD_Array(); // Use TwoD instead of OneD
        t.read_array1();
        t.read_array2();
    }
}
