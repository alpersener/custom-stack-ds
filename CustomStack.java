package StackAndQueue.Stack;

import java.util.EmptyStackException;

public class CustomStack {
    //not dynamic stack
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr =-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];

    }

    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr==data.length-1; //ptr is at last index
    }

    public boolean isEmpty(){
        return ptr==-1;
    }


}
