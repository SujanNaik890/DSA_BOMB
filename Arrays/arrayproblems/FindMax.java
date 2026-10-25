public class FindMax {
    public static void main(String[] args) {
        int[] num={8,2,4,5,6,7};
        int max=0;
        for(int i :num){
            if(i>max)max=i;
        }
        System.out.println(max);
    }
}
