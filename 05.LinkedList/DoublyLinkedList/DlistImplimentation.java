public class DlistImplimentation {
    Node head=null;
    public class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    void insertAtFirst(int data){
        Node node =new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
    }
    void insertAtEnd(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node.prev=temp;
        temp.next=node;

    }
    void insertAtposition(int data,int pos){
        if(head==null){
            return;
        }
        Node node=new Node(data);
        if(pos==1){
            node.next=head;
            head.prev=node;
            head=node;
            return;
        }
        Node temp=head;
        int i=0;
        while(i<pos-2 && temp.next!=null){
            temp=temp.next;i++;
        }
        node.next=temp.next;
        temp.next=node;
        temp.next.prev=node;
        node.prev=temp;
    }
     void deleteAtFrist(){
        if(head==null){
            return;
        }
        head.next.prev=null;
        head=head.next;

     }
     void deleteAtEnd(){
        if(head==null)return;
        if(head.next==null)head=null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.prev=null;
        temp.next=null;
     }
     void deleteAtPos(int data){
        if(head==null)return;
        Node temp=head;
        while(temp.next.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
     }
    void display(){
        if(head == null)
                return;
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
        while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
    }

    public static void main(String[] args) {
        DlistImplimentation dlist=new DlistImplimentation();
        dlist.insertAtEnd(200);
        dlist.insertAtFirst(10);
        dlist.insertAtFirst(20);
        dlist.insertAtFirst(30);dlist.insertAtEnd(300);
        dlist.insertAtposition(100,3);
        dlist.display();
        dlist.deleteAtFrist();
        dlist.deleteAtEnd();
        dlist.deleteAtPos(100);
        dlist.display();
    }
}
