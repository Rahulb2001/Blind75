package org.example.Blind75;

public class DetectandRemoveLoop {

    Node head;

    public void detech_the_loop(Node head) {

        Node slow = head;
        Node fast = head;

        boolean loopExists = false;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop detected at node with value: " + slow.val);
                loopExists = true;
                break;
            }
        }

        if (loopExists) {
            // Step 2: Find start of loop
            slow = head;

            if (slow == fast) {
                // Special case: loop starts at head
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            // Step 3: Remove loop
            fast.next = null;
            System.out.println("Loop removed. The linked list is now:");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }


    public static void main(String[] args) {

        DetectandRemoveLoop detectandRemoveLoop = new DetectandRemoveLoop();

        detectandRemoveLoop.head = new Node(1);
        detectandRemoveLoop.head.next = new Node(2);
        detectandRemoveLoop.head.next.next = new Node(3);
        detectandRemoveLoop.head.next.next.next = new Node(4);
        detectandRemoveLoop.head.next.next.next.next = detectandRemoveLoop.head.next; // Creating a loop

        detectandRemoveLoop.detech_the_loop(detectandRemoveLoop.head);

        Node current = detectandRemoveLoop.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
