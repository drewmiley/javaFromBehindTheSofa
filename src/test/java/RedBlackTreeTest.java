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
    public void testHasInsertMethodReturnsNode() {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        Node node = redBlackTree.insert(1);
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

    @Test
    public void testSearchMethodFindsRootNode() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        Node rootNode = redBlackTree.search(1);
        assertEquals(1, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(null, rootNode.getElderChild());
        assertEquals(null, rootNode.getYoungerChild());
    }

    @Test
    public void testSearchMethodReturnsNullIfIncorrectNodeValue() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        Node node = redBlackTree.search(2);
        assertEquals(null, node);
    }

    @Test
    public void testInsertMethodAddsNodeToRootNodeGreaterThan() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node insertedNode = redBlackTree.insert(20);
        assertEquals(20, insertedNode.getValue(), 0);
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(null, rootNode.getYoungerChild());
        assertEquals(20, rootNode.getElderChild().getValue());
    }

    @Test
    public void testInsertMethodAddsNodeToRootNodeLessThan() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node insertedNode = redBlackTree.insert(5);
        assertEquals(5, insertedNode.getValue(), 0);
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(5, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue());
        assertEquals(null, rootNode.getElderChild());
    }

    @Test
    public void testInsertMethodAddsNodesToRootNodeOneGreaterThanOneLessThanLessFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node youngerNode = redBlackTree.insert(5);
        assertEquals(5, youngerNode.getValue(), 0);
        assertEquals(null, youngerNode.getYoungerChild());
        assertEquals(null, youngerNode.getElderChild());

        Node elderNode = redBlackTree.insert(20);
        assertEquals(20, elderNode.getValue(), 0);
        assertEquals(null, elderNode.getYoungerChild());
        assertEquals(null, elderNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(null, rootNode.getYoungerChild());
        assertEquals(20, rootNode.getElderChild().getValue());
    }

    @Test
    public void testInsertMethodAddsNodesToRootNodeOneGreaterThanOneLessThanGreaterFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node elderNode = redBlackTree.insert(20);
        assertEquals(20, elderNode.getValue(), 0);
        assertEquals(null, elderNode.getYoungerChild());
        assertEquals(null, elderNode.getElderChild());

        Node youngerNode = redBlackTree.insert(5);
        assertEquals(5, youngerNode.getValue(), 0);
        assertEquals(null, youngerNode.getYoungerChild());
        assertEquals(null, youngerNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(null, rootNode.getYoungerChild());
        assertEquals(20, rootNode.getElderChild().getValue());
    }

    @Test
    public void testInsertMethodAddsNodesToRootNodeTwoGreaterThanLeastFirst() throws Exception {
        int youngestValue = 5;
        RedBlackTree redBlackTree = new RedBlackTree(youngestValue);

        Node middleNode = redBlackTree.insert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(null, middleNode.getElderChild());

        Node eldestNode = redBlackTree.insert(20);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());

        Node youngestNode = redBlackTree.search(youngestValue);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());

        middleNode = redBlackTree.search(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(true, middleNode.isBlack());
        assertEquals(5, middleNode.getYoungerChild().getValue(), 0);
        assertEquals(20, middleNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsNodesToRootNodeTwoGreaterThanGreatestFirst() throws Exception {
        int youngestValue = 5;
        RedBlackTree redBlackTree = new RedBlackTree(youngestValue);

        Node eldestNode = redBlackTree.insert(20);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());

        Node middleNode = redBlackTree.insert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(true, middleNode.isBlack());
        assertEquals(5, middleNode.getYoungerChild().getValue(), 0);
        assertEquals(20, middleNode.getElderChild().getValue(), 0);

        Node youngestNode = redBlackTree.search(youngestValue);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());

        eldestNode = redBlackTree.search(20);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());
    }

    @Test
    public void testInsertMethodAddsNodesToRootNodeTwoLessThanLeastFirst() throws Exception {
        int eldestValue = 20;
        RedBlackTree redBlackTree = new RedBlackTree(eldestValue);

        Node youngestNode = redBlackTree.insert(5);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());

        Node middleNode = redBlackTree.insert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(true, middleNode.isBlack());
        assertEquals(5, middleNode.getYoungerChild().getValue(), 0);
        assertEquals(20, middleNode.getElderChild().getValue(), 0);

        Node eldestNode = redBlackTree.search(eldestValue);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());

        youngestNode = redBlackTree.search(5);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());
    }

    @Test
    public void testInsertMethodAddsNodesToRootNodeTwoLessThanGreatestFirst() throws Exception {
        int eldestValue = 20;
        RedBlackTree redBlackTree = new RedBlackTree(eldestValue);

        Node middleNode = redBlackTree.insert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(null, middleNode.getElderChild());

        Node youngestNode = redBlackTree.insert(5);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());

        Node eldestNode = redBlackTree.search(eldestValue);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());

        middleNode = redBlackTree.search(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(true, middleNode.isBlack());
        assertEquals(5, middleNode.getYoungerChild().getValue(), 0);
        assertEquals(20, middleNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodReturnsNullIfAddingRepeatedNodeValue() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        Node insertedNode = redBlackTree.insert(1);
        assertEquals(null, insertedNode);
    }

}