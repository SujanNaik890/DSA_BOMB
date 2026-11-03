public class RightRotatebyKelemrnts {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{11, 20, 31, 40, 50});
        rotatelist(list,3);
        list.display();
    }
    static  void rotatelist(LinkedList list,int j)
    {
        int i=0;
        while(i<j){
            Noode head=rotateknode(list);
            i++;
        }

    }

    static Noode rotateknode(LinkedList list){
        Noode temp=list.head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.next=list.head;
        Noode temp2=list.head;
        list.head=list.head.next;
        temp2.next=null;
        return list.head;
    }
}


