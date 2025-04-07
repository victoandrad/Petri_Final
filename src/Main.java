import utils.Stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.insertElement(10);
        stack.insertElement(6);
        stack.insertElement(4);
        stack.insertElement(7);
        stack.insertElement(1);

        stack.removeElement(10);
        stack.insertSequence(Arrays.asList(10, 20, 30, 40, 50));
        stack.removeSequence(Arrays.asList(10, 20, 30, 40, 50));
        stack.display();
        stack.sortAscending();
        stack.display();
        stack.sortDescending();
        stack.display();
    }
}