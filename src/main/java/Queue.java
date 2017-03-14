public class Queue {

    private int[] queueArray;

    public Queue() {
        queueArray = new int[]{0};
    }

    public void insert(int element) {
        if (queueArray[queueArray.length - 1] != 0) {
            int[] queueArrayMem = queueArray;
            queueArray = new int[queueArrayMem.length * 2];
            for (int i = 0; i < queueArrayMem.length; i++) {
                queueArray[i] = queueArrayMem[i];
            }
            queueArray[queueArrayMem.length] = element;
        } else if (queueArray.length == 1) {
            queueArray[0]= element;
        } else {
            for (int i = queueArray.length - 1; i >= 0; i--) {
                if (queueArray[i] != 0) {
                    queueArray[i + 1] = element;
                }
            }
        }
    }

    public int remove() {
        int value = queueArray[0];
        for (int i = 1; i < queueArray.length; i++) {
            queueArray[i - 1] = queueArray[i];
        }
        queueArray[queueArray.length - 1] = 0;
        if (queueArray.length > 1 && queueArray[queueArray.length / 2] == 0) {
            int[] queueArrayMem = queueArray;
            queueArray = new int[queueArrayMem.length / 2];
            for (int i = 0; i < queueArrayMem.length / 2; i++) {
                queueArray[i] = queueArrayMem[i];
            }
        }
        return value;
    }

    public int examine() {
        int value = 0;
        if (queueArray.length > 0) {
            value = queueArray[0];
        }
        return value;
    }
}
