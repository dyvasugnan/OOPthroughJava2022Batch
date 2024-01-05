//Quick Sort
import java.util.Scanner;
public class Java1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++) 
			a[i] = sc.nextInt();
		quickSort(a,0,n-1);
		for(int i=0;i<n;i++) 
			System.out.println(a[i]);
			
	}
	public static void quickSort(int[] a,int low,int high) {
		if(low<high) {
			int j = pos(a,low,high);
			quickSort(a,low,j);
			quickSort(a,j+1,high);
		}
	}
	public static int pos(int[] a,int low,int high) {
		int p = a[low];
		int i = low;
		int j = high;
		while(i<=j) {
			while(p>a[i]) {
				i++;
			}
			while(p<a[j]) {
				j--;
			}
			if(i<=j) {
				int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
				i++;
				j--;
			}
		}
		return i-1;
	}
}
