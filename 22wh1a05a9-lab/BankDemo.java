package CSEB5A9;
import java.util.Scanner;
class BankAcc {
	double balance;
	BankAcc(double b){
		balance=b;
	}
	void contact(double r) {
		Scanner sc=new Scanner(System.in);
		String password;
		System.out.println("enter password");
		password=sc.next();
		if(password.equals("pooj123")) {
			Interest in=new Interest(r);
			in.calculation();
		}
		else {
			System.out.println("invalid password");	
		}
	}
		class Interest{
			double rate;
			Interest(double r) {
				rate=r;
		}
			void calculation() {
			    double interest=((balance*rate)/100);
				System.out.println(interest);
			}
		}
	}
	
public class BankDemo{

	public static void main(String[] args) {
		BankAcc b=new BankAcc(1000);
		b.contact(2.5);
	}

}
