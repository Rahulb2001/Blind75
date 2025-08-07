package org.example.TreesProblem;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

    List<Integer> evenResult =new ArrayList<>();
    List<Integer> oddResult =new ArrayList<>();

    public TreeNode traversal(TreeNode root){

        if(root==null){
            return null;
        }

        if(root.val % 2 == 0) {
            evenResult.add(root.val);
        } else {
            oddResult.add(root.val);
        }

        traversal(root.left);
        traversal(root.right);
        return root;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        EvenOdd evenOdd = new EvenOdd();
        evenOdd.traversal(root);

        System.out.println("Even Nodes: " + evenOdd.evenResult);
        System.out.println("Odd Nodes: " + evenOdd.oddResult);
    }

}
