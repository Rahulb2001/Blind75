package Trees;

public class Height {

    int height=0;

    public int Heightoftree(Node root){

        if(root==null){
            return 0;
        }


        int  left=Heightoftree(root.left);
        int  right=Heightoftree(root.right);

        height=Math.max(height,Math.max(left,right)+1);



        return height;

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.left.left=new Node(6);

        Height h=new Height();
        System.out.println(h.Heightoftree(root));
    }


}
