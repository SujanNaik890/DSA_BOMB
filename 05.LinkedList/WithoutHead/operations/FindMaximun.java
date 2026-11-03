public class FindMaximun {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 20, 30, 40, 50});
        System.out.println(Findmax(list));
    }
    static int Findmax(LinkedList list){
        int max=Integer.MIN_VALUE;
        Noode temp=list.head;
        while(temp!=null){
            if(max<temp.data)max=temp.data;
            temp=temp.next;
        }
        return max;
    }
}
