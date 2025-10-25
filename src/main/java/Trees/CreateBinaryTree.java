package Trees;

public class CreateBinaryTree {

    public Node crete(int ps,int pe,int ins,int ine,int[] pre,int[] in){

        if(ps>pe || ins>ine){
            return null;
        }

        int rootdata=pre[ps];
        Node root=new Node(rootdata);
        int middleindex=findele(ins,ine,rootdata,in);
        int elementSize=middleindex-ins;


        root.left=crete(ps+1,elementSize+ps,ins,middleindex-1,pre,in);
        root.right=crete(elementSize+ps+1,pe,middleindex+1,ine,pre,in);

        return root;
    }

    private int findele(int ins, int ine, int ps, int[] in) {

        for(int i=0;i<in.length;i++){
            if(in[i]==ps){
                return i;
            }
        }
        return -1;
    }

    public void printTree(Node root) {
        if (root == null) return;
        System.out.print(root.x + " ");
        printTree(root.left);
        printTree(root.right);
    }


    public static void main(String[] args) {
        CreateBinaryTree createBinaryTree=new CreateBinaryTree();
        int[] pre={1,2,4,5,3,6,7};
        int[] in={4,2,5,1,6,3,7};
        Node root=createBinaryTree.crete(0,pre.length-1,0,in.length-1,pre,in);
        createBinaryTree.printTree(root);
    }
}
