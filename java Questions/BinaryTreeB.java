
public class BinaryTreeB {
    static class Node{
        int date;
        Node left;
        Node right;

        Node(int date){
            this.date = date;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root ==  null){
                return;
            }
            System.out.print(root.date+" ");
            preorder(root.left);
            preorder(root.right);

        }
    }

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.date);
        tree.preorder(root);
    }
}
