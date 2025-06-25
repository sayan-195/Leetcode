public class Leetcode19 {
    // Removeing Nth Node from the end of LinkedList in One traversal.
    // 100->13->4->5->12->10

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteNNode(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100->13->4->5->12->10
        display(a);
        System.out.println();
        a = deleteNNode(a, 6);
        display(a);
    }
}
