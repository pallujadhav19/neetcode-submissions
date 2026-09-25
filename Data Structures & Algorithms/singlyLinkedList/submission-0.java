public class LinkedList {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public int get(int i) {
        Node current = head;

        for (int index = 0; index < i; index++) {
            if (current == null) {
                return -1;
            }
            current = current.next;
        }

        if (current == null) {
            return -1;
        }

        return current.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int i) {

        if (head == null) {
            return false;
        }

        if (i == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return true;
        }

        Node current = head;

        for (int index = 0; index < i - 1; index++) {
            if (current.next == null) {
                return false;
            }

            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        if (current.next == tail) {
            tail = current;
        }

        current.next = current.next.next;

        return true;
    }

    public java.util.ArrayList<Integer> getValues() {

        java.util.ArrayList<Integer> result =
            new java.util.ArrayList<Integer>();

        Node current = head;

        while (current != null) {
            result.add(current.val);
            current = current.next;
        }

        return result;
    }
}