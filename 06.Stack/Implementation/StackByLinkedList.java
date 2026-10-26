class Linkedstack{
    private class node{
       int data;
       node next;

       node(int data){
           this.data=data;
           this.next=null;
       }
    }
    private node top;

    void push(int data){
        node newnode=new node(data);

        newnode.next=top;
        top=newnode;
    }
    int  pop(){
        if(top==null){
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
   int peek(){
        if(top==null){
            return -1;
        }
        return top.data;
    }
    void display(){
        node temp=top;
        while (temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class StackByLinkedList {
    public static void main(String[] args) {
        Linkedstack st=new Linkedstack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.pop());
    }
}
