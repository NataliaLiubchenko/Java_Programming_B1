package day42_collection;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);
        //get element from the top of the list
        System.out.println("Top of the stack: "+stack.peek());
        //remove the element at the top
        stack.pop();
        System.out.println(stack);
        System.out.println("Top of the stack: "+stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top of the stack: "+stack.peek());
        stack.push('z');
        System.out.println("Top of the stack: "+stack.peek());
        stack.remove(0);
        System.out.println(stack);
    }
}
