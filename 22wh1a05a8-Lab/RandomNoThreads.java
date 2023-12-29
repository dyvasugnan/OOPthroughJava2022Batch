import java.io.IOException;
class Random extends Thread{
	Random(){
		try {
			for(int i=0;i<10;i++) {
				int n = (int) Math.round(Math.random() * 100);
				if(n%2==0) {
					System.out.println(n);
					Even e = new Even(n);
					Thread t1 = new Thread(e);
					t1.start();
				}
				else {
					System.out.println(n);
					Odd e = new Odd(n);
					Thread t2 = new Thread(e);
					t2.start();
				}
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
	
}
class Even extends Thread{
	int n;
	Even(int x){
		n = x;
	}
	public void run() {
		synchronized(this){
			System.out.println("even:"+n*n);
		}
	}
}
class Odd extends Thread{
	int n;
	Odd(int x){
		n = x;
	}
	public void run() {
		synchronized(this){
			System.out.println("odd:"+n*n*n);
		}
	}
}
public class RandomNoThreads {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
	}
}
