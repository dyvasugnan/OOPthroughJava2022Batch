package learningJava;
import java.util.*;
class PrintingEven extends Thread{
	int num;
	PrintingEven(int i){
		num = i;
	}
	public void run() {
				System.out.println(Thread.currentThread().getName()+ " " +num*num);
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException ie) {
				
				}
	}
	
}
class PrintingOdd extends Thread{
	int num;
	PrintingOdd(int i){
		num = i;
	}
	public void run() {
				System.out.println(Thread.currentThread().getName()+ " " +num*num);
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException ie) {
				
				}
	}
}

public class RandomThread {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the Range:");
		n = sc.nextInt();
		for(int j=0;j<n;j++) {
			int rand = (int)(Math.random()*100);
			System.out.println("MAIN-The number:" + rand);
			try {
				if (rand%2 == 0) {
					System.out.println("Even");
					PrintingEven e=new PrintingEven(rand);
					Thread t=new Thread(e);
					//Thread t = new Thread(new PrintingEven(rand));
					t.setName("THERAD 2-Square:");
					t.start();
				}
				else {
					System.out.println("Odd");
					PrintingOdd o=new PrintingOdd(rand);
					Thread t1=new Thread(o);
					t1.setName("THREAD 3-Cube:");
					t1.start();
				}
				Thread.sleep(100);
			}
			catch(InterruptedException ie) {
			
			}
		}
		sc.close();
	}
}
