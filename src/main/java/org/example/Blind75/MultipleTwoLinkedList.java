package org.example.Blind75;

public class MultipleTwoLinkedList {

    Node head1;
    Node head2;

    public int MutipleLinkedList(Node head1,Node head2){

        long MOD= 1000000007;
        long num1=0;
        long num2=0;
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1!=null ||  temp2 !=null){

            if(temp1!=null){
                num1= (num1 * 10 + temp1.val) % MOD;
                temp1=temp1.next;
            }

            if(temp2!=null){
               num2=(num2 * 10 + temp2.val) % MOD;
                temp2=temp2.next;
            }

        }

        return (int)((num1 * num2) % MOD);
    }

    public static void main(String[] args) {
        MultipleTwoLinkedList multipleTwoLinkedList = new MultipleTwoLinkedList();

        multipleTwoLinkedList.head1 = new Node(1);
        multipleTwoLinkedList.head1.next = new Node(0);
        multipleTwoLinkedList.head1.next.next = new Node(0);

        multipleTwoLinkedList.head2 = new Node(1);
        multipleTwoLinkedList.head2.next = new Node(0);

        int result = multipleTwoLinkedList.MutipleLinkedList(multipleTwoLinkedList.head1, multipleTwoLinkedList.head2);
        System.out.println("The product of the two linked lists is: " + result);
    }
}
