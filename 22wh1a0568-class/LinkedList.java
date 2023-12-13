package LearningJava;
import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedList {
    public static Node create() {
        Node head = new Node(12);
        Node n = new Node(23);
        head.link = n;
        n.link = null;
        return head;
    }

    public static void insertEnd(Node head) {
    	Scanner sc = new Scanner(System.in);
        Node temp = new Node(0);
        System.out.print("Enter the data to be inserted (at end): ");
        temp.data = sc.nextInt();
        temp.link = null;
        Node ptr = head;
        while (ptr.link != null) {
            ptr = ptr.link;
        }
        ptr.link = temp;
    }

    public static Node insertStart(Node head) {
        Scanner sc = new Scanner(System.in);
        Node temp = new Node(0);
        System.out.print("Enter the data to be inserted (at start): ");
        temp.data = sc.nextInt();
        temp.link = head;
        head = temp;
        return head;
    }

    public static void insertRandom(Node head) {
        Scanner sc = new Scanner(System.in);
        Node temp = new Node(0);
        System.out.print("Enter the data to be inserted (at random): ");
        temp.data = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        temp.link = null;
        Node ptr = head;
        pos--;
        while (pos != 1) {
            ptr = ptr.link;
            pos--;
        }
        temp.link = ptr.link;
        ptr.link = temp;
    }

    public static Node deleteStart(Node head) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from an empty list.");
            return head;
        }
        Node temp = head.link;
        head = null;
        return temp;
    }

    public static void deleteEnd(Node head) {
        Node ptr = head;
        while (ptr.link.link != null) {
            ptr = ptr.link;
        }
        Node temp = ptr.link;
        ptr.link = null;
        temp = null;
    }

    public static void deleteRandom(Node head) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        Node ptr = head;
        pos--;
        while (pos != 1) {
            ptr = ptr.link;
            pos--;
        }
        Node temp = ptr.link;
        ptr.link = temp.link;
        temp = null;
    }

    public static void display(Node head) {
        Node ptr = head;
        System.out.print("List: ");
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.link;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node next = null;
        while (head != null) {
            next = head.link;
            head.link = prev;
            prev = head;
            head = next;
        }
        head = prev;
        return head;
    }

    public static Node deleteList(Node head) {
        Node temp = head;
        while (temp != null) {
            temp = temp.link;
            head = null;
            head = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = create();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of operations: ");
        int no = sc.nextInt();
        System.out.println("1. Insert at start\n2. Insert at end\n3. Insert at random position\n" +
                           "4. Delete at start\n5. Delete at end\n6. Delete at random position\n" +
                           "7. Display\n8. Reverse the list\n9. Delete the list");
        for (int i = 0; i < no; i++) {
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    head = insertStart(head);
                    break;
                case 2:
                    insertEnd(head);
                    break;
                case 3:
                    insertRandom(head);
                    break;
                case 4:
                    head = deleteStart(head);
                    break;
                case 5:
                    deleteEnd(head);
                    break;
                case 6:
                    deleteRandom(head);
                    break;
                case 7:
                    display(head);
                    break;
                case 8:
                    head = reverse(head);
                    System.out.println("Reversed the list,select display to see");
                    break;
                case 9:
                    head = deleteList(head);
                    System.out.println("Delete the list succesfully");
                    break;
            }
        }
    }
}
