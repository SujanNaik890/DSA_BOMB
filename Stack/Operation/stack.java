import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        System.out.println(stack.search(10));
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.capacity());
        System.out.println(stack.size());
    }
}
