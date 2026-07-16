public class CheckIfSorted {
    public static void main(String[] args) {
        int[] num={8,2,4,5,6,7};
        int nums[]={3,4,5,6,7};
        System.out.println(isSorted(num)+"\n"+isSorted(nums));
    }
    public static boolean isSorted(int[] arr){

        for(int i=1;i<arr.length;i++){

            if(arr[i]<arr[i-1])
                return false;

        }

        return true;

    }
}
