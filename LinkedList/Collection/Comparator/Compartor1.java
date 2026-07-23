package Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Compartor1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,9,5,6,7));
        System.out.println(list);
        Collections.sort(list, (a, b) -> a - b);
        System.out.println(list);
        Collections.sort(list, (a,b)->b-a);
        System.out.println(list);
    }
}
