public class PrintNodeAtOddPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 21, 30, 45, 50});
        countNodes(list);
    }

    static void countNodes(LinkedList list) {

        Noode temp = list.head;
        int count = 0;

        while (temp != null) {
            if (temp.data % 2 != 0) System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");



    }
}
