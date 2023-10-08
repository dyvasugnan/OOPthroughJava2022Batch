import java.util.*;
public class Laddus{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements : ");
		int n=sc.nextInt();
		int laddus[]=new int[n];
		System.out.println("enter the types of all laddus : ");
		for(int i=0;i<n;i++){
			laddus[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(laddus[i]!=0){
				for(int j=i+1;j<n;j++){
					if(laddus[j]==laddus[i]){
						laddus[j]=0;
					}
				}
			}
		}
		int unique=0;
		for(int i=0;i<n;i++){
			if(laddus[i]!=0){
				unique+=1;
			}
		}
		if(unique<(n/2)){
			System.out.println("Chota Bheem can eat "+unique+" laddus");
		}
		else{
			System.out.println("Chota Bheem can eat "+n/2+" laddus");
		}
	}
}
				