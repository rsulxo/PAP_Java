import java.util.*;

public class StackOfIntegers {

    public static void main(String[] args) {

        Stack<Integer> newStack = new Stack<Integer>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);

        System.out.println("Complete Stack " + newStack);

        System.out.println("The second element from the top of the stack is: " + secondFromTop(newStack));

        System.out.println("Reversed Stack " + reverseStack(newStack));
    }

    // takes a stack of integers as argument and returns the second item from the top of the stack,
    // without permanently changing the stack
    public static int secondFromTop(Stack<Integer> stack1) {
        int first = stack1.pop();
        int second = stack1.pop();

        stack1.push(second);
        stack1.push(first);

        return second;
    }

    // takes a stack of integers as argument and returns a reversed stack
    public static Stack<Integer> reverseStack(Stack<Integer> reversedStack) {
        Collections.reverse(reversedStack);
        return reversedStack;
    }



}
