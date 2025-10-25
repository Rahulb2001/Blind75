package org.example.Blind75;

import static org.example.Blind75.DeleteTheNode.printList;

public class SortLinkedList {

    Node head;

    int[] count = new int[3];

    public Node SortedList(Node head) {

        Node temp = head;

        while (temp != null) {
            count[temp.val]++;
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {

            if (count[0] > 0) {
                temp.val = 0;
                count[0]--;
            } else if (count[1] > 0) {
                temp.val = 1;
                count[1]--;
            } else if (count[2] > 0) {
                temp.val = 2;
                count[2]--;
            }
            temp = temp.next;
        }
        return head;
    }



    public static void main(String[] args) {
        SortLinkedList sortLinkedList = new SortLinkedList();

        sortLinkedList.head = new Node(2);
        sortLinkedList.head.next = new Node(0);
        sortLinkedList.head.next.next = new Node(2);
        sortLinkedList.head.next.next.next = new Node(1);
        sortLinkedList.head.next.next.next.next = new Node(1);
        sortLinkedList.head.next.next.next.next.next = new Node(0);

        Node sortedHead = sortLinkedList.SortedList(sortLinkedList.head);

        printList(sortedHead);
    }




}
