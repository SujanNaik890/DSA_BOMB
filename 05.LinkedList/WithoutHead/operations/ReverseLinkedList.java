public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{11, 20, 31, 40, 50});
        reverselist(list);
        list.display();
    }
    static void reverselist(LinkedList list){
        if(list.head==null)return;
        if(list.head.next==null){
            return;
        }
        Noode prev = null;
        Noode curr = list.head;
        Noode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head=prev;
    }

}
