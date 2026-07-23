package Comparator;
import java.util.*;
class Student{

    int marks;

    String name;

    Student(int marks,String name){

        this.marks=marks;

        this.name=name;

    }

    @Override
    public String toString(){

        return name+" "+marks;

    }

}
public class Comparator5 {

        public static void main(String[] args) {

            ArrayList<Student> list =
                    new ArrayList<>();

            list.add(new Student(90,"Rahul"));
            list.add(new Student(75,"Ankit"));
            list.add(new Student(80,"Raj"));

            Collections.sort(list,

                    (a,b)->a.marks-b.marks

            );//Sort by marks Ascending
            System.out.println(list);
            Collections.sort(list,

                    (a,b)->b.marks-a.marks

            );// Sort by marks Descending
            System.out.println(list);

            Collections.sort(list,

                    (a,b)->a.name.compareTo(b.name)

            );//Sorting by nameS
            System.out.println(list);

            Collections.sort(list,(a,b)->{

                if(a.marks!=b.marks){

                    return b.marks-a.marks;

                }

                return a.name.compareTo(b.name);

            });// sort with Multiple Condition
            System.out.println(list);
        }


}
