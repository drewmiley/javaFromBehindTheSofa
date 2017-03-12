import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHasIntArrayConstructor() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
    }

    @Test
    public void testHasAscVOneMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.ascVOne();
    }

    @Test
    public void testHasDescVOneMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.descVOne();
    }

    @Test
    public void testHasAscVTwoMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.ascVTwo();
    }

    @Test
    public void testHasDescVTwoMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.descVTwo();
    }

    @Test
    public void testAscVOneMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
    }

    @Test
    public void testDescVOneMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
    }

    @Test
    public void testAscVTwoMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
    }

    @Test
    public void testDescVTwoMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] descArrary= arraySort.descVTwo();
    }

}