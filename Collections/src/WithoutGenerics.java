import java.util.ArrayList;

public class WithoutGenerics {
//    Without generics, a collection can contain different types
//    of objects, and explicit casting may be
//    required when retrieving values.
public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add(10);
    list.add("Java");

    int n = (int) list.get(0);
    System.out.println(n);

    String s=(String) list.get(1);
    System.out.println(s);
}
}
