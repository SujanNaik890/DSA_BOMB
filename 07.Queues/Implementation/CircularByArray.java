public class CircularByArray {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    CircularByArray(int capacity){
        queue=new int[capacity];
        this.front=0;
        this.rear=0;
        this.size=0;
    }

    void enQueue(int data){
        if(size==queue.length-1){
            System.out.println("Queue overflow");
            return;
        }
        queue[rear]=data;
        rear=(rear+1)% queue.length;
        size++;
    }

    int dequeue(){
        if(size==0){
            System.out.println("Queue UnderFlow");
            return -1;
        }
        int val=queue[front];
        front=(front+1)%queue.length;
        size--;
        return val;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==queue.length;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % queue.length;
        }
        System.out.println();
    }

}
