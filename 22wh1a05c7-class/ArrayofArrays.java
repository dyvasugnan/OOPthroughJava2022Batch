import java.util.*;
class OneDArray {
   int[] array;
   public OneDArray(int size) {
       array = new int[size];
   }
   public void readArray() {
       Scanner scanner = new Scanner(System.in);
       for (int i = 0; i < array.length; i++) {
           System.out.print("Enter element at index " + i + ": ");
           array[i] = scanner.nextInt();
       }
       scanner.close();
   }
   public void printArray() {
       for (int i = 0; i < array.length; i++) {
           System.out.println("Element at index " + i + ": " + array[i]);
       }
   }
}
class TwoDArray extends OneDArray {
   int[][] array2D;
   public TwoDArray(int rows, int columns) {
       array2D = new int[rows][columns];
   }
   public void read2DArray() {
       Scanner scanner = new Scanner(System.in);
       for (int i = 0; i < array2D.length; i++) {
           for (int j = 0; j < array2D[i].length; j++) {
               System.out.print("Enter element at index [" + i + "][" + j + "]: ");
               array2D[i][j] = scanner.nextInt();
           }
       }
       scanner.close();
   }
   public void printArray() {
       for (int[] row : array2D) {
           for (int element : row) {
               System.out.print(element + " ");
           }
           System.out.println();
       }
   }

public class ArrayofArrays{
   public static void main(String[] args) {
       System.out.println("1D Array:");
       OneDArray oneDArray = new OneDArray(5);
       oneDArray.readArray();
       oneDArray.printArray();
       System.out.println("2D Array:");
       TwoDArray twoDArray = new TwoDArray(4,4);
       twoDArray.readArray();
       twoDArray.printArray();
   }
}
