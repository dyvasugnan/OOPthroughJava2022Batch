package varsha22591;

import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

class PrintNumbers extends Thread{

	static int count;

	int rem;

	static Object lock=new Object();

	PrintNumbers(float r){

		rem=(int)r;

	}

	PrintNumbers(Random rand){

		count=rand.nextInt(10);

	}

	

	void print() {

		//System.out.println(Thread.currentThread().getName()+" "+count);

		

		if(Thread.currentThread().getName()=="odd:") {

			System.out.println(Thread.currentThread().getName()+" "+count);

			count=count*count*count;

			System.out.println("cube "+count);

		}

		else if(Thread.currentThread().getName()=="even:") {

			System.out.println(Thread.currentThread().getName()+" "+count);

			count=count*count;

			System.out.println("Square "+count);

		

		}

		

	}

	public void run() {

			synchronized(lock){

				while(count%2!=rem) {

					try {

						lock.wait();

						

					}

					catch(InterruptedException ie) {

						System.out.println(ie);

					}

					

				}

				

				lock.notify();

			}

		

		print();

	}

	

	

	

}



public class MultiThreading  {



	public static void main(String[] args) {

		PrintNumbers even=new PrintNumbers(0);

		PrintNumbers odd=new PrintNumbers(1);

		Random rand=new Random();

		PrintNumbers random=new PrintNumbers(rand);

		

		Thread t1=new Thread(even,"even:");

		Thread t2=new Thread(odd,"odd:");

		Thread t3=new Thread(random,"random");

		t3.start();

		t1.start();

		t2.start();

		

	}


}