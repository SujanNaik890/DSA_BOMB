package Generics;

import java.util.Arrays;

class DefineGenericArray <T>{
    private T[] t;

    DefineGenericArray(T t[]){
        this.t=t;
    }
    void display(){
        System.out.println(Arrays.toString(t));
    }

    void reverseArray(){
        int front=0,end=t.length-1;

        while(front<end){
            T temp=t[front];
            t[front]=t[end];
            t[end]=temp;
            front++;
            end--;
        }
    }
}
public class GenericArray {
    public static void main(String args []) {
//        int[] arr={1,23,4.5}; wrong it is
//        Primitive array: int[] can’t be passed where T[] is expected, because
//        generics only work with reference types. Use Integer[] instead.
        Integer[] arr={1,2,3,4};
        DefineGenericArray <Integer> intarr =new DefineGenericArray<Integer>(arr);
        intarr.display();
        intarr.reverseArray();
        intarr.display();
        String[] str={"hello","sujan","naik"};
        DefineGenericArray<String> strarr=new DefineGenericArray<String>(str);
        strarr.display();
        strarr.reverseArray();
        strarr.display();

    }
}
