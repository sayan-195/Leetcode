public class Leetcode234 {
    //Check if a Linkedlist is Palindrome or not 
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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

    static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverseLinkedlist(slow.next);
        slow.next = newHead;
        
        Node p1 = head;
        Node p2 = slow.next;

        while(p2 != null){
            if(p1.data != p2.data){
                return false;
            }else{
                p1=p1.next;
                p2=p2.next;
            }

            
        }

        return true;

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        // Node c = new Node(3);
        // Node d = new Node(4);
        // Node e = new Node(3);
        // Node f = new Node(2);
        // Node g = new Node(1);
        // Node h = new Node(1);
        //Node i = new Node(9);

        a.next=b;
        // b.next=c;
        // c.next=d;
        // d.next=e;
        // e.next=f;
        // f.next=g;
        // g.next=h;
        //h.next=i;
        boolean ans = isPalindrome(a);
        System.out.println(ans);
    }
}

