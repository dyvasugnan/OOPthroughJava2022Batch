
package CSE22B;

import java.util.Scanner;
import java.util.Random;

class EvenNumber extends Thread{
	int x;
	EvenNumber(int x) {
		this.x=x;
	}
	public void run() {
		System.out.println("Number "+x+ " is Even thus Square: " +x*x);
	}
}

class OddNumber extends Thread{
	int x;
	OddNumber(int x) {
		this.x=x;
	}
	public void run() {
		System.out.println("Number "+x+ " is Odd thus Cube: " +x*x*x);
	}
}

class RandomThread extends Thread{
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
				if(num%2==0) {
					EvenNumber even = new EvenNumber(num);
					even.start();
				}else {
					OddNumber odd = new OddNumber(num);
					odd.start();
				}
				Thread.sleep(1000);
			}
		}catch(Exception e) {}
	}
}

public class EvenOddThreading {
	public static void main(String[] args) {
		RandomThread num = new RandomThread();
		num.start();
	}
}
