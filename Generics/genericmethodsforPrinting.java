package Generics;

public class genericmethodsforPrinting {
     <T> void genericprint(T t){
        System.out.println(t);
    }
    public static void main(String[] args){
        genericmethodsforPrinting generics=new genericmethodsforPrinting();
        generics.genericprint(101);
    }
}
