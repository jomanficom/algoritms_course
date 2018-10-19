package test;

import com.company.structures.QueueFixedArray;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testQueueArray  extends TestCase {
    private QueueFixedArray queue = new QueueFixedArray();


    public void testEnequeue(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        int [] expected = {4, 3, 2, 1};
        System.out.println(Arrays.toString(queue.getQueue()));

        Assert.assertArrayEquals(expected, queue.getQueue());
    }

    public void testDequeue(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        int n = queue.dequeue();
        Assert.assertEquals(n, 1);
        int [] expected = {4, 3, 2};
        Assert.assertArrayEquals(expected, queue.getQueue());
    }

    public void testPeek(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        int n = queue.peek();
        Assert.assertEquals(n, 1);
        int [] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, queue.getQueue());
    }

    public void testCount(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        Assert.assertEquals(queue.count(),4);
    }


}
