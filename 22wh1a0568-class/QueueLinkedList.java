package LearningJava;
class Node2 {
    int data;
    Node2 link;

    Node2(int data) {
        this.data = data;
        this.link = null;
    }
}

public class QueueLinkedList {
	static Node2 front = null;
	static Node2 rear = null;
	
	public static void enQueue(int x) {
		Node2 newNode  = new Node2(x);
		if(front == null && rear == null) {
			front = rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public static void deQueue() {
		if(rear != null && front != null) {
			Node2 temp = front;
			front = front.link;
			temp.link = null;
		}
	}
	
	public static void display() {
		Node2 temp = front;
		System.out.println("Queue elements are:");
		while(temp != null) {
			System.out.println(" "+temp.data);
			temp = temp.link;
		}
	}
	
	public static void main(String[] args) {
		enQueue(34);
		enQueue(69);
		enQueue(27);
		display();
		System.out.println("After deletion:");
		deQueue();
		display();
	}
}
