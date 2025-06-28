package org.example.Blind75;

public class DeleteTheNode {

    Node head;

    public void DeleteNode(Node deleteNode) {

        if (head == deleteNode) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next == deleteNode) {
                temp.next = temp.next.next;
                return;
            }
        }
        temp = temp.next;

    }

    public static void main(String[] args) {
        DeleteTheNode deleteTheNode = new DeleteTheNode();

        deleteTheNode.head = new Node(1);
        deleteTheNode.head.next = new Node(2);
        deleteTheNode.head.next.next = new Node(3);
        deleteTheNode.head.next.next.next = new Node(4);

        System.out.println("Before deletion:");
        printList(deleteTheNode.head);

        deleteTheNode.DeleteNode(deleteTheNode.head.next); // Deleting node with value 2

        System.out.println("After deletion:");
        printList(deleteTheNode.head);
    }

    private static void printList(Node head) {

        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
