import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        int[][] arr = new int[rows][columns];
        
        System.out.println("Enter the elements :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose:");
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < columns; j++) {
              int temp=arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
            }
            
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
        
         
        
    }
}
