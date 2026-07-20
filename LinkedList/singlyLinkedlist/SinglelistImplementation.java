public class SinglelistImplementation {
    public static void main(String[] args) {
  LinkeedList list=new LinkeedList();
  list.insertAtFirst(10);
  list.insertAtFirst(20);

  list.insertAtFirst(30);list.insertAtEnd(100);
  list.insertAtposition(80,6);
  list.Search(100);
  list.display();
  list.deleteAtEnd();
  list.deleteAtFirst();
  list.deleteAtPosition(10);
  list.display();
    }

}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkeedList{
    Node head;
    void insertAtFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    void insertAtEnd(int data){
        if(head==null){
//            insertAtFirst(data);
        }
        Node node =new Node(data);
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
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
        Node node = new Node(data);
        Node temp=head;
        int i=0;
        while(i<pos-1 && temp.next!=null){
            temp=temp.next;i++;
        }
        node.next=temp.next;
        temp.next=node;

    }
    void deleteAtFirst(){
        if(head==null)return;
        Node temp=head;
        head=head.next;
        temp=null;
    }
    void deleteAtEnd(){
        if(head==null)return;
        if(head.next==null) {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){temp=temp.next;}
        temp.next=null;

    }
    void deleteAtPosition(int data){
        if(head==null)return;
        Node temp=head;
        while(temp.next.next!=null &&temp.next.data!=data){
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }
    void Search(int data){
        if(head==null)return;
        Node temp=head;
        int count=1;
        while(temp.data!=data &&temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Element " +data+" Present At index "+count);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

