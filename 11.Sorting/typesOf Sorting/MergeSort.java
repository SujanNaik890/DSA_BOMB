import java.util.Arrays;

public class MergeSort {
  static  void mergesort(int[]arr,int start ,int end){
        if(start<end){
            int mid=start +(end-start)/2;

            mergesort(arr,start,mid);

            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int[] arr,int start ,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<= end){
            if(arr[i] <= arr[j]){
                temp[k]=arr[k];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }while (i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(i=start,k=0;i<=end;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        int[] arr={5,3,4,2,6,1,8};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
