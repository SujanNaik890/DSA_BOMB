public class countTheNodes {
    public int countNodes(LinkedList list) {

        Noode temp = list.head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

       return  count;
    }
}
