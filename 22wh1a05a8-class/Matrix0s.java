package javahvk;
import java.util.*;
public class Matrix0s {
	public static void main(String[] args) {
		int r, c;
        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        r = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            	if(arr[i][j]==0) {
            		for(int k=0;k<r;k++)
            			arr[k][j]=-99;
            		for(int k=0;k<c;k++)
            			arr[i][k]=-99;
            	}
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                if(arr[i][j]==-99)
                	arr[i][j]=0;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
            	System.out.print(arr[i][j]+" ");
            System.out.println();
        }
	}
}
