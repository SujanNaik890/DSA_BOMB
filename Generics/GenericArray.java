package Generics;

import java.util.Arrays;

class DefineGenericArray <T>{
    private T[] t;

    DefineGenericArray(T x[]){
        t=x;
    }
    void display(){
        System.out.println(Arrays.toString(t));
    }
}
public class GenericArray {
    public static void main(String args []) {
//        int[] arr={1,23,4.5}; wrong it is
//        Primitive array: int[] can’t be passed where T[] is expected, because
//        generics only work with reference types. Use Integer[] instead.
        Integer[] arr={1,2,3,4};
        DefineGenericArray <Integer> intarr =new DefineGenericArray<Integer>(arr);
    }
}
