public class RedBlackTree {

    private Node[] nodes = new Node[1];

    RedBlackTree(int root) {
        Node rootNode = new Node(root);
        rootNode.setBlack(true);
        nodes[0] = rootNode;
    }

    public boolean insert(int value) {

        return false;
    }

    public Node search(int value) {
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].getValue() == value) {
                return nodes[i];
            }
        }

        return null;
    }

    public boolean delete(int value) {

        return false;
    }
}
