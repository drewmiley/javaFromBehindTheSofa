public class Queue {

    private int[] queueArray = new int[1];

    public void insert(int element) {
        if (queueArray[queueArray.length - 1] != 0) {
            int[] queueArrayMem = queueArray;
            queueArray = new int[queueArrayMem.length * 2];
            for (int i = 0; i < queueArrayMem.length; i++) {
                queueArray[i] = queueArrayMem[i];
            }
            queueArray[queueArrayMem.length] = element;
            return;
        } else if (queueArray.length == 1 && queueArray[0] == 0) {
            queueArray[0] = element;
            return;
        } else {
            for (int i = queueArray.length - 1; i >= 0; i--) {
                if (queueArray[i] != 0) {
                    queueArray[i + 1] = element;
                    return;
                }
            }
        }
    }

    public int remove() {
        for (int i = queueArray.length - 1; i >= 0; i--) {
            if (queueArray[i] != 0) {
                int value = queueArray[i];
                queueArray[i] = 0;
                return value;
            }
        }
        return 0;
    }

    public int examine() {
        for (int i = queueArray.length - 1; i >= 0; i--) {
            if (queueArray[i] != 0) {
                return queueArray[i];
            }
        }
        return 0;
    }
}
