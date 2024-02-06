package JAVA;

import java.util.*;

class Producer extends Thread {
    StringBuffer sb;

    Producer() {
        sb = new StringBuffer();
    }

    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 5; i++) {
                try {
                    sb.append(i).append(" ");
                    Thread.sleep(1000);
                    System.out.println("Value: " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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
                prod_ref.sb.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Consumer: " + prod_ref.sb);
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t2.start();
        t1.start();
    }
}
