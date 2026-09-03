public class treeUsingArray {
    int[] tree;
    int size;

    treeUsingArray(int capacity){
        tree=new int[capacity];
        size=0;
    }
    void insert(int data){
        if(size==tree.length){
            System.out.println("Tree is full");
            return;
        }
        tree[size++]=data;
    }
    void preorder(int index){
        if(index >=size){
            return;
        }
        System.out.println(tree[index]+" ");
        preorder(2 * index +1);
        preorder(2* index +2);
    }

    void inorder(int index){
        if(index>=size){
            return;
        }
        inorder(2 * index+1);
        System.out.println(tree[index]);
        inorder(2* index+2);
    }
     void postoder(int index){
        if(index>= size){
            return;
        }
        postoder(2 *index+1);
        postoder(2 * index+2);
        System.out.println(tree[index]);
     }

     void display(){
        if(tree.length==0){
            return;
        }
        for(int i=0;i<tree.length;i++){
            System.out.println(tree[i]);
        }

     }

    public static void main(String[] args) {
       treeUsingArray t=new treeUsingArray(5);
       t.insert(10);t.insert(20);
       t.insert(5);
       t.insert(19);
       t.insert(30);
       t.display();
       t.inorder(0);
       t.preorder(0);
       t.postoder(0);

    }
}
