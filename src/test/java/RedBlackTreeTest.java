import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedBlackTreeTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHasConstructorWithIntArgument() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
    }

    @Test
    public void testHasInsertMethodWithIntArgument() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        redBlackTree.insert(1);
    }

    @Test
    public void testHasSearchMethodWithIntArgument() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        redBlackTree.search(1);
    }

    @Test
    public void testHasDeleteMethodWithIntArgument() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        redBlackTree.delete(1);
    }

    @Test
    public void testHasInsertMethodReturnsBoolean() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        boolean inserted = redBlackTree.insert(1);
    }

    @Test
    public void testHasSearchMethodReturnsNode() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        Node node = redBlackTree.search(1);
    }

    @Test
    public void testHasDeleteMethodReturnsBoolean() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        boolean deleted = redBlackTree.delete(1);
    }

}