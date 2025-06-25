//Finding intersection of Two LinkedList
public class Leetcode160 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int findLength(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node findIntersection(Node head1, Node head2) {
        int len1 = findLength(head1);
        int len2 = findLength(head2);

        Node temp1 = head1; // a
        Node temp2 = head2; // g

        if (len1 > len2) {
            for (int i = 1; i <= len1 - len2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 1; i <= len2 - len1; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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

        Node g = new Node(90);
        Node h = new Node(9);

        g.next = h;
        h.next = d;
        // 100->13->4->5->12->10
        // display(g);
        Node temp = findIntersection(a, g);
        System.out.println(temp.data);
    }
}
