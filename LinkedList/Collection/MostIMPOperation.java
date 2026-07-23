import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Arrays;
public class MostIMPOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        list1.addAll(list2);//Merge to lists
        System.out.println(list1);
//        list1 = [1,2,5]
//        list2 = [3,4]
//        [1,2,3,4,5]
//        Remove Duplicates
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,2,3,4,4));

        list = new ArrayList<>(new LinkedHashSet<>(list));
//        Keeps insertion order while removing duplicates.

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4));
//      Find the Commonn Elements
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3,4,5,6));

        a.retainAll(b);

        a.removeAll(b);//Find the difference
    }
}
