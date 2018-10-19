package test;

import com.company.structures.StackFixedArray;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testStackArray extends TestCase {

    private StackFixedArray stack = new StackFixedArray();


    public void testPush(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(Arrays.toString(stack.getStack()));

        int [] expected = {1, 2, 3,5, 6, 7, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, stack.getStack());
    }

    public void testPop(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(Arrays.toString(stack.getStack()));

        int n =stack.pop();
        System.out.println("pop: "+n);

        Assert.assertEquals(n, 7);

        int [] expected = {1, 2, 3,5, 6, 0, 0, 0, 0, 0};

        Assert.assertArrayEquals(expected, stack.getStack());

        System.out.println(Arrays.toString(stack.getStack()));

    }

    public void testPeek(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(Arrays.toString(stack.getStack()));

        int n =stack.peek();
        System.out.println("peek: "+ n);

        System.out.println(Arrays.toString(stack.getStack()));

    }
}
