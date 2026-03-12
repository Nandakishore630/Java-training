package Stack;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {

    Node top;

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        return top.data;
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Stack elements:");

        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class StackLL {

    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        stack.display();
    }
}