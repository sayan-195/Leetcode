public class Leetcode83 {
    //Remove duplicates from sorted LinkedLIst
    static Node removeDuplicates(Node head){
        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.next.data == temp.data){
                temp.next=temp.next.next;
            }

            if(temp.next == null) return head;

            if(temp.data != temp.next.data){
                temp=temp.next;
            }
        }

        return head;

        
    }

    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(3);
        Node h = new Node(4);
        Node i = new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;

        Node ans = removeDuplicates(a);
        display(ans);
    }
}

