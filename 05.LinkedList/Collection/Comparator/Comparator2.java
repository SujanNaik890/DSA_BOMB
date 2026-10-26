package Comparator;
import java.util.*;
public class Comparator2 {
    public static void main(String[] args) {

            ArrayList<String> list =
                    new ArrayList<>();

            list.add("Dog");
            list.add("Apple");
            list.add("Cat");

            System.out.println(list);

            Collections.sort(list,
                    (a,b)->a.compareTo(b));

            System.out.println(list);

            Collections.sort(list,
                (a,b)->b.compareTo(a));

            System.out.println(list);
    }
}
