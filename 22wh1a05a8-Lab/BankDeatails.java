package cseb225a8;
import java.util.Scanner;
class BankAcc{
	void contact(double b) {
		String pw;
		Scanner sc = new Scanner(System.in);
		pw = sc.next();
		if(pw.equals("1234")){
			class CalcInterest{
				void calc() {
					double ist = ((b*1*4.2)/100);
					System.out.println(ist);
				}
			}
			CalcInterest x = new CalcInterest();
			x.calc();
		}
		else
			System.out.println("invalid password");
	}
}
public class BankDeatails {
	public static void main(String[] args) {
		BankAcc t = new BankAcc();
		t.contact(10000);
	}
}
