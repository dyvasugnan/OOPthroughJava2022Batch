import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter values of rows and columns");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            int rsum=0;
            int csum=0;
            for(int j=0;j<c;j++){
                rsum=rsum+arr[i][j];
                csum=csum+arr[j][i];
            }
           System.out.println("Row: "+(i+1)+"Rowsum: "+rsum);
           System.out.print("Column: "+(i+1)+"Columnsum: "+csum);
         
        }
        
    }
}