public class Leetcode2095 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static Node deleteMiddleNode(Node head){

        if(head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;

        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;

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

        Node ans = deleteMiddleNode(a);
        display(ans);

    }
}
