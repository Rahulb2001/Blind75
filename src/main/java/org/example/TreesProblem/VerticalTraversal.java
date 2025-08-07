package org.example.TreesProblem;

import java.util.*;

class Pair{

    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class VerticalTraversal {

    private void traversal(TreeNode root){

        HashMap<Integer, List<Integer>> map=new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();

        int minLevel = 0;
        int maxLevel = 0;

        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){

            minLevel=Math.min(minLevel, queue.peek().level);
            maxLevel=Math.max(maxLevel, queue.peek().level);

            Pair current = queue.poll();
            TreeNode currentNode = current.node;
            int currentLevel = current.level;

            if(map.containsKey(current.level)){
                map.get(current.level).add(current.node.val);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(currentNode.val);
                map.put(currentLevel, list);
            }

            if(currentNode.left != null){
                queue.add(new Pair(currentNode.left, current.level - 1));
            }

            if(currentNode.right != null){
                queue.add(new Pair(currentNode.right, current.level + 1));
            }

        }

        for(int i = minLevel; i <= maxLevel; i++) {
            if(map.containsKey(i)) {
                System.out.println("Level " + i + ": " + map.get(i));
            }
        }

        //top view of the tree

        System.out.println("Top view of the tree:");
        for(int i=minLevel;i<=maxLevel;i++){
            if(map.containsKey(i)){
                System.out.print(map.get(i).get(0) + " ");
            }
        }

        System.out.println();
        //bottom view of the tree
        System.out.println("Bottom view of the tree:");
        for(int i=minLevel;i<=maxLevel;i++){
            if(map.containsKey(i)){
                List<Integer> list = map.get(i);
                System.out.print(list.get(list.size() - 1) + " ");
            }
        }


    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        VerticalTraversal verticalTraversal = new VerticalTraversal();
        verticalTraversal.traversal(root);
    }


}
