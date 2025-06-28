public class Leetcode142 {
    // Find out the Node where the cycle begins i.e,the node where the tail Node
    // points.

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;

        // Step 1: Detect if a cycle exists using Floyd's Tortoise and Hare
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find the starting node of the cycle
                Node temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }

        return null; // No cycle
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = d;

        Node ans = findCycle(a);
        System.out.println(ans.data);

    }

}
