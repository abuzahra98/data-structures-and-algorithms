package tree;

public class Node<t> {
    private t data;
    public t value;
    public Node<t> left;
    public Node<t> right;

    public Node(t value) {
        this.value = value;
    }

    public Node() {

    }

    public t getNodeValue() {
        return value;
    }

    public void setNodeValue(t value) {
        this.value = value;
    }

    public Node<t> getLeft() {
        return left;
    }

    public void setLeft(Node<t> left) {
        this.left = left;
    }

    public Node<t> getRight() {
        return right;
    }

    public void setRight(Node<t> right) {
        this.right = right;
    }
    public t getData() {
        return data;
    }

    public void setData(t data) {
        this.data = data;
    }
}