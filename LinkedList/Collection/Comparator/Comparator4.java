package Comparator;
   import java.util.*;

public class Comparator4 {
    public static void main(String[] args) {
        //Sort by String LASt Character
            ArrayList<String> list =
                    new ArrayList<>();
            list.add("apple");
            list.add("dog");
            list.add("cat");
            list.add("banana");
            Collections.sort(list,(a,b)->
                    Character.compare(a.charAt(a.length()-1), b.charAt(b.length()-1)));
            System.out.println(list);

        }


}
