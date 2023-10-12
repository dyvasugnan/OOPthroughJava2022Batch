import java.util.Scanner;

public class Transpose {
    public static void main (String[] args){
        int array_[][] = new int[3][3];
        int cols,rows;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of Columns:");
        cols = scan.nextInt();
        System.out.print("Enter number of Rows:");
        rows = scan.nextInt();

        System.out.println("Enter Matrix Elements Rowwise:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array_[i][j] = scan.nextInt();
            }
        }
        System.out.println("Entered Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(" ");
                System.out.print(array_[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                int temp=0;
                temp = array_[i][j];
                array_[i][j]=array_[j][i];
                array_[j][i]=temp;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(" ");
                System.out.print(array_[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();   
    }
}
