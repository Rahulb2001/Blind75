package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    Queue<Node> qu = new LinkedList<>();

    public void traversal(Node root) {

        qu.add(root);

        while (!qu.isEmpty()) {

            Node cur = qu.poll();
            System.out.print(" " + cur.x);

            if (cur.left != null) {
                qu.add(cur.left);
            }

            if (cur.right != null) {
                qu.add(cur.right);
            }
        }
    }

    public void leftView(Node root) {

        qu.add(root);

        while (!qu.isEmpty()) {

            for (int i = 0; i < qu.size(); i++) {

                Node cur = qu.poll();

                if (i == 0) {
                    System.out.println("Left View " + cur.x);
                }

                if (cur.left != null) {
                    qu.add(cur.left);
                }

                if (cur.right != null) {
                    qu.add(cur.right);
                }

            }


        }
    }


    public void rightView(Node root) {

        qu.add(root);

        while (!qu.isEmpty()) {

            for (int i = 0; i < qu.size(); i++) {

                Node cur = qu.poll();

                if (i == qu.size()) {
                    System.out.println("Right View " + cur.x);
                }

                if (cur.left != null) {
                    qu.add(cur.left);
                }

                if (cur.right != null) {
                    qu.add(cur.right);
                }

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

        LevelOrderTraversal lot = new LevelOrderTraversal();
        //lot.traversal(root);
        lot.leftView(root);
        lot.rightView(root);
    }
}
