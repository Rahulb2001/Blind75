package org.example.Blind75;

import java.util.HashSet;

public class DeleteDuplictesFromSorted {

    HashSet<Integer> set = new HashSet<>();

    Node temp;

    public Node deleteDuplicate(Node head){

        temp=head;
        Node prev=null;
        while(temp!=null){

            if(set.contains(temp.val)){
                System.out.println("Duplicate found: " + temp.val);
                prev.next=temp.next;
            }else{
                set.add(temp.val);
                prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        DeleteDuplictesFromSorted deleteDuplictesFromSorted = new DeleteDuplictesFromSorted();

        deleteDuplictesFromSorted.temp = new Node(1);
        deleteDuplictesFromSorted.temp.next = new Node(1);
        deleteDuplictesFromSorted.temp.next.next = new Node(2);
        deleteDuplictesFromSorted.temp.next.next.next = new Node(3);
        deleteDuplictesFromSorted.temp.next.next.next.next = new Node(3);

        Node head = deleteDuplictesFromSorted.deleteDuplicate(deleteDuplictesFromSorted.temp);

        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
