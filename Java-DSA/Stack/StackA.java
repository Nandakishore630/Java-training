package Stack;
class StackArray {

    int arr[];
    int top;
    int capacity;

    StackArray(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void push(int data) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        return arr[top];
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class StackA {

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        stack.display();
    }
}