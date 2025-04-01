package utils;

public class Node implements INode {

    private Integer value;
    private Node next;
    private Node previous;

    public Node(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Node getNext() {
        return this.next;
    }

    @Override
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public Node getPrevious() {
        return this.previous;
    }

    @Override
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
