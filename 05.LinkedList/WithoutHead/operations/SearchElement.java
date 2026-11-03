public class SearchElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[]{10, 20, 30, 40, 50});
        System.out.println(SearchEle(list,70));
    }
     static String SearchEle(LinkedList list,int val){
        Noode temp=list.head;
         while (temp != null) {
             if (temp.data == val)
                 return "Element Found";

             temp = temp.next;
         }
        return "Element Not Found";
    }
}
