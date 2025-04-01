package utils;

import java.util.Collection;

public interface IStack {
    void insertElement(Integer element);
    boolean removeElement(Integer element);
    void insertSequence(Collection<Integer> elements);
    boolean removeSequence(Collection<Integer> elements);
    void removeAllOccurrences(Integer element);
    boolean isFull();
    boolean isEmpty();
    boolean searchElement(Integer element);
    void sortAscending();
    void sortDescending();
    int elementCount();
    void editElement(Integer oldElement, Integer newElement);
    void clear();
    void display();
    Node getFirstElement();
    Node getLastElement();
}