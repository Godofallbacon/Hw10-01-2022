import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //If you make the stack a list then you must replace the push with an add so it can pull from the list
        //if you want to push something into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //If you want to figure out whats at the top of the stack
        System.out.println(stack.peek());
        System.out.println(stack.size());
        //removed from the stack and went down the stack
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());


    }
}
