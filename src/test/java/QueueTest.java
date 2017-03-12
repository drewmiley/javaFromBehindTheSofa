import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHasInsertMethodWithIntArgument() {
        Queue queue = new Queue();
        queue.insert(1);
    }

    @Test
    public void testHasRemoveMethod() {
        Queue queue = new Queue();
        queue.remove();
    }

    @Test
    public void testHasExamineMethod() {
        Queue queue = new Queue();
        queue.examine();
    }

    @Test
    public void testRemoveMethodReturnsInt() {
        Queue queue = new Queue();
        int value = queue.remove();
    }

    @Test
    public void testExamineMethodReturnsInt() {
        Queue queue = new Queue();
        int value = queue.examine();
    }

    @Test
    public void testInsertMethodAddsIntToQueue() throws Exception {
        Queue queue = new Queue();
        queue.insert(1);
        int value = queue.examine();
        assertEquals(1, value, 0);

        queue.insert(2);
        value = queue.examine();
        assertEquals(2, value, 0);

        queue.insert(3);
        value = queue.examine();
        assertEquals(3, value, 0);
    }

    @Test
    public void testRemoveMethodRemovesIntFromQueue() throws Exception {
        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);
        int value = queue.examine();
        assertEquals(2, value, 0);
        queue.remove();
        value = queue.examine();
        assertEquals(1, value, 0);

        queue.insert(3);
        queue.insert(4);
        value = queue.examine();
        assertEquals(4, value, 0);
        queue.remove();
        value = queue.examine();
        assertEquals(3, value, 0);
    }

    @Test
    public void testRemoveMethodReturnsQueuedInt() throws Exception {
        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);
        int value = queue.remove();
        assertEquals(2, value, 0);

        queue.insert(3);
        queue.insert(4);
        value = queue.remove();
        assertEquals(4, value, 0);
    }

    @Test
    public void testExamineMethodReturnsQueuedInt() throws Exception {
        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);
        int value = queue.examine();
        assertEquals(2, value, 0);

        queue.insert(3);
        queue.insert(4);
        value = queue.examine();
        assertEquals(4, value, 0);
    }

    @Test
    public void testExamineMethodDoesNotRemoveIntFromQueue() throws Exception {
        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);
        int value = queue.examine();
        assertEquals(2, value, 0);
        value = queue.examine();
        assertEquals(2, value, 0);

        queue.insert(3);
        queue.insert(4);
        value = queue.examine();
        assertEquals(4, value, 0);
        value = queue.examine();
        assertEquals(4, value, 0);
    }

}