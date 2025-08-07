package org.example.TreesProblem;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        return traversal(p, q);
    }


    public Boolean traversal(TreeNode p, TreeNode q){

        if(p == null && q == null) {
            return true;
        }

        if(p.val==q.val) {
            return traversal(p.left, q.left) && traversal(p.right, q.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
//        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(0);
        q.right = new TreeNode(3);

        SameTree sameTree = new SameTree();
        boolean result = sameTree.isSameTree(p, q);

        System.out.println("Are the two trees the same? " + result);
    }
}
