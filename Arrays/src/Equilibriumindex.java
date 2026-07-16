public class Equilibriumindex {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int total=0;

        for(int num:arr)
            total+=num;

        int left=0;

        for(int i=0;i<arr.length;i++){

            total-=arr[i];

            if(left==total){

                System.out.println(i);
                break;

            }

            left+=arr[i];

        }
//        System.out.println("Not Have Equilibrium index");
   }
}
