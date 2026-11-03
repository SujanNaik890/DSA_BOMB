public class ReverseListAtPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{11, 20, 31, 40, 50});
        reverselistbyPos(list,2,4);
        list.display();
    }
    static void reverselistbyPos(LinkedList list ,int left,int right){
        if(list.head==null && left==right)return;

        Noode prev=null;
        Noode curr=list.head;

        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        Noode connection=prev;
        Noode tail=curr;

        for(int i=0;i<right-left+1;i++){
            Noode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(connection!=null){
            connection.next=prev;
        }
        else list.head=prev;

        tail.next=curr;
    }
}
