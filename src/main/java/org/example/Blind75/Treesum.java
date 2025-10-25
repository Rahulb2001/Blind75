package org.example.Blind75;

public class Treesum {

    public int treesum(TreeNode root){

        if(root == null) {
            return 0;
        }

        int leftSum = treesum(root.left);
        int rightSum = treesum(root.right);

        return leftSum+rightSum+ root.val;
    }

    public int countnode(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1 + countnode(root.left) + countnode(root.right);
    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Treesum treesum = new Treesum();
        int sum = treesum.treesum(root);
        System.out.println("The sum of all nodes in the tree is: " + sum);

        int count = treesum.countnode(root);
        System.out.println("The total number of nodes in the tree is: " + count);
    }
}
