
public class LinkedList {
        Noode head;
        int size=0;

    void insertAtFirst(int data){
            Noode node=new Noode(data);
            node.next=head;
            head=node;
            size++;
        }
        void insertAtEnd(int data){
            if(head==null){
            insertAtFirst(data);return;
            }
            Noode node =new Noode(data);
            Noode temp= head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            size++;
        }
        void insertAtposition(int data,int pos) {
            if (head == null) {
                insertAtFirst(data);
                return;
            }
            if (pos == 1) {
                insertAtFirst(data);
                return;
            }
            Noode node = new Noode(data);
            Noode temp=head;
            int i=0;
            while(i<pos-1 && temp.next!=null){
                temp=temp.next;i++;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
        void deleteAtFirst(){
            if(head==null)return;
            Noode temp=head;
            head=head.next;
            temp=null;
            size--;
        }
        void deleteAtEnd(){
            if(head==null)
                return;
            if(head.next==null) {
                head=null;
                size--;
                return;
            }
            Noode temp=head;
            while(temp.next.next!=null){temp=temp.next;}
            temp.next=null;
            size--;
        }
        void deleteAtPosition(int data){
            if(head==null)return;
            Noode temp=head;
            while(temp.next.next!=null &&temp.next.data!=data){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
        void Search(int data){
            if(head==null)return;
            Noode temp=head;
            int count=1;
            while(temp.data!=data &&temp!=null){
                count++;
                temp=temp.next;
            }
            System.out.println("Element " +data+" Present At index "+count);
        }
        void display(){
            Noode temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public void addAll(int[] arr) {
        for (int value : arr) {
            insertAtEnd(value);
        }
    }
}
