package utils;

import java.util.Collection;

public class Stack implements IStack {

    private Node top;

    public Stack() {
        top = null;
    }

    @Override
    public void insertElement(Integer element) {
        Node newNode = new Node(element);
        if (this.top != null) {
            newNode.setNext(this.top);
            this.top.setPrevious(newNode);
        }
        this.top = newNode;
    }

    @Override
    public boolean removeElement(Integer element) {
        Node aux = this.top;
        while (aux != null) {
            if (aux.getValue().equals(element)) {
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public void insertSequence(Collection<Integer> elements) {
        for (Integer element : elements) {
            insertElement(element);
        }
    }

    @Override
    public boolean removeSequence(Collection<Integer> elements) {
        boolean found = false;
        for (Integer element : elements) {
            removeElement(element);
            found = true;
        }
        return found;
    }

    @Override
    public void removeAllOccurrences(Integer element) {
        Node aux = this.top;
        while (aux != null) {
            if (aux.getValue().equals(element)) {
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
            }
            aux = aux.getNext();
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public boolean searchElement(Integer element) {
        Node aux = this.top;
        while (aux != null) {
            if (aux.getValue().equals(element)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public void sortAscending() {
        // BUBBLE SORT ALGORITHM
        if (this.top == null || this.top.getNext() == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node aux = this.top;
            while (aux != null && aux.getNext() != null) {
                if (aux.getValue() > aux.getNext().getValue()) {
                    Integer temporary = aux.getValue();
                    aux.setValue(aux.getNext().getValue());
                    aux.getNext().setValue(temporary);
                    swapped = true;
                }
                aux = aux.getNext();
            }
        } while (swapped);
    }

    @Override
    public void sortDescending() {
        // BUBBLE SORT ALGORITHM
        if (this.top == null || this.top.getNext() == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node aux = this.top;
            while (aux != null && aux.getNext() != null) {
                if (aux.getValue() < aux.getNext().getValue()) {
                    Integer temporary = aux.getValue();
                    aux.setValue(aux.getNext().getValue());
                    aux.getNext().setValue(temporary);
                    swapped = true;
                }
                aux = aux.getNext();
            }
        } while (swapped);
    }

    @Override
    public int elementCount() {
        int count = 0;
        Node aux = this.top;
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        return count;
    }

    @Override
    public void editElement(Integer oldElement, Integer newElement) {
        Node aux = this.top;
        while (aux != null) {
            if (aux.getValue().equals(oldElement)) {
                aux.setValue(newElement);
            }
            aux = aux.getNext();
        }
    }

    @Override
    public void clear() {
        this.top = null;
    }

    @Override
    public void display() {
        Node aux = this.top;
        System.out.print("Elements in Stack: [");
        while (aux != null) {
            System.out.print(aux.getValue());
            aux = aux.getNext();
            if (aux != null) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    @Override
    public Node getFirstElement() {
        return this.top;
    }

    @Override
    public Node getLastElement() {
        Node aux = this.top;
        while (aux != null) {
            aux = aux.getNext();
        }
        return aux;
    }
}
