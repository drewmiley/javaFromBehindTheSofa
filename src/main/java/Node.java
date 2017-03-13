public class Node {

    private int value;
    private boolean black;
    private Node elderChild;
    private Node youngerChild;

    public Node(int value) {
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public Node getElderChild() {
        return elderChild;
    }

    public void setElderChild(Node elderChild) {
        this.elderChild = elderChild;
    }

    public Node getYoungerChild() {
        return youngerChild;
    }

    public void setYoungerChild(Node youngerChild) {
        this.youngerChild = youngerChild;
    }
}
