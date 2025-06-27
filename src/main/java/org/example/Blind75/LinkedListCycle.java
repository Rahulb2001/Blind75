package org.example.Blind75;

public class LinkedListCycle {

    public boolean hasCycle(Node head){

        if (head==null || head.next==null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while(fast !=null && fast.next !=null){

            if (slow == fast) {
                return true; // Cycle detected
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // Creating a cycle

        boolean result = linkedListCycle.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
    }
}
