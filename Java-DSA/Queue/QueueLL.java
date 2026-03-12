package Queue;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {

    Node front, rear;

    void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {

        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return value;
    }

    int peek() {

        if (front == null) {
            System.out.println("Queue Empty");
            return -1;
        }

        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    void display() {

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class QueueLL {

    public static void main(String[] args) {

        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Front element: " + q.peek());
    }
}