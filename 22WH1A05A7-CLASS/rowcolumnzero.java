import java.util.*;
public class RowColumnZeroes{
    static void ChangingtoZero(int[][] m,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==0){
                    for(int k=0;k<r;k++){
                        m[k][j]=-1;
                    }
                    for(int l=0;l<c;l++){
                        m[i][l]=-1;
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==-1){
                    m[i][j]=0;
                }
            }
        }
        System.out.println("new matrix-");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int m[][]=new int[10][10];
        System.out.println("enter no. of rows-");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("enter no. of columns-");
        int c=sc.nextInt();
        System.out.println("enter matrix-");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        ChangingtoZero(m,r,c);
    }
}









