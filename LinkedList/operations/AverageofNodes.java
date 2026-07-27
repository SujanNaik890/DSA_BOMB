public class AverageofNodes {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 20, 30, 40, 50});
        System.out.println(Average(list));
    }
    static int Average(LinkedList list){
        int sum=0;
        Noode temp=list.head;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        return sum/list.size;
    }
}
