package org.example.TreesProblem;

import java.util.ArrayList;

public class Traversal {


    ArrayList<Integer> Inorderresult = new ArrayList<>();
    public void inorderTraversal(TreeNode root){

        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        Inorderresult.add(root.val );
        inorderTraversal(root.right);
    }

    ArrayList<Integer> preorderresult = new ArrayList<>();

    public void  preorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        preorderresult.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    ArrayList<Integer> postorderresult = new ArrayList<>();

    public void  postorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postorderresult.add(root.val);
    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Traversal traversal = new Traversal();
        traversal.inorderTraversal(root);
        traversal.preorderTraversal(root);
        traversal.postorderTraversal(root);

        System.out.println(traversal.Inorderresult);

        System.out.println(traversal.preorderresult);

        System.out.println(traversal.postorderresult);
    }
}
