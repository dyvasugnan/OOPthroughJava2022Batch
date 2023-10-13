import java.util.*;
class ConcatArrayFirst{
    public static void main(String[] args){
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of the array");
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i=0;i<r;i++){
            for (int j=i+1;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
