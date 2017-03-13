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
    public void testHasAscSwapSortMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.ascSwapSort();
    }

    @Test
    public void testHasDescSwapSortMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.descSwapSort();
    }

    @Test
    public void testHasAscSandwichSortMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.ascSandwichSort();
    }

    @Test
    public void testHasDescSandwichSortMethod() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        arraySort.descSandwichSort();
    }

    @Test
    public void testAscSwapSortMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
    }

    @Test
    public void testDescSwapSortMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
    }

    @Test
    public void testAscSandwichSortMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
    }

    @Test
    public void testDescSandwichSortMethodReturnsIntArray() {
        int[] array = new int[3];
        ArraySort arraySort = new ArraySort(array);
        int[] descArrary= arraySort.descSandwichSort();
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{-5, 0, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{0, 1, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{0, 1, 1, 2, 2}, ascArray);
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{0, 1, 1, 1, 4}, ascArray);
    }

    @Test
    public void testAscSwapSortSortsArrayAscendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSwapSort();
        assertArrayEquals(new int[]{1}, ascArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, descArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{5, 4, 3, 1, 0}, descArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{4, 2, 1, 0, -5}, descArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{4, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{2, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{4, 1, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescSwapSortSortsArrayDescendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSwapSort();
        assertArrayEquals(new int[]{1}, descArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, ascArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{-5, 0, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{0, 1, 1, 2, 4}, ascArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{0, 1, 1, 2, 2}, ascArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{0, 1, 1, 1, 4}, ascArray);
    }

    @Test
    public void testAscSandwichSortSortsArrayAscendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] ascArray = arraySort.ascSandwichSort();
        assertArrayEquals(new int[]{1}, ascArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingAllPositiveInt() throws Exception {
        int[] array = {2, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, descArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingPositiveIntAndZero() throws Exception {
        int[] array = {0, 5, 3, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{5, 4, 3, 1, 0}, descArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingPositiveIntZeroAndNegative() throws Exception {
        int[] array = {2, -5, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{4, 2, 1, 0, -5}, descArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{4, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingDuplicateRepeatedInts() throws Exception {
        int[] array = {2, 1, 0, 1, 2};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{2, 2, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingDuplicateTripleInts() throws Exception {
        int[] array = {1, 1, 0, 1, 4};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{4, 1, 1, 1, 0}, descArray);
    }

    @Test
    public void testDescSandwichSortSortsArrayDescendingArrayLengthOne() throws Exception {
        int[] array = {1};
        ArraySort arraySort = new ArraySort(array);
        int[] descArray = arraySort.descSandwichSort();
        assertArrayEquals(new int[]{1}, descArray);
    }

}