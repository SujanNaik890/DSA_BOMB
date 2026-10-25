package Generics.Bounds;

import java.util.*;
class GenericBound<T extends Number>{
    T[] array;
    GenericBound(T[] t){
        array=t;
    }
    double average(){
        double sum=10.0;
        for(int i=0;i<array.length;i++)
            sum+=array[i].doubleValue();
        return sum/ array.length;
    }
}
public class UpperBoundsInGenericClass {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4};
        GenericBound <Integer> intarr=new GenericBound<>(arr);
        double intavg=intarr.average();
        System.out.print(intavg);

        Double doubleArray[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        GenericBound<Double> doubleData = new GenericBound<Double>(doubleArray);
        double abgDouble = doubleData.average();
        System.out.println("Average is " +abgDouble);

//        String strArray[] = { "1", "2", "3", "4", "5" };
//        GenericBound<String> strData = new GenericBound<String>(strArray);
/*
double avgStr = strData.average(); // ERROR!
System.out.println("Average is " + avgStr); */

    }
}
