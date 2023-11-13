import java.util.*;
class Matrix {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int[][] mat = new int[rows][columns];
    int[][] mat2 = new int[rows][columns];
    Matrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat[i][j] = sc.nextInt();
                mat2[i][j] = mat[i][j];
            }
        }
    }
    void change_row_column() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mat2[i][j] == 0) {
                    for (int k = 0; k < columns; k++) {
                        mat2[i][k] = -1;
                    }
                    for (int k = 0; k < rows; k++) {
                        mat2[k][j] = -1;
                    }
                }
            }
        }
    }
    void update() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat[i][j] = mat2[i][j];
            }
        }
    }
    void set_to_zero(){
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }
            }
        }
    }
    void printArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
class Demo {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.change_row_column();
        m.update();
        m.set_to_zero();
        m.printArray();
    }
}
