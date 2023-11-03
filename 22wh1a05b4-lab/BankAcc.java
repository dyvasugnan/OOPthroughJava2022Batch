package cseb_5b4;
import java.util.*;
import java.lang.*;
class BankAcc1 {
	double bal;
	Scanner sc=new Scanner(System.in);
	BankAcc1(double b){
		bal=b;
	}
	void contact(double r) {
		String password;
		password=sc.next();
		if(password.equals("abc2468")) {
			 Interest in=new Interest(r);
	         in.CalcInter(r);
	        
;	         
		}
	    else {
	    	System.out.print("wrong password");}
	}
	    class Interest{
		    double rate;
			Interest(double r)
			{
			  rate=r;	
			}
			void CalcInter(double r)
			{
				float t=3.5f;
				double si=(bal*t*r)/100;
				System.out.println("simple interest"+si);
	    
            }
	    }
}
public class BankAcc { 
	public static void main(String[] args) {
		BankAcc1 b=new BankAcc1(1000);
		b.contact(9.6);
		
		// TODO Auto-generated method stub

	}

}
