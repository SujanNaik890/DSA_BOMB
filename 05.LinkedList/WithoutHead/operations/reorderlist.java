public class reorderlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 21, 30, 45, 50});
        countNodes(list);
        display(list);
    }
    static void countNodes(LinkedList list) {
        if(list.head==null || list.head.next==null )return;

        Noode slow=list.head;
        Noode fast=list.head;
        while(fast !=null && fast.next !=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        Noode prev=null;
        Noode curr=slow.next;
        slow.next=null;
        Noode next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Noode first =list.head,last =prev;
        while(last!=null){
            Noode temp1=first.next;
            Noode temp2=last.next;

            first.next=last;
            last.next=temp1;

            first=temp1;
            last=temp2;
        }

    }
    static void display(LinkedList list){
        if(list.head==null)return;
        Noode temp=list.head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}