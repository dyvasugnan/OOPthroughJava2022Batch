import java.util.*;
public class SubArraySum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the no of elements int the array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum;
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			sum=0;
			for(int j=i;j<n;j++){
				sum+=arr[j];
				if(sum>max_sum){
					max_sum=sum;
				}
			}
		}
		System.out.println("Maximum subarray sum : "+max_sum);
	}
}
		
		