//INTERCHANGING ROWS
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter values:");
        int mat[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("After Transposing Elements:\n");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("InterChanging the rows \n");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
               int temp=mat[j][0];
                mat[j][0]=mat[j][2];
                mat[j][2]=temp;
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
//INTERCHANGING COLUMNS
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter values:");
        int mat[][]=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("After Transposing Elements:\n");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("InterChanging the COLUMNS \n");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
               int temp=mat[0][i];
                mat[0][i]=mat[2][i];
                mat[2][i]=temp;
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}

