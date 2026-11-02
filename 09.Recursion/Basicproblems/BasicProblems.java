public class BasicProblems {
    public static void main(String[] args) {
        rec();
    }
    static void rec(){
        System.out.println("Hello World");
        rec1();
    }
    static void rec1(){
        System.out.println("Hello World");
        rec2();
    }
    static void rec2(){
        System.out.println("Hello World");
        rec3();
    }
    static void rec3(){
        System.out.println("Hello World");
    }
}
