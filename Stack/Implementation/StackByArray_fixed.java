import java.util.Optional;

class stackArray{
    private int[] arr;
    private int top;

    stackArray(int size){
        arr=new int[size];
        this.top=-1;
    }

    public void push(int data){
        if(top==arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=data;
    }

    int pop(){
        if(top==-1){
            System.out.println("stack Underflow");
            return 0;
        }
        return arr[top--];
    }

    int peek(){
        if(top==-1){
            System.out.println("stack Underflow");
            return 0;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
     void dispaly(){
         if(top==-1){
             System.out.println("stack Underflow");
             return;
         }
         for(int i=top;i>=0;i--){
             System.out.println(arr[i]+"\t");
         }
     }
}
public class StackByArray_fixed {
    public static void main(String[] args) {
        stackArray st=new stackArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       st.dispaly();
       System.out.println(st.pop());
    }
}
