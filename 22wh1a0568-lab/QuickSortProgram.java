package LearningJava;
import java.util.*;

public class QuickSortProgram {
	
	public static int pivot_pos(int a[],int low,int high) {
		int pivot = a[low];
		int i = low+1;
		int j = high;
		while(i<j && i<high && j>low) {
			while(pivot >a[i] && i<high){
				i++;
			}
			while(pivot <a[j] && j>low) {
				j--;
			}
			if(i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		if(i==j && (a[low]<a[j])) {
			return j;
		}
		int temp = a[j];
		a[j] = a[low];
		a[low] = temp;
		return j;
	}
	
	public static void QuickSort(int a[],int low,int high) {
		int j;
		if(low<high) {
			j = pivot_pos(a,low,high);
			QuickSort(a,low,j-1);
			QuickSort(a,j+1,high);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int a[] = new int[n];
		for(int i = 0;i < n;i++) {
			System.out.print("array element "+i+" :");
			a[i] = sc.nextInt();
		}
		QuickSort(a,0,n-1);
		for(int i = 0;i < n;i++) {
			//System.out.println("array element "+i+" :");
			System.out.print(a[i]+",");
		}
		sc.close();
	}
	
}

