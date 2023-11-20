package StackAndQueue.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        //default initialize
        Stack stack1=new Stack();

        //initialize with generics
        stack1.push(4);
        stack1.push(2.2);
        stack1.push("alper");

        Stack<String> stack2=new Stack<>();

        stack2.push("abc");
        stack2.push("den");
        stack2.push("alper");
        stack2.push("x");




        System.out.println("-------------------------");

        System.out.println(stack1);
        System.out.println(stack2);

        System.out.println("-------------------------");

        //peek ile en üstteki değeri alma(silmez sadece değer alınabilir)
        System.out.println("stack1 en üstteki değer:"+stack1.peek());
        System.out.println("stack2 en üstteki değer:"+stack2.peek());


        System.out.println("-------------------------");


        //pop methodu ile stack'ın en üstündeki değeri silme
        stack1.push("silinecek");
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);

        System.out.println("-------------------------");

        //stack empty eğer doluysa false boşsa true
        System.out.println(stack1.empty());


        System.out.println("-------------------------");

        //search ile stack position bulma
        System.out.println(stack1.search("alper")+"-> en üstteki değer");
        System.out.println(stack1.search(4)+"-> en alttaki değer");
        System.out.print(stack2.search("abc")+
                "->"+stack2.search("den")+
                "->"+stack2.search("alper")+
                "->"+stack2.search("x"));

        System.out.println();
        System.out.println("-------------------------");

        Stack<Integer> number=new Stack<>();
        number.push(34);
        number.push(45);
        number.push(2);
        number.push(9);
        number.push(18);
        System.out.println(number);
        System.out.println(number.indexOf(34));
        System.out.println(number.search(34)+"xd");


        System.out.println("-------------------------");

        Deque<String> deque = new ArrayDeque<>();
        deque.push("Element 1");
        deque.push("Element 2");
        deque.push("Element 3");
        System.out.println("Stack Pop: " + deque.pop());
        deque.offer("Element 4");
        deque.offer("Element 5");
        deque.offer("Element 6");
        System.out.println("Queue Poll: " + deque.poll());
        System.out.println("Remaining elements in deque: " + deque);


    }
}



