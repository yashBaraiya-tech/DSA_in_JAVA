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
    void deleteAtHead(){
        if(head==null){
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;
    }

    // display
    void display() {
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // get
    int get(int idx) {
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    
}

public class LinkedListDataStructure {
    public static void main(String[] args) {

    }
}
