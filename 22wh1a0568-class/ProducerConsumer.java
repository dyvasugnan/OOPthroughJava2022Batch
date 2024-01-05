package LearningJava2;

class Producer extends Thread{
	StringBuffer sb;
	Producer(){
		sb = new StringBuffer();
	}
	public void run(){
		synchronized(sb){
			for(int i = 1;i<=10;i++){
				try {
					sb.append(i+" ");
					Thread.sleep(100);
					System.out.println("append "+i+" Value");
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
			sb.notify();
		}
	}
}
class Consumer extends Thread {
    Producer prod_ref;
    Consumer(Producer p) {
        prod_ref = p;
    }
    public void run() {
        synchronized (prod_ref.sb) {
            try {
                while (prod_ref.sb.length() == 0) {
                    prod_ref.sb.wait();
                }
            } 
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Consumer " + prod_ref.sb);
        }
    }
}
public class ProducerConsumer {
	public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        producer.start();
        consumer.start();
    }

}
