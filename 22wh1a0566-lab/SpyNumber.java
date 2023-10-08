import java.util.*;
public class SpyNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		int sum=0,product=0,x;
		for(int i=n;i>0;i/=10){
			x=i%10;
			sum+=x;
			product+=x;
			System.out.println(i);
		}
		if(sum==product){
			System.out.println("It is a spynumber");
		}
		else{
			System.out.println("It is not a spynumber");
		}
	}
}