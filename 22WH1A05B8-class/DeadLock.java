class Producer extends Thread {
    StringBuffer sb;

    Producer() {
        sb = new StringBuffer();
    }

    public void run() {
        synchronized (sb) {
            for (int i = 0; i <= 10; i++) {
                try {
                    sb.append(i + " ");
                    Thread.sleep(100);
                    System.out.println("app" + i + "Value");
                    sb.notify();
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
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
                prod_ref.sb.wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println("Consumer " + prod_ref.sb);
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t2.start();
        t1.start();
    }
}
