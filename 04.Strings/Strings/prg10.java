public class prg10 {
    public static void main(String[] args) {
//        String result = String.join(delimeter="-", Elements="Java", "Python", "C++");
        String result = String.join("-", "Java", "Python", "C++");
        System.out.println(result);
        String res = String.join("Java", "Python", "C++");
        // here "Java " become the delimeter
        System.out.println(res);
    }
}
