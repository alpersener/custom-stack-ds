package StackAndQueue.Stack;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        CustomStack stack=new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(18);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        ///////

        DynamicStack stack2=new DynamicStack(5);
        stack2.push(34);
        stack2.push(45);
        stack2.push(2);
        stack2.push(9);
        stack2.push(18);
        stack2.push(89);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

    }
}
