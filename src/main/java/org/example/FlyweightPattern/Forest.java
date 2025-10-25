package org.example.FlyweightPattern;

public class Forest {

    public static void main(String[] args) {

        TreeType oak = TreeFactory.getTreeTyoe("Oak", "Green", "Rough");
        TreeType pine = TreeFactory.getTreeTyoe("Pine", "Dark Green", "Smooth");
        TreeType birch = TreeFactory.getTreeTyoe("Birch ", "White", "Smooth");

        Tree tree1 = new Tree(10, 20, oak);
        Tree tree2 = new Tree(15, 25, pine);
        Tree tree3 = new Tree(30, 40, birch);

        tree1.draw();
        tree2.draw();
        tree3.draw();
    }
}
