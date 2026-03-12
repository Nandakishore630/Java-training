package LinkedList;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    // Insert at position
    void insertAtPosition(int data, int pos) {

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }

        if (pos == size) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        size++;
    }

    // Delete at beginning
    void deleteAtBeginning() {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        head = head.next;

        if (head != null)
            head.prev = null;
        else
            tail = null;

        size--;
    }

    // Delete at end
    void deleteAtEnd() {

        if (tail == null) {
            System.out.println("List empty");
            return;
        }

        tail = tail.prev;

        if (tail != null)
            tail.next = null;
        else
            head = null;

        size--;
    }

    // Delete by value
    void deleteByValue(int key) {

        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteAtBeginning();
            return;
        }

        if (temp == tail) {
            deleteAtEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }

    // Search
    boolean search(int key) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    // Update
    void update(int oldValue, int newValue) {

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

    // Display forward
    void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display backward
    void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    // Size
    int getSize() {
        return size;
    }
}

public class DLinkedList {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(25, 2);

        list.displayForward();
        list.displayBackward();

        list.deleteByValue(20);
        list.displayForward();

        list.update(30, 100);
        list.displayForward();

        System.out.println("Search 25: " + list.search(25));

        System.out.println("Size: " + list.getSize());
    }
}