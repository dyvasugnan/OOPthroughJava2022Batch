import java.util.*;
public class SortZeroesOnesTwos{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in the array : ");
		int n=sc.nextInt();
		int\ arr=new int[n];
		int zeroes=0,ones=0,twos=0;
		System.out.println("Enter the elemements of the array :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0){
				zeroes++;
			}
			else if(arr[i]==1){
				ones++;
			}
			else{
				twos++;
			}
		}
		System.out.println("Original array : ");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<zeroes;i++){
			arr[i]=0;
		}
		for(int i=zeroes;i<(zeroes+ones);i++){
			arr[i]=1;
		}
		for(int i=(zeroes+ones);i<n;i++){
			arr[i]=2;
		}
		System.out.println("Sorted array : ");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}
		