package cseb;
import java.util.*;
class even extends Thread{
	int x;
	public even(int x) {
		this.x=x;
		
	}
	public void run() {
		System.out.println("number"+x+"square"+x*x);
	}
}
class odd extends Thread{
	int x;
	public odd(int x) {
		this.x=x;
		
	}
	public void run() {
		System.out.println("number"+x+"cube"+x*x*x);
	}
}
class RandomThread extends Thread{
	int num;
	public void run() {
		Random r = new Random();
		try {
			for(int i=1;i<=5;i++) {
				num=r.nextInt(100);
				System.out.println("main thread generated no."+num);
				if(num%2==0) {
					Thread t1 = new Thread(new even(num));
					t1.start();
					
				}
				else {
					Thread t2 = new Thread(new odd(num));
					t2.start();
				}
				Thread.sleep(100);
			}	
		}
		catch(InterruptedException ie) {	
		}
	}
}
public class threads2 {
	public static void main(String [] args) {
		RandomThread rd=new RandomThread ();
		rd.start();
	}

}