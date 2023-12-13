package LearningJava;
class Node1 {
    int data;
    Node1 link;

    Node1(int data) {
        this.data = data;
        this.link = null;
    }
}

public class StackLinkedList {
    static Node1 top = null;

    public static void push(int data) {
        Node1 newNode = new Node1(data);
        newNode.link = top;
        top = newNode;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        Node1 temp = top;
        int val = temp.data;
        top = top.link;
        temp.link = null;
        return val;
    }

    public static boolean isEmpty() {
        return top == null;
    }

    public static void display() {
        Node1 temp = top;
        System.out.print("Stack elements are:");
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(35);
        push(78);
        push(456);
        push(345);
        display();

        pop();
        System.out.println("After deletion ");
        display();
    }
}
