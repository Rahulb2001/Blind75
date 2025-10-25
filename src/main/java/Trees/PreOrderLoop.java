package Trees;

import java.util.Stack;

class Pair{

    Node node;
    int state;

    public Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }

}

public class PreOrderLoop {

    public void preOrder(Node root){

        Stack<Pair> st= new Stack<>();
        Pair rtp= new Pair(root,1);
        st.push(rtp);

        while(!st.isEmpty()) {

            Pair top = st.peek();

            if (top.state == 1) {
                top.state++;
                if (top.node.left != null) {
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
            } else if (top.state == 2) {

                top.state++;
                System.out.println(top.node.x);
            } else if (top.state == 3) {

                top.state++;
                if (top.node.right != null) {
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }

            } else {
                st.pop();
            }
        }
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        PreOrderLoop preOrderLoop= new PreOrderLoop();
        preOrderLoop.preOrder(root);
    }
}
