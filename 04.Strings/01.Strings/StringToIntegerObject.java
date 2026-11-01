public class StringToIntegerObject {
    public static void main(String[] args) {
        String s = "123";
        Integer n = Integer.valueOf(s);

        System.out.println(n);
        System.out.println(n.getClass().getSimpleName());
    }
}
