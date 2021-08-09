package stack.and.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PseudoQueueTest {

    @Test
    public void testEnqueue(){

        pseudoqueue test = new pseudoqueue();
        test.enQueue(7);
        test.enQueue(6);
        test.enQueue(5);
        test.enQueue(4);
        Object expected = 4;
        Object actual = test.stackOne.top.value;
        assertEquals(expected, actual);

    }
    @Test
    public void testDequeue(){
        pseudoqueue test = new pseudoqueue();
        test.enQueue(7);
        test.enQueue(6);
        test.enQueue(5);
        test.enQueue(4);
        Object expected1 = 7;
        Object actual1 = test.stackTwo;
        assertEquals(expected1, actual1);
    }


}
