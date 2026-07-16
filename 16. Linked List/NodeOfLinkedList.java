class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

}

public class NodeOfLinkedList {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        
        // connection
        a.next = b;
        b.next = c;
        c.next = d;


        System.out.println(a.next.next);
        System.out.println(b.next);
        System.out.println(a.next.next.next);

    }
}
