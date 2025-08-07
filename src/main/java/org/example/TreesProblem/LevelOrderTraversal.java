package org.example.TreesProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    Queue<TreeNode> queue = new LinkedList<>();

    List<Integer> result = new ArrayList<>();

    List<Integer> sumresult = new ArrayList<>();

    int height = 0;

    public void LevelorderTraversal(TreeNode root) {

        queue.add(root);
        while (!queue.isEmpty()) {

            int q_size = queue.size();
            int sum = 0;
            height++;

            for (int i = 0; i < q_size; i++) {
                TreeNode current = queue.poll();
                sum += current.val;


                if (i == 0) {
                    System.out.println("Left view of the Tree " + current.val);
                }

                if (current.left != null) {
                    queue.add(current.left);
                    result.add(current.left.val);
                }

                if (current.right != null) {
                    queue.add(current.right);
                    result.add(current.right.val);
                }

                if (i == q_size - 1) {
                    sumresult.add(sum);
                    System.out.println("Right view of the Tree " + current.val);
                }

            }
            sumresult.add(sum);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.LevelorderTraversal(root);

        System.out.println(levelOrderTraversal.result);

        System.out.println(levelOrderTraversal.sumresult);

        System.out.println("Height of the tree is " + levelOrderTraversal.height);

    }
}
