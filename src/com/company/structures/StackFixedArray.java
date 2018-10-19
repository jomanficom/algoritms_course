package com.company.structures;

import java.util.Arrays;

public class StackFixedArray {
    private int size = 5;
    private int fill = 0;
    private int [] stack = new int[size];

    public void push(int n){
        if (fill < stack.length){
            addElement(n);
        } else {
            size = size*2;
            stack = Arrays.copyOf(stack,2*stack.length);
            addElement(n);
        }
    }

    private void addElement(int n) {
        stack[fill] = n;
        fill++;
    }

    ;
    public int pop(){
        if (stack.length == 0){
            //todo trow exeption
            return 0;
        }else {
            int n = peek();
            stack[fill - 1] = 0;
            fill--;

            if (stack.length > 2*fill){
                stack = Arrays.copyOf(stack, stack.length/2);
            }
            return n;
        }

    };
    public int peek(){
        return stack[fill - 1];
    };
    public int count(){
        return fill;
    };

    public int[] getStack() {
        return stack;
    }
}
