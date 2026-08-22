package Searching;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=4;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k){
                System.out.println("Key Element found at index "+i);
            }
        }

    }
}
