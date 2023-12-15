package cse2218;
import java.io.*;
class MyThread extends Thread{
	String str;
	MyThread(String S){
		str=S;
	}
	public void run() {
		for(int i=1;i<=20;i++) {
			if(str.equals("Even Number") && i%2==0) {
				System.out.println(str+i);
			}
			else if(str.equals("Odd Number") && i%2!=0){
				System.out.println(str+i);
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
		
	}
}

public class Const {

	public static void main(String[] args)throws IOException {
		MyThread obj1=new MyThread("Even Number");
		MyThread obj2=new MyThread("Odd Number");
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
