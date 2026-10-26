class StackArray{
    private int[] arr;
    private int top;

    StackArray(int size){
        arr=new int[size];
        this.top=-1;
    }

    void resize(){
        int newsize=arr.length*2;
        int[] newarr=new int[newsize];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        arr=newarr;
    }
    public void push(int data){
        if(top==arr.length-1){
            resize();
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
public class StackByArray_dynamic {
    public static void main(String[] args) {
        StackArray st=new StackArray(2);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.dispaly();
        System.out.println(st.pop());
    }
}
