package Comparator;
import java.util.*;

public class Comparator3 {
    public static void main(String[] args) {
        //sort by String length
                ArrayList<String> list =
                        new ArrayList<>();

                list.add("banana");
                list.add("cat");
                list.add("apple");
                list.add("hi");

                Collections.sort(list,
                        (a,b)->a.length()-b.length());

                System.out.println(list);

                Collections.sort(list,
                        (a,b)->b.length()-a.length());

                System.out.println(list);
    }
}
