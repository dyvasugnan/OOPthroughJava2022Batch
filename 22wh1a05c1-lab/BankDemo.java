package cseb;

import java.util.Scanner;

class BankAcc{
	double bal;
	BankAcc(double b)
	{
		bal=b;
	}
	void contact(double r) {
		Scanner sc = new Scanner(System.in);
		String pwd;
		System.out.println("Enter Password:");
		pwd=sc.next();
		if(pwd.equals("abc123"))
		{
			Interest in=new Interest(r);
			in.CalcInter();
		}
		else
		{
			System.out.println("not");
		}
	}
		class Interest{
			double rate;
			Interest(double r)
			{
				rate=r;
			}
	    	 void CalcInter() 
	    	 {
	    		Scanner sc = new Scanner(System.in);
	    		int t;
	    		System.out.println("Enter time");
	    		t=sc.nextInt();
	    		double SI=(bal*t*rate)/100;
	    		System.out.println("Simple Interest"+SI);
	    	 }
	        	
	    	   
	    	  
	      
		
	}
}
public class BankDemo {
   public static void main(String[] args) {
		BankAcc b=new BankAcc(1000);
		b.contact(9.0);
	}

}
