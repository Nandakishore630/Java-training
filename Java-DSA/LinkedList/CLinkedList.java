package LinkedList;
class CircularLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }

        size++;
    }

    // Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        size++;
    }

    // Delete by value
    void delete(int key) {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        // delete head
        if (head.data == key) {

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }

            size--;
            return;
        }

        Node current = head;

        while (current.next != head && current.next.data != key) {
            current = current.next;
        }

        if (current.next.data == key) {

            if (current.next == tail) {
                tail = current;
            }

            current.next = current.next.next;
            size--;

        } else {
            System.out.println("Value not found");
        }
    }

    // Search
    boolean search(int key) {

        if (head == null)
            return false;

        Node temp = head;

        do {
            if (temp.data == key)
                return true;

            temp = temp.next;

        } while (temp != head);

        return false;
    }

    // Display
    void display() {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Size
    int getSize() {
        return size;
    }
}

public class CLinkedList {

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);

        list.display();

        list.delete(20);
        list.display();

        System.out.println("Search 30: " + list.search(30));

        System.out.println("Size: " + list.getSize());
    }
}