package utils;

public interface INode {
    Integer getValue();
    void setValue(Integer value);
    Node getNext();
    void setNext(Node next);
    Node getPrevious();
    void setPrevious(Node previous);
}