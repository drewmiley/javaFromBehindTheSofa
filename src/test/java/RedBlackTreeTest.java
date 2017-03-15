import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
    public void testBSTInsertMethodAddsNodeToRootNodeGreaterThan() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node insertedNode = redBlackTree.bstInsert(20);
        assertEquals(20, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(null, rootNode.getYoungerChild());
        assertEquals(20, rootNode.getElderChild().getValue());
    }

    @Test
    public void testBSTInsertMethodAddsNodeToRootNodeLessThan() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node insertedNode = redBlackTree.bstInsert(5);
        assertEquals(5, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue());
        assertEquals(null, rootNode.getElderChild());
    }

    @Test
    public void testBSTInsertMethodAddsNodesToRootNodeOneGreaterThanOneLessThanLessFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node youngerNode = redBlackTree.bstInsert(5);
        assertEquals(5, youngerNode.getValue(), 0);
        assertEquals(false, youngerNode.isBlack());
        assertEquals(null, youngerNode.getYoungerChild());
        assertEquals(null, youngerNode.getElderChild());

        Node elderNode = redBlackTree.bstInsert(20);
        assertEquals(20, elderNode.getValue(), 0);
        assertEquals(false, elderNode.isBlack());
        assertEquals(null, elderNode.getYoungerChild());
        assertEquals(null, elderNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue());
    }

    @Test
    public void testBSTInsertMethodAddsNodesToRootNodeOneGreaterThanOneLessThanGreaterFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node elderNode = redBlackTree.bstInsert(20);
        assertEquals(20, elderNode.getValue(), 0);
        assertEquals(false, elderNode.isBlack());
        assertEquals(null, elderNode.getYoungerChild());
        assertEquals(null, elderNode.getElderChild());

        Node youngerNode = redBlackTree.bstInsert(5);
        assertEquals(5, youngerNode.getValue(), 0);
        assertEquals(false, youngerNode.isBlack());
        assertEquals(null, youngerNode.getYoungerChild());
        assertEquals(null, youngerNode.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue());
    }

    @Test
    public void testBSTInsertMethodAddsNodesToRootNodeTwoGreaterThanLeastFirst() throws Exception {
        int youngestValue = 5;
        RedBlackTree redBlackTree = new RedBlackTree(youngestValue);

        Node middleNode = redBlackTree.bstInsert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(false, middleNode.isBlack());
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(null, middleNode.getElderChild());

        Node eldestNode = redBlackTree.bstInsert(20);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(false, eldestNode.isBlack());
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());

        Node youngestNode = redBlackTree.search(youngestValue);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(true, youngestNode.isBlack());
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(10, youngestNode.getElderChild().getValue(), 0);

        middleNode = redBlackTree.search(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(false, middleNode.isBlack());
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(20, middleNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testBSTInsertMethodAddsNodesToRootNodeTwoGreaterThanGreatestFirst() throws Exception {
        int youngestValue = 5;
        RedBlackTree redBlackTree = new RedBlackTree(youngestValue);

        Node eldestNode = redBlackTree.bstInsert(20);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(false, eldestNode.isBlack());
        assertEquals(null, eldestNode.getYoungerChild());
        assertEquals(null, eldestNode.getElderChild());

        Node middleNode = redBlackTree.bstInsert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(false, middleNode.isBlack());
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(null, middleNode.getElderChild());

        Node youngestNode = redBlackTree.search(youngestValue);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(true, youngestNode.isBlack());
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(20, youngestNode.getElderChild().getValue(), 0);

        eldestNode = redBlackTree.search(20);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(false, eldestNode.isBlack());
        assertEquals(10, eldestNode.getYoungerChild().getValue(), 0);
        assertEquals(null, eldestNode.getElderChild());
    }

    @Test
    public void testBSTInsertMethodAddsNodesToRootNodeTwoLessThanLeastFirst() throws Exception {
        int eldestValue = 20;
        RedBlackTree redBlackTree = new RedBlackTree(eldestValue);

        Node youngestNode = redBlackTree.bstInsert(5);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(false, youngestNode.isBlack());
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());

        Node middleNode = redBlackTree.bstInsert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(false, middleNode.isBlack());
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(null, middleNode.getElderChild());

        Node eldestNode = redBlackTree.search(eldestValue);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(true, eldestNode.isBlack());
        assertEquals(5, eldestNode.getYoungerChild().getValue(), 0);
        assertEquals(null, eldestNode.getElderChild());

        youngestNode = redBlackTree.search(5);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(false, youngestNode.isBlack());
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(10, youngestNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testBSTInsertMethodAddsNodesToRootNodeTwoLessThanGreatestFirst() throws Exception {
        int eldestValue = 20;
        RedBlackTree redBlackTree = new RedBlackTree(eldestValue);

        Node middleNode = redBlackTree.bstInsert(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(false, middleNode.isBlack());
        assertEquals(null, middleNode.getYoungerChild());
        assertEquals(null, middleNode.getElderChild());

        Node youngestNode = redBlackTree.bstInsert(5);
        assertEquals(5, youngestNode.getValue(), 0);
        assertEquals(false, youngestNode.isBlack());
        assertEquals(null, youngestNode.getYoungerChild());
        assertEquals(null, youngestNode.getElderChild());

        Node eldestNode = redBlackTree.search(eldestValue);
        assertEquals(20, eldestNode.getValue(), 0);
        assertEquals(true, eldestNode.isBlack());
        assertEquals(10, eldestNode.getYoungerChild().getValue(), 0);
        assertEquals(null, eldestNode.getElderChild());

        middleNode = redBlackTree.search(10);
        assertEquals(10, middleNode.getValue(), 0);
        assertEquals(false, middleNode.isBlack());
        assertEquals(5, middleNode.getYoungerChild().getValue(), 0);
        assertEquals(null, middleNode.getElderChild());
    }

    @Test
    public void testBSTInsertMethodReturnsNullIfAddingRepeatedNodeValue() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(1);
        Node insertedNode = redBlackTree.bstInsert(1);
        assertEquals(null, insertedNode);
    }

    @Test
    public void testFindParentNodeReturnsCorrectParent() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(10);
        Node insertedNode = redBlackTree.bstInsert(20);
        Node parentNode = redBlackTree.findParentNode(insertedNode);
        assertEquals(10, parentNode.getValue());
    }

    @Test
    public void testFindParentNodeTwiceReturnsCorrectGrandparent() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(5);
        redBlackTree.bstInsert(10);
        Node insertedNode = redBlackTree.bstInsert(20);
        Node parentNode = redBlackTree.findParentNode(insertedNode);
        assertEquals(10, parentNode.getValue());
        Node grandparentNode = redBlackTree.findParentNode(parentNode);
        assertEquals(5, grandparentNode.getValue());
    }

    @Test
    public void testFindParentNodeReturnsNullIfRootNode() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(null, redBlackTree.findParentNode(rootNode));
    }

    @Test
    public void testFindParentNodeReturnsNullIfNodeNull() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(10);

        Node nullNode = redBlackTree.search(20);
        assertEquals(null, redBlackTree.findParentNode(nullNode));
    }

    @Test
    public void testFindSiblingNodeReturnsCorrectSibling() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(10);
        Node youngerChild = redBlackTree.bstInsert(5);
        Node elderChild = redBlackTree.bstInsert(20);

        assertEquals(20, redBlackTree.findSiblingNode(youngerChild).getValue());
        assertEquals(5, redBlackTree.findSiblingNode(elderChild).getValue());
    }

    @Test
    public void testFindSiblingNodeTwiceReturnsOriginalNode() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(10);
        Node youngerChild = redBlackTree.bstInsert(5);
        Node elderChild = redBlackTree.bstInsert(20);

        assertEquals(5, redBlackTree.findSiblingNode(redBlackTree.findSiblingNode(youngerChild)).getValue());
        assertEquals(20, redBlackTree.findSiblingNode(redBlackTree.findSiblingNode(elderChild)).getValue());
    }

    @Test
    public void testFindSiblingNodeReturnsNullIfOnlyChild() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(10);
        Node insertedNode = redBlackTree.bstInsert(5);

        assertEquals(null, redBlackTree.findSiblingNode(insertedNode));
    }

    @Test
    public void testFindSiblingNodeReturnsNullIfNodeNull() throws Exception {
        RedBlackTree redBlackTree = new RedBlackTree(10);
        Node nullNode = redBlackTree.search(20);

        assertEquals(null, redBlackTree.findSiblingNode(nullNode));
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
        assertEquals(10, rootNode.getValue(), 0);
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
        assertEquals(5, rootNode.getYoungerChild().getValue());
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
        assertEquals(5, rootNode.getYoungerChild().getValue());
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

    @Test
    public void testInsertMethodAddsYoungerYoungerGrandchildYoungerParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        Node insertedNode = redBlackTree.insert(1);
        assertEquals(1, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(1, youngerParent.getYoungerChild().getValue(), 0);
        assertEquals(null, youngerParent.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(null, elderParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsYoungerYoungerGrandchildElderParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        Node insertedNode = redBlackTree.insert(1);
        assertEquals(1, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(null, elderParent.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(1, youngerParent.getYoungerChild().getValue(), 0);
        assertEquals(null, youngerParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsYoungerElderGrandchildYoungerParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        Node insertedNode = redBlackTree.insert(8);
        assertEquals(8, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(8, youngerParent.getElderChild().getValue(), 0);

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(null, elderParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsYoungerElderGrandchildElderParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        Node insertedNode = redBlackTree.insert(8);
        assertEquals(8, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(null, elderParent.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(8, youngerParent.getElderChild().getValue(), 0);

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsElderYoungerGrandchildYoungerParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        Node insertedNode = redBlackTree.insert(15);
        assertEquals(15, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(null, youngerParent.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(15, elderParent.getYoungerChild().getValue(), 0);
        assertEquals(null, elderParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsElderYoungerGrandchildElderParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        Node insertedNode = redBlackTree.insert(15);
        assertEquals(15, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(15, elderParent.getYoungerChild().getValue(), 0);
        assertEquals(null, elderParent.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(null, youngerParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsElderElderGrandchildYoungerParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        Node insertedNode = redBlackTree.insert(30);
        assertEquals(30, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(null, youngerParent.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(30, elderParent.getElderChild().getValue(), 0);

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsElderElderGrandchildElderParentFirst() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        Node insertedNode = redBlackTree.insert(30);
        assertEquals(30, insertedNode.getValue(), 0);
        assertEquals(false, insertedNode.isBlack());
        assertEquals(null, insertedNode.getYoungerChild());
        assertEquals(null, insertedNode.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(30, elderParent.getElderChild().getValue(), 0);

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(null, youngerParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsYYAndYEGrandchildren() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int yyValue = 1;
        redBlackTree.insert(yyValue);

        Node yeNode = redBlackTree.insert(8);
        assertEquals(8, yeNode.getValue(), 0);
        assertEquals(false, yeNode.isBlack());
        assertEquals(null, yeNode.getYoungerChild());
        assertEquals(null, yeNode.getElderChild());

        Node yyNode = redBlackTree.search(yyValue);
        assertEquals(1, yyNode.getValue(), 0);
        assertEquals(false, yyNode.isBlack());
        assertEquals(null, yyNode.getYoungerChild());
        assertEquals(null, yyNode.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(1, youngerParent.getYoungerChild().getValue(), 0);
        assertEquals(8, youngerParent.getElderChild().getValue(), 0);

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(null, elderParent.getElderChild());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsYEAndEEGrandchildren() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int yeValue = 8;
        redBlackTree.insert(yeValue);

        Node eeNode = redBlackTree.insert(30);
        assertEquals(30, eeNode.getValue(), 0);
        assertEquals(false, eeNode.isBlack());
        assertEquals(null, eeNode.getYoungerChild());
        assertEquals(null, eeNode.getElderChild());

        Node yeNode = redBlackTree.search(yeValue);
        assertEquals(8, yeNode.getValue(), 0);
        assertEquals(false, yeNode.isBlack());
        assertEquals(null, yeNode.getYoungerChild());
        assertEquals(null, yeNode.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(null, elderParent.getYoungerChild());
        assertEquals(30 , elderParent.getElderChild().getValue());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(8, youngerParent.getElderChild().getValue());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsEYAndYEGrandchildren() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int eyValue = 15;
        redBlackTree.insert(eyValue);

        Node yeNode = redBlackTree.insert(8);
        assertEquals(8, yeNode.getValue(), 0);
        assertEquals(false, yeNode.isBlack());
        assertEquals(null, yeNode.getYoungerChild());
        assertEquals(null, yeNode.getElderChild());

        Node eyNode = redBlackTree.search(eyValue);
        assertEquals(15, eyNode.getValue(), 0);
        assertEquals(false, eyNode.isBlack());
        assertEquals(null, eyNode.getYoungerChild());
        assertEquals(null, eyNode.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(15, elderParent.getYoungerChild().getValue(), 0);
        assertEquals(null, elderParent.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(8, youngerParent.getElderChild().getValue());

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue());
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

    @Test
    public void testInsertMethodAddsEEAndEYGrandchildren() throws Exception {
        int rootValue = 10;
        RedBlackTree redBlackTree = new RedBlackTree(rootValue);

        int elderParentValue = 20;
        redBlackTree.insert(elderParentValue);

        int youngerParentValue = 5;
        redBlackTree.insert(youngerParentValue);

        int eeValue = 30;
        redBlackTree.insert(eeValue);

        Node eyNode = redBlackTree.insert(15);
        assertEquals(15, eyNode.getValue(), 0);
        assertEquals(false, eyNode.isBlack());
        assertEquals(null, eyNode.getYoungerChild());
        assertEquals(null, eyNode.getElderChild());

        Node eeNode = redBlackTree.search(eeValue);
        assertEquals(30, eeNode.getValue(), 0);
        assertEquals(false, eeNode.isBlack());
        assertEquals(null, eeNode.getYoungerChild());
        assertEquals(null, eeNode.getElderChild());

        Node youngerParent = redBlackTree.search(youngerParentValue);
        assertEquals(5, youngerParent.getValue(), 0);
        assertEquals(true, youngerParent.isBlack());
        assertEquals(null, youngerParent.getYoungerChild());
        assertEquals(null, youngerParent.getElderChild());

        Node elderParent = redBlackTree.search(elderParentValue);
        assertEquals(20, elderParent.getValue(), 0);
        assertEquals(true, elderParent.isBlack());
        assertEquals(15, elderParent.getYoungerChild().getValue(), 0);
        assertEquals(30, elderParent.getElderChild().getValue(), 0);

        Node rootNode = redBlackTree.search(rootValue);
        assertEquals(10, rootNode.getValue(), 0);
        assertEquals(true, rootNode.isBlack());
        assertEquals(5, rootNode.getYoungerChild().getValue(), 0);
        assertEquals(20, rootNode.getElderChild().getValue(), 0);
    }

}