package Binary_Search_tree;



public class InsertioninBST {

    public void insert(Node root,int k){

        if(root==null){
            return ;
        }

        if(k<root.x){

            if(root.left==null){
                Node newnode=new Node(k);
                root.left=newnode;
            }else{
                insert(root.left,k);
            }
        }else{

            if(root.right==null){
                Node newnode=new Node(k);
                root.right=newnode;
            }else{
                insert(root.right,k);
            }
        }

    }

    public void print(Node root){
        if(root==null){
            return ;
        }

        print(root.left);
        System.out.println(root.x);
        print(root.right);
    }

    public static void main(String[] args) {
        InsertioninBST insertioninBST=new InsertioninBST();
        Node root=new Node(10);
        insertioninBST.insert(root,5);
        insertioninBST.insert(root,15);
        insertioninBST.insert(root,3);
        insertioninBST.insert(root,7);
        insertioninBST.insert(root,12);
        insertioninBST.insert(root,18);

        System.out.println("Insertion Completed");

        insertioninBST.print(root);
    }

}
