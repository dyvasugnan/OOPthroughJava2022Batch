import java.util.*;
class Transpose{
   Public static void main(String[] args){
       int i,j,samp;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number of rows:");
       int n=sc.nextInt();
       System.out.println("enter number of columns:");
       int m=sc.nextInt();
       int mat[][]=new int[n][m];
       System.out.println("enter elements:");
       for(i=0;i<n;i++){
          for(j=0;j<m;j++){
             mat[i][j]=sc.nextInt();
          }
       }
       for(i=0;i<n;i++){
          for(j=0;j<m;j++){
             System.out.print(mat[i][j]+" ");
          }
          System.out.println();
       }
       for(i=0;i<n;i++){
          for(j=0;j<m;j++){
             samp=mat[i][j];
             mat[i][j]=mat[j][i];
             mat[j][i]=samp;
          }
       }
       System.out.println("transpose of matrix:");
       for(i=0;i<n;i++){
           for(j=0;j<m;j++){
               System.out.println(mat[i][j]+" ");
           }
       }
}
}
}
