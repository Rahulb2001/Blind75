package Binary_Search_tree;

public class MorrisAlgo {

    public void Morris(Node root){

        Node cur=root;

        while(cur != null) {

            if (cur.left == null) {

                System.out.println(" " + cur.x);
                cur = cur.right;

            } else {

                Node temp = cur.left;

                while (temp.right != null && temp.right != cur) {
                    temp = temp.right;
                }

                if (temp.right == null) {
                    temp.right = cur;
                    cur = cur.left;
                } else {
                    temp.right = null;
                    System.out.println(" " + cur.x);
                    cur = cur.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        MorrisAlgo morrisAlgo=new MorrisAlgo();
        morrisAlgo.Morris(root);
    }
}
