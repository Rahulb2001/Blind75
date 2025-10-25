package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HorizontalTraversing {

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    int min = 0;
    int max = 0;

    Queue<Pair> que = new LinkedList<>();

    public void traversal(Node root) {

        que.add(new Pair(root, 0));

        while (!que.isEmpty()) {

            Pair temp = que.poll();

            min = Math.min(min, temp.state);
            max = Math.max(max, temp.state);

            if (!map.containsKey(temp.state)) {
                map.put(temp.state, new ArrayList<>());
            }
            map.get(temp.state).add(temp.node.x);

            if (temp.node.left != null) {
                que.add(new Pair(temp.node.left, temp.state--));

            }
            if (temp.node.right != null) {
                que.add(new Pair(temp.node.right, temp.state++));
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i));
        }
    }

    public void topView(Node root) {

        que.add(new Pair(root, 0));

        while (!que.isEmpty()) {

            Pair temp = que.poll();

            min = Math.min(min, temp.state);
            max = Math.max(max, temp.state);

            if (!map.containsKey(temp.state)) {
                map.put(temp.state, new ArrayList<>());
            }
            map.get(temp.state).add(temp.node.x);

            if (temp.node.left != null) {
                que.add(new Pair(temp.node.left, temp.state--));

            }
            if (temp.node.right != null) {
                que.add(new Pair(temp.node.right, temp.state++));
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.println("Top View " + map.get(i).get(0));
        }
    }

    public void bottomView(Node root) {

        que.add(new Pair(root, 0));

        while (!que.isEmpty()) {

            Pair temp = que.poll();

            min = Math.min(min, temp.state);
            max = Math.max(max, temp.state);

            if (!map.containsKey(temp.state)) {
                map.put(temp.state, new ArrayList<>());
            }
            map.get(temp.state).add(temp.node.x);

            if (temp.node.left != null) {
                que.add(new Pair(temp.node.left, temp.state--));

            }
            if (temp.node.right != null) {
                que.add(new Pair(temp.node.right, temp.state++));
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.println("Top View " + map.get(i).get(map.get(i).size() - 1));
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

        HorizontalTraversing ht = new HorizontalTraversing();
        ht.traversal(root);

        ht.topView(root);
    }


}
