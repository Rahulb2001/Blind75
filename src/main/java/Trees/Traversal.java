package Trees;


public class Traversal {

    public void inorder(Node root){

        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.x);
        inorder(root.right);

    }

    public void preorder(Node root){

        if(root==null){
            return;
        }
        System.out.println(root.x);
        preorder(root.left);
        preorder(root.right);

    }

    public void postorder(Node root){

        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.x);

    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        Traversal t=new Traversal();
        System.out.println("Inorder Traversal:");
        t.inorder(root);

        System.out.println("Preorder Traversal:");
        t.preorder(root);

        System.out.println("Postorder Traversal:");
        t.postorder(root);
    }
}
