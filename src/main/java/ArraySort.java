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

    public int[] ascSwapSort() {
        return swapSort(array, true);
    }

    public int[] descSwapSort() {
        return swapSort(array, false);
    }

    private int[] swapSort(int[] array, boolean ascending) {
        int[] memArray = array;
        for (int i = 0; i < array.length - 1; i++) {
            if (ascending) {
                if (memArray[i] > memArray[i + 1]) {
                    int mem = memArray[i];
                    memArray[i] = memArray[i + 1];
                    memArray[i + 1] = mem;
                    i = -1;
                }
            } else {
                if (memArray[i] < memArray[i + 1]) {
                    int mem = memArray[i];
                    memArray[i] = memArray[i + 1];
                    memArray[i + 1] = mem;
                    i = -1;
                }
            }
        }
        return memArray;
    }

    public int[] ascSandwichSort() {
        return sandwichSort(array, true);
    }

    public int[] descSandwichSort() {
        return sandwichSort(array, false);
    }

    private int[] sandwichSort(int[] array, boolean ascending) {
        int[] sortedArray = new int[1];
        sortedArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            if (ascending) {
                while (j < sortedArray.length && array[i] > sortedArray[j]) {
                    j++;
                }
            } else {
                while (j < sortedArray.length && array[i] < sortedArray[j]) {
                    j++;
                }
            }
            int[] memArray = sortedArray;
            sortedArray = new int[memArray.length + 1];
            for (int k = 0; k < sortedArray.length; k++) {
                if (k < j) {
                    sortedArray[k] = memArray[k];
                } else if (k > j) {
                    sortedArray[k] = memArray[k - 1];
                } else {
                    sortedArray[k] = array[i];
                }
            }
        }
        return sortedArray;
    }
}
