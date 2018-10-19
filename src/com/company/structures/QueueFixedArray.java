package com.company.structures;

import java.util.Arrays;

public class QueueFixedArray {

    private int [] queue;

    public void enqueue(int n){

        if (queue == null){
            queue = new int[1];
            queue[0] = n;
        } else {
            queue = Arrays.copyOf(queue, queue.length + 1);
            addElInBegginning(n);
        }

    };
    public int dequeue(){

        if (queue.length == 0){
            //todo add exeption
            return 0;
        }else {
            int n = queue[queue.length - 1];
            queue = Arrays.copyOf(queue, queue.length - 1);
            return n;
        }

    };
    public int peek(){
        return queue[queue.length - 1];
    };
    public int count(){
        return queue.length;
    };

    private void addElInBegginning(int n) {
        for (int i = queue.length - 1; i > 0 ; i--) {
            queue[i] = queue[i - 1];
        }
        queue[0] = n;

    }

    public int[] getQueue() {
        return queue;
    }
}
