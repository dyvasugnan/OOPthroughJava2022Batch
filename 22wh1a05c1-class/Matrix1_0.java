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
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(mat[i][j]==0){
                   mat[i][j]=-1;
                   for(int k=0;k<r;k++){
                      mat[i][k]=-1;
                    }
                   for(int l=0;l<c;l++){
                      mat[l][j]=-1;
                    }       
                }
            }
        
        }
        System.out.println("After Transposing Elements:\n");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                if(mat[i][j]==-1){
                  mat[i][j]=0;
                }
                  System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
