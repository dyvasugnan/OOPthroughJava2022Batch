package LearningJava;
public class SpiralOrder {

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int top = 0, i;
        int down = 3;
        int left = 0;
        int right = 3;
        int d = 0;

        while (top <= down && left <= right) {
            if (d == 0) {
                for (i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            } 
            else if (d == 1) {
                for (i = top; i <= down; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            } 
            else if (d == 2) {
                for (i = right; i >= left; i--) {
                    System.out.print(matrix[down][i] + " ");
                }
                down--;
            } 
            else if (d == 3) {
                for (i = down; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
            d = (d + 1) % 4;
        }
    }
}
