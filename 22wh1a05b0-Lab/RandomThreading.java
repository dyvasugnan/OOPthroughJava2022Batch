package CSE22B;

import java.util.Random;
import java.util.Scanner;

class Number extends Thread{
	int num;
	public void run() {
		Random rand = new Random();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Range:");
			int range = scan.nextInt();
			scan.close();
			for(int i = 1 ; i<=range;i++) {
				num = rand.nextInt(100);
				if(i%2==0) {
					Even even = new Even(i);
					Thread t2 = new Thread(even);
					t2.start();
				}else {
					Odd odd = new Odd(i);
					Thread t3 = new Thread(odd);
					t3.start();
				}
				Thread.sleep(1000);
			}
		}catch(Exception e) {}
	}
}

class Even extends Thread{
	int v;
	Even(int k){
		v = k;
	}
		public void run() {
			try {
				System.out.println(v+" is an Even Number thus Result= " +v*v);
			}catch(Exception e){}
	}
}

class Odd extends Thread{
	int v;
	Odd(int k){
		v = k;
	}
		public void run() {
			try {
				System.out.println(v+" is an Odd Number thus Result= " +v*v*v);
			}catch(Exception e){}
	} 
}

public class RandomThreading {
	public static void main(String[] args) throws InterruptedException {
		Number num = new Number();
		Thread t1 = new Thread(num);
		t1.start();
	}
}
