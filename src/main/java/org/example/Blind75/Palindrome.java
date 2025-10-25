package org.example.Blind75;

public class Palindrome {

    public boolean Palin(Node head){

        Node slow= head;
        Node fast= head;

        while(fast !=null && fast.next !=null){
            slow= slow.next;
            fast=fast.next.next;
        }

        Node cur = slow;
        Node prev = null;


        while (cur!=null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        boolean isPalindrome = palindrome.Palin(head);

        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
