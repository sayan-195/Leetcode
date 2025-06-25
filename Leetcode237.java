public class Leetcode237 {
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

    static void deleteNode(Node a){
        a.data=a.next.data;
        a.next=a.next.next;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //100->13->4->5->12->10
        display(a);
        System.out.println();
        deleteNode(c);
        display(a);
        
        
    }
}
