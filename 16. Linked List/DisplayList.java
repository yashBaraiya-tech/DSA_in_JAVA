class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

}

public class DisplayList {

    public static void DisplayRec(Node head) {
        if (head == null)
            return;
        System.out.print(head.val + " ");
        DisplayList(head.next);

    }

    public static void DisplayList(Node head) {

        // using while loop
        // Node tmp = head;
        // while (tmp != null) {
        // System.out.print(tmp.val+" ");
        // tmp = tmp.next;
        // }

        // using for loop
        for (Node tmp = head; tmp != null; tmp = tmp.next) {
            System.out.print(tmp.val + " ");
        }

    }

    public static int get(Node head, int idx) {
        Node tmp = head;
        for (int i = 1; i <= idx; i++) {
            tmp = tmp.next;
        }

        return tmp.val;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        // connection
        a.next = b;
        b.next = c;
        c.next = d;

        DisplayList(a);
        System.out.println();
        DisplayRec(a);
        System.out.println();

        System.out.println(get(a, 2));

    }
}
