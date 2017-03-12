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

    @Test
    public void testAscVOneSortsArrayAscendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscVOneSortsArrayAscendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscVOneSortsArrayAscendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{-5, 0, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscVOneSortsArrayAscendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{0, 1, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscVOneSortsArrayAscendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{0, 1, 1, 2, 2}, ascArray);
    }

    @Test
    public void testAscVOneSortsArrayAscendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{0, 1, 1, 1, 4}, ascArray);
    }

    @Test
    public void testAscVOneSortsArrayAscendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVOne();
        assertArrayEquals(new int[]{1}, ascArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, descArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{5, 4, 3, 1, 0}, descArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{4, 2, 1, 0, -5}, descArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{4, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{2, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{4, 1, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescVOneSortsArrayDescendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVOne();
        assertArrayEquals(new int[]{1}, descArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{-5, 0, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{0, 1, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{0, 1, 1, 2, 2}, ascArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{0, 1, 1, 1, 4}, ascArray);
    }

    @Test
    public void testAscVTwoSortsArrayAscendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascVTwo();
        assertArrayEquals(new int[]{1}, ascArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, descArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{5, 4, 3, 1, 0}, descArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{4, 2, 1, 0, -5}, descArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{4, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{2, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{4, 1, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescVTwoSortsArrayDescendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descVTwo();
        assertArrayEquals(new int[]{1}, descArray);
    }

}