import java.io.IOException;

class Multithread extends Thread{
	Multithread(){
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
		catch(Exception e){
			System.out.println(e);
		}
	}
	
}
class Even extends Thread{
	int n;
	Even(int x){
		n = x;
	}
	public void run() {
			System.out.println(n+" is even:"+n*n);	
	}
}
class Odd extends Thread{
	int n;
	Odd(int x){
		n = x;
	}
	public void run() {
			System.out.println(n+" is odd:"+n*n*n);
	}
}
public class Calci {
	public static void main(String[] args) throws IOException {
		Multithread obj = new Multithread();
	}
}
