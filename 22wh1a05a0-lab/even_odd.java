package cseb;
import java.io.*;
class MyThread extends Thread{
	static int count =1;
	int rem;
	static Object lock = new Object();
	MyThread(int r){
		rem=r;
	}
	void print() {
		System.out.println(Thread.currentThread().getName()+count++);
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			synchronized(lock) {
			while(count%2!=rem) {
				try {
				lock.wait();
				}
				catch(InterruptedException ie) {
				}
			}
			print();
			lock.notifyAll();
		}
	}
}
}
public class even_odd {
	public static void main(String[] args) {
		MyThread even = new MyThread(0);
		MyThread odd = new MyThread(1);
		Thread t1= new Thread(even,"even Thread");
		Thread t2= new Thread(odd,"odd thread");
		t2.start();
		t1.start();
	}
}