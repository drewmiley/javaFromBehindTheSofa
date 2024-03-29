public class RedBlackTree {

    private Node rootNode;

    RedBlackTree(int root) {
        rootNode = new Node(root);
        rootNode.setBlack(true);
    }

    public Node insert(int value) {
        Node node = bstInsert(value);

        Node parentNode = findParentNode(node);
        Node uncleNode = findSiblingNode(parentNode);

        Node grandparentNode = findParentNode(parentNode);

        if (grandparentNode != null && !parentNode.isBlack()) {
            if (uncleNode == null || uncleNode.isBlack()) {
                if (grandparentNode.getYoungerChild() == parentNode &&
                        parentNode.getYoungerChild() == node) {
                    // Left Left Case
                    grandparentNode.setBlack(!grandparentNode.isBlack());
                    grandparentNode.setYoungerChild(parentNode.getElderChild());
                    parentNode.setBlack(!parentNode.isBlack());
                    parentNode.setElderChild(grandparentNode);
                    if (grandparentNode.getValue() == rootNode.getValue()) {
                        rootNode = parentNode;
                    }

                } else if (grandparentNode.getYoungerChild() == parentNode &&
                        parentNode.getElderChild() == node) {
                    // Left Right Case
                    grandparentNode.setBlack(!grandparentNode.isBlack());
                    grandparentNode.setYoungerChild(null);
                    parentNode.setElderChild(null);
                    node.setBlack(!node.isBlack());
                    node.setYoungerChild(parentNode);
                    node.setElderChild(grandparentNode);
                    if (grandparentNode.getValue() == rootNode.getValue()) {
                        rootNode = node;
                    }
                } else if (grandparentNode.getElderChild() == parentNode &&
                        parentNode.getYoungerChild() == node) {
                    // Right Left Case
                    grandparentNode.setBlack(!grandparentNode.isBlack());
                    grandparentNode.setElderChild(null);
                    parentNode.setYoungerChild(null);
                    node.setBlack(!node.isBlack());
                    node.setYoungerChild(grandparentNode);
                    node.setElderChild(parentNode);
                    if (grandparentNode.getValue() == rootNode.getValue()) {
                        rootNode = node;
                    }
                } else if (grandparentNode.getElderChild() == parentNode &&
                        parentNode.getElderChild() == node) {
                    // Right Right Case
                    grandparentNode.setBlack(!grandparentNode.isBlack());
                    grandparentNode.setElderChild(parentNode.getYoungerChild());
                    parentNode.setBlack(!parentNode.isBlack());
                    parentNode.setYoungerChild(grandparentNode);
                    if (grandparentNode.getValue() == rootNode.getValue()) {
                        rootNode = parentNode;
                    }
                } else {
                    node = null;
                }

            } else {
                parentNode.setBlack(true);
                uncleNode.setBlack(true);
                if (grandparentNode.getValue() != rootNode.getValue()) {
                    grandparentNode.setBlack(false);
                }
            }
        }
        return node;
    }

    public Node bstInsert(int value) {
        Node node = new Node(value);
        node.setBlack(false);

        Node comparedNode = rootNode;
        Node parentNode = null;

        while (comparedNode != null) {
            if (comparedNode.getValue() < node.getValue()) {
                parentNode = comparedNode;
                comparedNode = parentNode.getElderChild();
            } else if (comparedNode.getValue() > node.getValue()) {
                parentNode = comparedNode;
                comparedNode = parentNode.getYoungerChild();
            } else {
                return null;
            }
        }

        if (parentNode.getValue() < node.getValue()) {
            parentNode.setElderChild(node);
        } else if (parentNode.getValue() > node.getValue()) {
            parentNode.setYoungerChild(node);
        } else {
            return null;
        }

        return node;
    }

    public Node findSiblingNode(Node node) {
        if (node == null) {
            return null;
        }
        boolean searchComplete = false;
        Node comparedNode = rootNode;
        Node siblingNode = null;
        while (!searchComplete) {
            if (comparedNode.getValue() < node.getValue()) {
                siblingNode = comparedNode.getYoungerChild();
                comparedNode = comparedNode.getElderChild();
            } else if (comparedNode.getValue() > node.getValue()) {
                siblingNode = comparedNode.getElderChild();
                comparedNode = comparedNode.getYoungerChild();
            } else {
                searchComplete = true;
            }
            if (comparedNode == null) {
                searchComplete = true;
            }
        }
        return siblingNode;
    }

    public Node findParentNode(Node node) {
        if (node == null) {
            return null;
        }
        boolean searchComplete = false;
        Node comparedNode = rootNode;
        Node parentNode = null;
        while (!searchComplete) {
            if (comparedNode.getValue() < node.getValue()) {
                parentNode = comparedNode;
                comparedNode = comparedNode.getElderChild();
            } else if (comparedNode.getValue() > node.getValue()) {
                parentNode = comparedNode;
                comparedNode = comparedNode.getYoungerChild();
            } else {
                searchComplete = true;
            }
            if (comparedNode == null) {
                searchComplete = true;
            }
        }
        return parentNode;
    }

    public Node search(int value) {
        boolean searchComplete = false;
        Node comparedNode = rootNode;
        Node node = null;
        while (!searchComplete) {
            if (comparedNode.getValue() < value) {
                comparedNode = comparedNode.getElderChild();
            } else if (comparedNode.getValue() > value) {
                comparedNode = comparedNode.getYoungerChild();
            } else {
                node = comparedNode;
                searchComplete = true;
            }
            if (comparedNode == null) {
                searchComplete = true;
            }
        }
        return node;
    }

    public Node delete(int value) {
        return bstDelete(value);
    }

    public Node bstDelete(int value) {
        Node deletedNode = search(value);
        if (deletedNode == null) {
            return null;
        }

        Node parentNode = findParentNode(deletedNode);
        boolean deletedNodeIsElderChild = false;
        if (parentNode.getElderChild() != null && parentNode.getElderChild().getValue() == deletedNode.getValue()) {
            deletedNodeIsElderChild = true;
        }
        Node youngerChild = deletedNode.getYoungerChild();
        Node elderChild = deletedNode.getElderChild();

        if (youngerChild != null && elderChild != null) {
            if (Math.abs(youngerChild.getValue() - rootNode.getValue()) <
                    Math.abs(elderChild.getValue() - rootNode.getValue())) {
                youngerChild.setElderChild(elderChild);
                parentNode.setElderChild(youngerChild);
            } else {
                elderChild.setYoungerChild(youngerChild);
                parentNode.setYoungerChild(elderChild);
            }
            deletedNode.setYoungerChild(null);
            deletedNode.setElderChild(null);
        } else if (youngerChild == null && elderChild != null) {
            if (deletedNodeIsElderChild) {
                parentNode.setElderChild(youngerChild);
            } else {
                parentNode.setYoungerChild(elderChild);
            }
            deletedNode.setElderChild(null);
        } else if (youngerChild != null && elderChild == null) {
            if (deletedNodeIsElderChild) {
                parentNode.setElderChild(youngerChild);
            } else {
                parentNode.setYoungerChild(elderChild);
            }
            deletedNode.setYoungerChild(null);
        } else {
            if (deletedNodeIsElderChild) {
                parentNode.setElderChild(null);
            } else {
                parentNode.setYoungerChild(null);
            }
        }
        return deletedNode;
    }
}
