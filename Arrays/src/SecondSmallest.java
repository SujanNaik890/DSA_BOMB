public class SecondSmallest {
    public static void main(String[] args) {
        int[] num={2,3,4,8,7,6,9};
        int smallest=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i:num){
            if(i<smallest){
                second=smallest;
                smallest=i;
            }else if(i<second && i!=smallest)second=i;
        }
        System.out.println(second);
    }
}
