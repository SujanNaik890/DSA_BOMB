public class CDLinkedList {
    public static void main(String[] args) {
        CircularLsit list=new CircularLsit();
        list.insertAtFirst(40);
        list.insertAtFirst(20);
        list.insertAtEnd(50);
        list.insertAtposition(10,2);
        list.deleteAtFirst();
        list.deleteAtEnd();
        list.deleteAtPos(40);
        System.out.println(list.size);
        list.display();

    }
}
class Nodes{
    int data;
    Nodes next;

    Nodes(int data){
        this.data=data;
        this.next=null;
    }
}
class CircularLsit{
    Nodes head;
    int size=0;
    void insertAtFirst(int data){
        Nodes node=new Nodes(data);
        if(head==null){
            head=node;
            node.next=head;
            size++;
            return;
        }
        Nodes temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=node;
        node.next=head;
        head=node;
        size++;
    }
    void insertAtEnd(int data){
        Nodes node=new Nodes(data);
        if(head==null){
            head=node;
            node.next=head;
            size++;
            return;
        }
        Nodes temp=head;
        while (temp.next!=head){
           temp=temp.next;
        }
        temp.next=node;
        node.next=head;
        size++;

    }
    void insertAtposition(int data,int pos){
        Nodes node = new Nodes(data);
        if(head==null){
            head=node;
            node.next=head;
            size++;
            return;
        }
        if(pos==1){
            insertAtFirst(data);
            return;
        }
        Nodes temp=head;
        int i=1;
        while(temp.next!=head && i<pos-1){
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    void deleteAtFirst(){
        if(head==null)return;
        if(head.next==null){
            head=null;
            size--;
            return;
        }Nodes temp=head;
        while (temp.next!=head)temp=temp.next;
        head=head.next;
        temp.next=head;
        size--;
    }
    void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Nodes temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
        size--;
    }
    void deleteAtPos(int val){
        if(head==null)return;
        Nodes temp =head;
        if(head.data==val){
            deleteAtFirst();
            return;
        }
        while (temp.next.data!=val && temp.next !=head)temp=temp.next;
          if(temp.next==head){
              System.out.println("val not found");return;
          }
        temp.next=temp.next.next;
        size--;
    }
    void display(){
        Nodes temp=head;
        if(head==null)return;
        do {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("null");

    }
}