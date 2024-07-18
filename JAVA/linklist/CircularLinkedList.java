class CircularLinkedList {
    // Node class to define each node in the circular linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the circular linked list
    private Node head = null;
    private Node tail = null;

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point the new node to itself, creating a circular structure
        } else {
            tail.next = newNode; // Point the current tail to the new node
            tail = newNode; // Update the tail to the new node
            tail.next = head; // Point the new tail to the head, maintaining the circular structure
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Method to remove a node from the list
    public void remove(int data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node current = head;
        Node previous = null;
        
        do {
            if (current.data == data) {
                if (previous != null) {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                } else {
                    // This means we are removing the head node
                    if (head == tail) {
                        // Only one element in the list
                        head = null;
                        tail = null;
                    } else {
                        head = current.next;
                        tail.next = head;
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
        
        System.out.println("Element " + data + " not found in the list.");
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Circular Linked List:");
        list.display();

        list.remove(3);
        System.out.println("After removing 3:");
        list.display();

        list.remove(1);
        System.out.println("After removing 1:");
        list.display();
    }
}
