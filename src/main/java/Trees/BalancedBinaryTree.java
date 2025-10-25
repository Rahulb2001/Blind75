package Trees;

public class BalancedBinaryTree {

    public int heigt;

    public int height(Node root){

        if(root==null){
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);

        heigt=Math.max(heigt,Math.max(left,right)+1);

        return heigt;
    }


    public boolean isBalanced(Node root){

        if(root==null){
            return true;
        }

        int left=height(root.left);
        int right=height(root.right);

        if(Math.abs(left-right)>1){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {

        BalancedBinaryTree tree=new BalancedBinaryTree();

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.left.left=new Node(6);


        System.out.println("Height of tree: "+tree.height(root));
        System.out.println("Is Balanced: "+tree.isBalanced(root));
    }
}
