public class SecondLargest {
    public static void main(String[] args) {
        int[] num={2,3,4,8,7,6,9};
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i:num){
            if(i>largest){
                second=largest;
                largest=i;
            }else if(i>second && i!=largest)second=i;
        }
        System.out.println(second);
    }
}
