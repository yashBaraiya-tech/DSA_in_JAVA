class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Linkedlist {
    Node head;
    Node tail;
    int size;

    // add at head
    void addAtHead(int val) {
        Node tmp = new Node(val);
        if (head == null)
            head = tail = tmp;
        else {
            tmp.next = head;
            head = tmp;
        }
        size++;
    }

    // add at tail
    void addAtTail(int val) {
        Node tmp = new Node(val);
        if (tail == null)
            head = tail = tmp;
        else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
    }

    // delet from head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next;
        if (head == null)
            tail = null;
        size--;
    }

    // display
    void display() {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // get
    int get(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // serching
    int search(int val) {
        if (head == null)
            return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val)
                return idx;

            idx++;
            temp = temp.next;
        }
        return -1;
    }

    // insert
    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("envalid index");
            return;
        }

        if (idx == 0)
            addAtHead(val);
        else if (idx == size)
            addAtTail(val);
        else {
            Node tmp = head;
            for (int i = 1; i <= idx - 1; i++) {
                tmp = tmp.next;
            }

            Node t = new Node(val);
            t.next = tmp.next;
            tmp.next = t;
            size++;
        }
    }

    // detel
    void delete(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("envalid index");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        Node tmp = head;
        for (int i = 1; i <= idx - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        if (idx == size - 1)
            tail = tmp;
        size--;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {

    }
}
