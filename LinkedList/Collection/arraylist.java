import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>( Arrays.asList(1,2,3));
        System.out.println(list1);
        List<Integer> list2=new ArrayList<>(10);
        list2.add(20);
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3,4));

//        a.addAll(b);//[1,2,3,4]
        a.addAll(1,b);//[1,3,4,2]
    System.out.println(a);
//        remove(Object)
        list2.remove(Integer.valueOf(10));
//        Important
        list2.remove(1);
//        removes index 1.
        list2.remove(Integer.valueOf(1));
//        removes value 1.
//        Keeps only common elements.
        a.retainAll(b);
//        a=[1,2,3]
//        b=[2,3,4]
//          [2,3]
        list2.clear();
//        clears all element
        list1.contains(2); //true
        list1.indexOf(3);  //3
        list1.lastIndexOf(3);
//        Useful when duplicates exist.
        list2.isEmpty();
        list1.size();
//        Sorting
//        Ascending
        Collections.sort(list1);
        Collections.sort(list1,Collections.reverseOrder());
//        decending
        Collections.sort(list2,(c,d)->c-d);
//        costum comparator
        Collections.reverse(list1);//reverse
        Collections.shuffle(list1);//suflle
        Collections.swap(list1,0,3);//swapping
        System.out.println(Collections.frequency(list1,2));//frequency check
        Collections.max(list1);
        Collections.min(list1);
        Collections.fill(list1,5);
//        Before
//                [1,2,3]
//        After
//                [5,5,5]
//        Binary Search
//        (List must be sorted.)
        Collections.binarySearch(list1,20);
//        Replace every 5 with 10.
        Collections.replaceAll(list1,5,10);
        ArrayList<Integer> src=new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> dest=new ArrayList<>(Arrays.asList(0,0));
        Collections.copy(dest,src);
//        Destination should already have enough size.
        Collections.rotate(list1,2);
        Integer arr[]=list1.toArray(new Integer[0]); //Convert to Array
        ArrayList<Integer> copy=(ArrayList<Integer>)list1.clone(); //clone
        list1.ensureCapacity(100);
        list1.trimToSize();
        Iterator<Integer> it=list1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<Integer> it1=list1.listIterator();
        it1.next();
        it1.previous();
        list1.forEach(System.out::println);
        list1.removeIf(x->x%2==0);
        list1.replaceAll(x->x*2);
        a.containsAll(b);
        a.equals(b);
        List<Integer> part=list1.subList(2,5); //sub  List
    // Array -> ArrayList
         Integer arer[]={1,2,3};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arer));

        Integer arrayr[]=list.toArray(new Integer[0]);//List ->Array

    }
}
