package cse225b8;

import java.util.Random;

class even extends Thread{
	int x;
	public even(int x) {
		this.x=x;
	}
	public void run() {
		System.out.println("number "+x+" Square "+x*x);
	}
}
class odd extends Thread{
	int x;
	public odd(int x) {
		this.x=x;
	}
	public void run() {
		System.out.println("number "+x+" cube "+x*x*x);
	}
}
class RandomThread extends Thread{
	int num;
	public void run() {
		Random rand=new Random();
		try {
			for(int i=1;i<=5;i++) {
				num=rand.nextInt(100);
				System.out.println("Main Thread generated number "+num);
				if(num%2==0) {
					Thread t1=new Thread(new even(num));
					t1.start();
				}
				else {
					
						Thread t2=new Thread(new odd(num));
						t2.start();
					
				}
				Thread.sleep(100);
			}
			
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
	}
}
public class EvenOddRandom {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		RandomThread r=new RandomThread();
		r.start();
	}

}
