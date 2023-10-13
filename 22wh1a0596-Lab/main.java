import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		System.out.println("Enter rate of interest:");
		System.out.println("Enter time taken:");
		int P = obj.nextInt();
		int R = obj.nextInt();
		int T = obj.nextInt();
		int interest = (P * R * T)/100;
		System.out.println("Simple Intrest:" + interest);
	}
}