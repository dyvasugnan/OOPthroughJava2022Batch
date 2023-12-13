package LearningJava;

import java.util.*;


public class ContestAns2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int rows = sc.nextInt();
        int cols = sc.nextInt();
       
        int[][] matrix = new int[rows][cols];
       
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++)
                matrix[j][i] = sc.nextInt();
        }
         
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - 1 - j];
                matrix[i][cols - 1 - j] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
