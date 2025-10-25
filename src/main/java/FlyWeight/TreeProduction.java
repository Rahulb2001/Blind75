package FlyWeight;

public class TreeProduction {

    public static void main(String[] args) {

        TreeFactory factory=new TreeFactory();

        TreeType oakType=TreeFactory.create_tree("Oak","Green",12);
        TreeType pineType=TreeFactory.create_tree("Pine","Dark Green",15);
        TreeType birchType=TreeFactory.create_tree("Birch","Light Green",10);

        for(int i=0;i<100;i++){
            Tree tree=new Tree(i*5,i*10,oakType);
            tree.draw();
        }

        for(int i=0;i<100;i++){
            Tree tree=new Tree(i*3,i*7,pineType);
            tree.draw();
        }

        for(int i=0;i<100;i++){
            Tree tree=new Tree(i*4,i*9,birchType);
            tree.draw();
        }

    }
}
