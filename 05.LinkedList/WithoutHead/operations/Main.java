public class Main {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.display();
        countTheNodes obj = new countTheNodes();

        System.out.println(obj.countNodes(list));
    }
}