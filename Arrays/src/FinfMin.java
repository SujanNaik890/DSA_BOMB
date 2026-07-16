public class FinfMin {
    public static void main(String[] args) {
        int[] num={8,2,4,5,6,7};
        int min=Integer.MAX_VALUE;
        for(int i:num){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
}
