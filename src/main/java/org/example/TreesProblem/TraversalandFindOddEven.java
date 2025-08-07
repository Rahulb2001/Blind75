package org.example.TreesProblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalandFindOddEven {

    Queue<TreeNode> queue = new LinkedList<>();

    List<Integer> oddResult = new LinkedList<>();
    List<Integer> evenResult = new LinkedList<>();

    public void FindoddEven(TreeNode root){

        if(root==null){
            System.out.println("Tree is empty");
        }

        queue.add(root);

        while(!queue.isEmpty()){

            for(int i=0;i< queue.size();i++){

                TreeNode Current = queue.poll();

                //left view of the tree
                if( i == 0) {
                    System.out.println("Left view of the Tree: " + Current.val);
                }

                if(Current.left != null){
                    queue.add(Current.left);
                }
                if(Current.right != null){
                    queue.add(Current.right);
                }

                //right view of the tree
                if(i == queue.size()-1) {
                    System.out.println("Right view of the Tree: " + Current.val);
                }

            }
        }

        System.out.println("Even Nodes: " + evenResult);
        System.out.println("Odd Nodes: " + oddResult);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TraversalandFindOddEven traversal = new TraversalandFindOddEven();
        traversal.FindoddEven(root);
    }
}
