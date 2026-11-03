public class FindMin {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 20, 30, 40, 50});
        System.out.println(Findmin(list));
    }
    static int Findmin(LinkedList list){
        int min=Integer.MAX_VALUE;
        Noode temp=list.head;
        while(temp!=null){
            if(min>temp.data)min=temp.data;
            temp=temp.next;
        }
        return min;
    }
}
