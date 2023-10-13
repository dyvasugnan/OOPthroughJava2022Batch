package java_third_lab;
import java.util.*;

class BankAcc{
	double bal;
	BankAcc(double b){
		bal=b;
	}
	private class Interest{
		double rate;
		int time;
		Interest(double r,int t){
			rate=r;
			time=t;
		}
		void show() {
			System.out.println((bal*rate*time)/100);
		}
	}
	void contact(double r,int time) {
		System.out.println("Enter the password :");
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		if(p.equals("1234")) {
			Interest in=new Interest(r,time);
			in.show();
		}
		else {
			System.out.println("Wrong Password !");
		}
	}
}
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc bac=new BankAcc(5000.0);
		bac.contact(5.0,8);
		
	}

}
