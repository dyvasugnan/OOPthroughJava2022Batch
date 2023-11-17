Skip to content
dyvasugnan
/
OOPthroughJava2022Batch

Type / to search

Code
Issues
import java.util.*;
public class ReplacingOnesWithZeros{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows and no. of columns: ");
		int[][] arr=new int[10][10];
		int i,j,m,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(arr[i][j]==0) {
					arr[i][j]=-1;
					int l,k;
					k=j;
					l=i;
					for(int s=0;s<n;s++) {
						arr[i][s]=-1;
					}
					for(int p=0;p<m;p++) {
						arr[p][j]=-1;
					}

				}
			}
		}
		System.out.println("The  resultant array:");
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(arr[i][j]==-1){
				    arr[i][j]=0;
				}
				System.out.print(arr[i][j]+" ");
			}System.out.println("");
		}
	}
}
