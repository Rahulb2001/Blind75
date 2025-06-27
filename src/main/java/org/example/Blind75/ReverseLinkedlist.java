package org.example.Blind75;

public class ReverseLinkedlist {

    Node head;
    Node temp;
    Node prev;
    Node next;
    Node current;


    public Node reverse(Node head){

        current=head;
        prev=null;
        next=null;

        while(current!=null){

            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        head=prev;
        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedlist reverseLinkedlist = new ReverseLinkedlist();


        reverseLinkedlist.head = new Node(1);
        reverseLinkedlist.head.next = new Node(2);
        reverseLinkedlist.head.next.next = new Node(3);
        reverseLinkedlist.head.next.next.next = new Node(4);
        reverseLinkedlist.head.next.next.next.next = new Node(5);

        // Reversing the linked list
        Node reversedHead = reverseLinkedlist.reverse(reverseLinkedlist.head);

        // Printing the reversed linked list
        Node current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}
