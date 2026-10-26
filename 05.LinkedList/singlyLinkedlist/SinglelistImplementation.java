
public class SinglelistImplementation {
    public static void main(String[] args) {
  SinglelistImplementation list=new SinglelistImplementation();
  list.insertAtFirst(10);
  list.insertAtFirst(20);

  list.insertAtFirst(30);list.insertAtEnd(100);
  list.insertAtposition(80,3);
//  list.Search(100);
//  list.display();
//  list.deleteAtEnd();
//  list.deleteAtFirst();
//  list.deleteAtPosition(10);
  list.display();
    }

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    int size=0;
    void insertAtFirst(int data){
        node newnode =new node(data);
        if(head==null){
            head=newnode;
            size++;
        return;
        }
        newnode.next=head;
        head=newnode;
        size++;
    }
    void display(){
        node temp=head;
        if(head==null)return;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void insertAtEnd(int data){
        if(head==null){insertAtFirst(data);return ;}
        node newnode=new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        size++;
        temp.next=newnode;
    }
    void insertAtposition(int data,int pos){
        if(pos <0)return;
        if(pos==1){
            insertAtFirst(data);
            return;
        }
        node temp=head;
        int i=1;
        node newnode=new node(data);
        while(temp.next!=null && i<pos-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
}