package cseb;
import java.util.*;
class BankAcc{
	double bal;
	BankAcc(double b){
		bal=b;
	}
	void contact(double r) {
		Scanner sc = new Scanner(System.in);
		String pwd;
		System.out.println("enter password");
		pwd = sc.next();
		if(pwd.equals("abc123")) {
			Inter in = new Inter(r);
			in.amount();
		}
		else {
			System.out.println("invalid password");
		}
	}	
		private class Inter{
			double rate;
			Inter(double r){
			rate = r;
			}
			void amount() {
				double amounts=(bal*2*rate)/100;
				System.out.println("amount="+amounts);
			}
			
			
		}
	
}

public class bankdemo {

	public static void main(String[] args) {
		BankAcc b = new BankAcc(1000);
		b.contact(9.6);

	}

}
