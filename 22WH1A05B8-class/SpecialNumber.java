import java.util.Scanner;
public class SpecialNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int sum=0;
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    int f=ch-'0';
		    int fact=1;
		    while(f>1){
		        fact=f*fact;
		        f=f-1;
		    }
		    System.out.println(fact);
		    sum=sum+fact;
		}
		if(sum==n){
		    System.out.println("SpecialNumber");
		}
		else{
		    System.out.println("Not a SpecialNumber");
		}
	}
}
