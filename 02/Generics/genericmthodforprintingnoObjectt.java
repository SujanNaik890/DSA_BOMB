package Generics;

public class genericmthodforprintingnoObjectt {
    static <T> void  genericsprint(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        genericmthodforprintingnoObjectt generics=new genericmthodforprintingnoObjectt();
        generics.genericsprint(101);
        generics.genericsprint("sujan");
    }
}
