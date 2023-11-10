import java.util.*;
class BankAcc{
	double balance;
	BankAcc(double b){
		balance = b;
	}
	
	void contact(double r) {
		Scanner sc = new Scanner(System.in);
		String password;
		System.out.println("Enter Your Password to login: ");
		password = sc.next();
		if (password.equals("Bank.Ac")) {
			Interest i = new Interest();
			i.calcInt(r,2);
		}
		else {
			System.out.println("You've entered the wrong password. ");
		}
	}
		
		class Interest {
			double rate;
			void calcInt(double r ,int time) {
				rate = r;
				double SI = (balance*r*time)/100;
				System.out.println("The Simple Interest: "+SI);
			}
		}	
}
public class BankDemo {
	public static void main(String[] args) {
		BankAcc b = new BankAcc(1000);
		b.contact(2.0);
	}
}
