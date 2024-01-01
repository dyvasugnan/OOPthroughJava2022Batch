import java.util.Scanner;
import java.lang.Math.*;
public class SpyNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    int num=ch-'0';
		    sum=sum+num;
		    prod=prod*num;
		}
		if(sum==prod){
		    System.out.println("Spy Number");
		}
		else{
		    System.out.println("Not an Spy Number");
		}
	}
}
