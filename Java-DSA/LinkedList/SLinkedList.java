package LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    // Insert at end (O(1))
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Insert at beginning (O(1))
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    // Insert at position (O(n))
    public void insertAtPosition(int data, int position) {

        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        if (position == size) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // Delete by value (O(n))
    public void deleteByValue(int key) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == key) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            size--;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Delete by position (O(n))
    public void deleteByPosition(int position) {

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Search (O(n))
    public boolean search(int key) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    // Update by value (O(n))
    public void update(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value not found");
    }

    // Display
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Get size
    public int getSize() {
        return size;
    }
}

public class SLinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 2);

        list.display();

        list.deleteByValue(20);
        list.display();

        list.deleteByPosition(0);
        list.display();

        System.out.println("Search 30: " + list.search(30));

        list.update(30, 100);
        list.display();

        System.out.println("Size: " + list.getSize());
    }
}