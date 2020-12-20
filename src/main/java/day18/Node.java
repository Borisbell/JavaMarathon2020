package day18;

public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        if (leftNode == null && rightNode == null) {
            return "value: " + value + ", LN & RN : Empty";
        } else if (leftNode == null) {
            return "value: " + value + ", <- LN: Empty" + ", -> RN: " + rightNode.getValue();
        } else if (rightNode == null) {
            return "value: " + value + ", <- LN: " + leftNode.getValue()+ ", -> RN: Empty";
        } else {
            return "value: " + value + ", <- LN: " + leftNode.getValue() + ", -> RN: " + rightNode.getValue();
        }

    }
}
