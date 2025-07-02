public class Leetcode206 {
    //Reverse a linkedList
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static Node reverseLinkedlist(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;

        Node ans = reverseLinkedlist(a);
        display(ans);
    }
}

