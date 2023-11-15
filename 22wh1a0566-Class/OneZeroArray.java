package home;
import java.util.*;

public class Assignment {
	static void printarr(int a[][]) {
		int r=a.length;
		int c=a[0].length;
		for(int m=0;m<r;m++) {
			for(int n=0;n<c;n++) {
				System.out.print(a[m][n]+" ");			
			}
			System.out.println();
		}
	}
	static void modify(int a[][]) {
		int r=a.length;
		int c=a[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==0) {
					for(int k=0;k<c;k++) {
						if(a[i][k]==1) {
							a[i][k]=-1;
						}
					}
					for(int l=0;l<r;l++) {
						if(a[l][j]==1) {
							a[l][j]=-1;
						}
					}
					System.out.println("Changed to :");
					printarr(a);
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==-1) {
					a[i][j]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows in the array :  ");
		int r=sc.nextInt();
		System.out.println("enter the no of rows in the array :  ");
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("enter the elements of the array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();				
			}
		}
		System.out.println("original array :");
		printarr(arr);
		modify(arr);
		System.out.println("Final array :");
		printarr(arr);
	}

}
