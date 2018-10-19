package test;

import com.company.structures.SingleLinkedList;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class testSingleLinkedList extends TestCase {

    private SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();

    public void testPeek(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        int n = linkedList.peek(0);
        Assert.assertEquals(n,1);
    }

    public void testAddInEnd(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
    }

    public void testAsArrayList(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        Assert.assertEquals(expected, linkedList.asArrayList());
    }

    public void testAddByIndex(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.add(2, 456);

        List<Integer> expected =  Arrays.asList(1, 2, 456, 3, 4);
        Assert.assertEquals(expected, linkedList.asArrayList());

    }

    public void testRemoveFirst(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.removeFirst();

        List<Integer> expected = Arrays.asList(2, 3, 4);
        Assert.assertEquals(expected, linkedList.asArrayList());

    }

    public void testRemoveLast(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.removeLast();

        List<Integer> expected = Arrays.asList(1, 2, 3);
        Assert.assertEquals(expected, linkedList.asArrayList());
    }

    public void testRemoveByIndex(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.remove(1);

        List<Integer> expected = Arrays.asList(1, 3, 4);
        Assert.assertEquals(expected, linkedList.asArrayList());
    }


}
