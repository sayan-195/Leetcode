public class Leetcode141 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static boolean hasCycle(Node head) {
        if(head==null) return false;
        if(head.next==null) return false;
        Node slow=head;
        Node fast=head;

        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=b;

        Boolean ans = hasCycle(a);
        System.out.println(ans);

    }
}
