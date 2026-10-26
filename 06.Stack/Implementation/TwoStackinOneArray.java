class DoubleStack{
    private int[] arr;
    private int top1;
    private int top2;


    DoubleStack(int size){
        arr=new int[size];
        this.top1=-1;
        this.top2=size;
    }
    void push1(int data){
        if(top1+1==top2){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top1]=data;
    }
    void push2(int data){
        if(top1+1==top2){
            System.out.println("Stack Overflow");
            return;
        }
        arr[--top2]=data;
    }
    int pop1(){
        if(top1== -1){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return arr[top1--];
    }
    int pop2(){
        if(top2== arr.length){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return arr[top2--];
    }
    int peek1() {

        if (top1 == -1) {
            return -1;
        }

        return arr[top1];
    }
    int peek2() {

        if (top2 == arr.length) {
            return -1;
        }

        return arr[top2];
    }
}
public class TwoStackinOneArray {
    public static void main(String[] args) {
        DoubleStack ds=new DoubleStack(5);
        ds.push1(10);
        ds.push2(20);
        ds.push1(30);
        ds.push2(40);
        System.out.println(ds.pop1()+" "+ds.pop2());
    }
}
