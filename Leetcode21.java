public class Leetcode21 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node mergeTwoLL(Node h1, Node h2){
        Node t1=h1;
        Node t2=h2;

        Node head = new Node(100);
        Node t = head;

        while(t1 != null && t2 != null){
            if(t1.data<t2.data){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }else{
            t.next=t1;
        }

        return head.next;
    }

    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;

        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(6);

        e.next=f;
        f.next=g;

        Node ans = mergeTwoLL(a, e);
        display(ans);
    }
}
