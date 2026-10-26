public class treeusingLinkedList {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    treeusingLinkedList(){
        root=null;
    }

    void insert(int data){
        root=insertNode(root,data);
    }
    Node  insertNode(Node root ,int data){
        if(root==null)return new Node(data);
        else if(root.data>data){
            root.left=insertNode(root.left,data);
        }
        else if(root.data <data){
            root.right=insertNode(root.right,data);
        }
        return root;
    }

    void preorder(Node root){
        if(root==null) return;

        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root==null)return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void inorder(Node root){
        if(root==null)return;

        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    void display(Node root){
        if(root==null)return;

        display(root.left);
        System.out.println(root.data+" ");
        display(root.right);
    }
    void levelOrder() {

            int h = height(root);

            for (int level = 1; level <= h; level++) {
                printLevel(root, level);
            }
        }

        int height(Node root) {

            if (root == null)
                return 0;

            return 1 + Math.max(
                    height(root.left),
                    height(root.right)
            );
        }

        void printLevel(Node root, int level) {

            if (root == null)
                return;

            if (level == 1) {
                System.out.print(root.data + " ");
                return;
            }

            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }

    public static void main(String[] args) {
        treeusingLinkedList tree =new treeusingLinkedList();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(1);
        tree.insert(40);
        tree.insert(30);
        tree.insert(60);
        tree.display(tree.root);
        tree.inorder(tree.root);
        tree.postorder(tree.root);
        tree.preorder(tree.root);
    }
}
