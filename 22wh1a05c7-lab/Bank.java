package akshitha5c7;
import java.util.*;
class BankAcc {
    double bal;
    BankAcc(double b){
    	bal= b;
    }
    void contact(double r,double t) {
    	Scanner sc=new Scanner(System.in);
    	String pwd;
    	System.out.println("Enter Pwd");
    	pwd=sc.next();
    	if(pwd.equals("abc123")) {
    		Interest in=new Interest(r,t);
    		in.calcInter();
    	}
    	else {
    		System.out.println("Not");
    	}
    }//end of contact method
    	class Interest{
    		double rate;
    		Interest(double r,double t){
    			rate=r;   			
    		}
    	    void calcInter() {
    	      double interest=(bal*rate*2)/100;
    	      System.out.println("Interest"+interest);
    	    }
    	}
    }
public class BankDemo{
	
	public static void main(String[] args) {
		BankAcc b=new BankAcc(1000);
		b.contact(9,6);
		
	}
}

	

