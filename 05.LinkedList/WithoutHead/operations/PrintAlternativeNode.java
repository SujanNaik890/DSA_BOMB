public class PrintAlternativeNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 21, 30, 45, 50});
        countNodes(list);
    }

    static void countNodes(LinkedList list) {

        Noode temp = list.head;
        int count = 0;

        while (temp != null) {
            if (count % 2 == 0) System.out.print(temp.data+"->");
            temp = temp.next;
            count++;
        }
        System.out.println("null");
    }
}
