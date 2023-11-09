import java.lang.*;
import java.util.*;
class Matrix{
    int m,n ;
    Matrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns:");
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Searching the zero element at index");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==0){
                    m=i;
                    n=j;
                    System.out.println("0 is present at index "+m+n);
                    break;
                }
            }
        }
        for(int i=0;i<rows;i++){       //Replacing the respective row by 0
            arr[i][n]=0;
        }
        for(int i=0;i<columns;i++){    //Replacing the respective column by 0
            arr[m][i]=0;
        }
        System.out.println("Display matrix after replacement is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
class ReplaceZero{
    public static void main(String args[]){
        Matrix m=new Matrix();
    }
}
