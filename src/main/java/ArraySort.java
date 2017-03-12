public class ArraySort {

    private int[] array;

    public ArraySort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] ascVOne() {
        return sortOne(array, true);
    }

    public int[] descVOne() {
        return sortOne(array, false);
    }

    private int[] sortOne(int[] array, boolean ascending) {
        return array;
    }

    public int[] ascVTwo() {
        return sortTwo(array, true);
    }

    public int[] descVTwo() {
        return sortTwo(array, false);
    }

    private int[] sortTwo(int[] array, boolean ascending) {
        return array;
    }
}
