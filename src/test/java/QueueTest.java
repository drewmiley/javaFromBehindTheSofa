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
    public void testHasInsertMethod() {
        Queue queue = new Queue();
        queue.insert();
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

}