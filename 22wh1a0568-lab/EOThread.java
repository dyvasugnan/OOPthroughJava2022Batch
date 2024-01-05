package learningJava;
import java.io.*;
class PrintNumbers extends Thread{
	static int count = 1;
	int rem;
	static Object lock = new Object();
	PrintNumbers(int r){
		rem = r;
	}
	void print() {
		System.out.println(Thread.currentThread().getName()+ " " + count++);
	}
	public void run() {
		for(int i = 1;i<=10;i++) {
			synchronized(lock) {
				while(count%2 != 0)
					try {
						lock.wait();
					}
				catch(InterruptedException ie) {
					
				}
				print();
				notifyAll();
			}
		}
	}
}
public class EOThread {
	public static void main(String[] args){
		PrintNumbers even = new PrintNumbers(0);
		PrintNumbers odd = new PrintNumbers(1);
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);
		t1.start();
		t2.start();
	}
}