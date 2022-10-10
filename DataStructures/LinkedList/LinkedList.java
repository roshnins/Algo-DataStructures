package DataStructures.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Nested Constructor class for Node
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // print all items in the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    // Append to end of Linked List
    public void append(int value) {
        Node newNode = new Node(value);
        // if list is empty, new node will be both head and tail
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            // set last elemnt to point to new element
            tail.next = newNode;
            // set new element to be the new tail
            tail = newNode;
        }
        length++;

    }

    // Remove last item in Linked List
    // Returns the removed node
    public Node removeLast() {
        Node pre = head;
        Node temp = head;
        if (length == 0) {
            return null;
        } else {
            // two temp variables traversing the list
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;

            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    // Add item to start of Linked List
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Remove first item from Linked List
    public Node removeFirst() {

        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if (length == 0) {
                tail = null;
            }
            return temp;
        }
    }

    // Get node at an index
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

    // Set node to a value
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    // Insert node at an index
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    // Remove an item at an index
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    // Reverse a linked list
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}
