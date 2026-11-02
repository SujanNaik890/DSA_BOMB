public class SumOfnaturalNumber {
    public static void main(String[] args) {
        int sum=sum_n(5);
        System.out.println(sum);
    }
    static int sum_n(int n){
        if(n==1)return 1;
        return n+sum_n(n-1);
    }
}
