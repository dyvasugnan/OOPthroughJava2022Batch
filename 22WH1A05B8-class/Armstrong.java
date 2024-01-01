import java.util.Scanner;
import java.lang.Math.*;
public class Armstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		double sum=0;
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    sum=sum+Math.pow((ch-'0'),s.length());
		}
		if(sum==n){
		    System.out.println("Armstrong Number");
		}
		else{
		    System.out.println("Not an Armstrong Number");
		}
	}
}
