package org.example.Blind75;


public class CloneLinkedList {

    public Linkedlist Clone(Linkedlist head) {

        Linkedlist temp = head;

        while (temp != null) {

            Linkedlist newNode = new Linkedlist(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        temp = head;

        while (temp != null) {

            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = head;
        Linkedlist clonedHead = head.next;

        while (temp != null) {

            Linkedlist clonedNode = temp.next;
            temp.next = clonedNode.next;
            temp = temp.next;

            if (temp != null) {
                clonedNode.next = temp.next;
            }
        }
        return clonedHead;
    }


    public static void main(String[] args) {
        CloneLinkedList cloneLinkedList = new CloneLinkedList();

        Linkedlist head = new Linkedlist(1);
        head.next = new Linkedlist(2);
        head.next.next = new Linkedlist(3);
        head.next.next.next = new Linkedlist(4);
        head.next.next.next.next = new Linkedlist(5);

        // Setting random pointers
        head.random = head.next.next; // 1 -> 3
        head.next.random = head; // 2 -> 1
        head.next.next.random = head.next.next.next; // 3 -> 4
        head.next.next.next.random = null; // 4 -> null
        head.next.next.next.next.random = head; // 5 -> 1

        Linkedlist clonedHead = cloneLinkedList.Clone(head);

        // Printing the cloned linked list
        Linkedlist current = clonedHead;
        while (current != null) {
            System.out.print("Value: " + current.val + ", Random: " + (current.random != null ? current.random.val : "null") + " | ");
            current = current.next;
        }
    }
}
