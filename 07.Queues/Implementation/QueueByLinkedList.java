public class QueueByLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node front;
    private Node rear;

    void enQueue(int data){
        Node node =new Node(data);
        if(rear==null){
            front=rear=node;
            return;
        }
        rear.next=node;
        rear=node;
    }
    int deQueue(){
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    int peek() {

        if (front == null) {
            return -1;
        }

        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    void display() {

        Node temp = front;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
       QueueByLinkedList q=new QueueByLinkedList();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.display();

        System.out.println("Removed: " + q.deQueue());

        q.display();
    }
}
