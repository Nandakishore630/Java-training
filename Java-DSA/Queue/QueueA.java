package Queue;
class QueueArray {

    int arr[];
    int front;
    int rear;
    int capacity;

    QueueArray(int size) {
        capacity = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Check if queue is full
    boolean isFull() {
        return rear == capacity - 1;
    }

    // Enqueue operation
    void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        arr[++rear] = data;
        System.out.println(data + " inserted into queue");
    }

    // Dequeue operation
    int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front++;

        return value;
    }

    // Peek operation
    int peek() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    // Display queue
    void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class QueueA {

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Removed: " + queue.dequeue());

        queue.display();
    }
}