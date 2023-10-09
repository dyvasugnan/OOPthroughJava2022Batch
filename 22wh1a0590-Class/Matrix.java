import java.util.*;
public class Matrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows and columns in the matrix:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements of the matrix : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("original matrix : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]);
			}System.out.println();
		}
		for(int i=0;i<r;i++){
			for(int j=i+1;j<c;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println("Matrix after transpose : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}

