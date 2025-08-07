package org.example.TreesProblem;


class Node {
    int data;
    Node left, right, next;

    Node(int item) {
        data = item;
        left = right = next = null;
    }
}


public class NextPointer {

    Node dummy = new Node(-1);
    Node temp = dummy;

    public void travese(Node root) {

        while (root != null) {

            if (root.left != null) {
                temp.next = root.left;
                temp = temp.next;
            }

            if (root.right != null) {
                temp.next = root.right;
                temp = temp.next;
            }

            root= root.next;

            if (root == null) {
                root = dummy.next;
                dummy.next = null;
                temp = dummy;
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        NextPointer nextPointer = new NextPointer();
        nextPointer.travese(root);

        Node levelStart = root;
        while (levelStart != null) {
            Node current = levelStart;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");

            if (levelStart.left != null)
                levelStart = levelStart.left;
            else if (levelStart.right != null)
                levelStart = levelStart.right;
            else {
                Node next = levelStart.next;
                while (next != null) {
                    if (next.left != null) {
                        levelStart = next.left;
                        break;
                    } else if (next.right != null) {
                        levelStart = next.right;
                        break;
                    }
                    next = next.next;
                }
                if (next == null) break;
            }
        }

    }
}
