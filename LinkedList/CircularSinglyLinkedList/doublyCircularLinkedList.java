public class doublyCircularLinkedList {
    public static void main(String[] args) {
    doublyCircularLinkedList list=new doublyCircularLinkedList();
    list.insertAtFirst(30);
    list.insertAtEnd(40);
    list.insertAtpos(10,2);
    list.deleteAtFirst();
    list.deleteAtPos(10);
    list.display();
    System.out.println(list.size);
    }
    Node head=null;
    class Node {
        int data;
        Node prev;
        Node next;

        Node ( int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    int size=0;
    void insertAtFirst(int data){
        Node node =new Node(data);

        if(head==null){
            head=node;
            node.next=head;
            node.prev=head;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=head)temp=temp.next;
        node.next=head;
        node.prev=temp;
        head.prev=node;
        temp.next=node;
        head=node;
        size++;
    }
    void insertAtpos(int data,int pos){
        Node node =new Node(data);
        if(head==null){
            head=node;
            node.next=head;
            node.prev=head;
            size++;
            return;
        }
        Node temp =head;
        for(int i=1;i<pos-1 && temp.next!=head;i++)temp=temp.next;
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
        size++;
    }
    void insertAtEnd(int data){
       Node node =new Node(data);
        if(head==null){
            head=node;
            node.next=head;
            node.prev=head;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=head)temp=temp.next;
        node.next=temp.next;
        node.prev=temp;
        head.prev=node;
        temp.next=node;
        size++;
    }
    void deleteAtFirst() {
        if(head==null)return;
        if(head.next==head){
            head=null;size--;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head.next.prev=temp;
        head=head.next;
        size--;
    }
    void deleteAtPos(int val) {
        if (head == null) return;
        if (head.data == val) {
            deleteAtFirst();
            return;
        }
        Node temp = head;
        while (temp.next.data != val){ temp = temp.next;
            if (temp.next == head) {
                System.out.println("val not found");
                return;
            }
        }
        Node curr=temp.next;
        temp.next=curr.next;
        curr.next.prev=temp;
        size--;
    }
    void display(){
        if(head==null){
            return;
        }Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("null");
        Node temp2=head;
        do{
            temp2=temp2.prev;
            System.out.print(temp2.data+"->");
        }while(temp2!=head);
        System.out.println("null");
    }
}
