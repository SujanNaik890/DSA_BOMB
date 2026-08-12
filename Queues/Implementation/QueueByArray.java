public class QueueByArray {
    private int[] queue;
    private int front;
    private int rear;

    QueueByArray(int size){
        queue=new int[size];
        this.front=0;
        this.rear=-1;
    }

    void enQueue(int data){
        if(rear==queue.length-1){
            System.out.println("Queue OverFlow");
            return;
        }
        queue[++rear]=data;
    }

    void display(){
        if(rear<front){
            System.out.println("Queue UnderFlow");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    int deQueue(){
        if(rear<front){
            System.out.println("Queue UnderFlow");
            return -1;
        }
        return queue[front++];
    }

    int peek(){
        if(rear<front){
            System.out.println("Oueue Underflow");
            return -1;
        }
        return queue[front];
    }
    boolean isEmpty(){
        return rear<front;
    }

    public static void main(String[] args) {
        QueueByArray q=new QueueByArray(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.display();
    }
}
