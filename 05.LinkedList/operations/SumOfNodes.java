public class SumOfNodes {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 20, 30, 40, 50});
        System.out.println(Sumofnodes(list));
        list.display();
    }
    static  int Sumofnodes(LinkedList list){
        Noode temp=list.head;
        int sum=0;
        while (temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        return sum;
    }
}
