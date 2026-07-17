class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        // code here

        // method 1
        // Node tmp = head;
        // int length = 0;
        // while (tmp != null) {
        // tmp = tmp.next;
        // length++;
        // }
        // tmp = head;
        // for (int i = 1; i<=length/2; i++) {
        // tmp = tmp.next;
        // }
        // return tmp.data;

        // method 2
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }
}