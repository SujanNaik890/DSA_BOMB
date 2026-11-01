public class argstraversal {
//    String[] args={"1","2","3"};
//    public static void main(String[] args) {
//        System.out.println("Number of Arguments"+args.length);
//        for(int i=0;i<args.length;i++){
//            System.out.println(args[i]);
//        }
//    }



    String[] values = {"1", "2", "3"};

    public static void main(String[] args) {

        argstraversal obj = new argstraversal();

        System.out.println("Number of Arguments: " + obj.values.length);

        for (int i = 0; i < obj.values.length; i++) {
            System.out.println(obj.values[i]);
        }
    }
}
