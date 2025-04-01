import utils.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.insertElement(10);
        stack.insertElement(6);
        stack.insertElement(4);
        stack.insertElement(7);
        stack.insertElement(1);
        stack.display();
        stack.sortAscending();
        stack.display();
        stack.sortDescending();
        stack.display();
    }
}