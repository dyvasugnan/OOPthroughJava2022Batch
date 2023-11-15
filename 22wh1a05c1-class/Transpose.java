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
        System.out.println("Before Transposing Elements:\n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transposing Elements:\n");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
       
    }
}

