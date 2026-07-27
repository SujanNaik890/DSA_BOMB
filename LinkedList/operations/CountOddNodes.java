public class CountOddNodes {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{11, 20, 31, 40, 50});
        System.out.println(countNodes(list));
    }
static int countNodes(LinkedList list) {

        Noode temp = list.head;
        int count = 0;

        while (temp != null) {
            if(temp.data%2!=0) count++;
            temp = temp.next;
        }

        return  count;
    }
}
