import utils.Stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        int option = 1;
        while (option != 17) {
            printMenu();
            option = Integer.parseInt(scanner.next());
            switch (option) {
                case 1:
                    System.out.println(">>> Insert element");
                    System.out.print("Enter number: ");
                    stack.insertElement(Integer.parseInt(scanner.next()));
                    break;
                case 2:
                    System.out.println(">>> Remove element");
                    System.out.print("Enter number: ");
                    stack.removeElement(Integer.parseInt(scanner.next()));
                    break;
                case 3:
                    System.out.println(">>> insertSequence");
                    System.out.println("Example: 1,2,3,4");
                    System.out.print("Enter numbers: ");
                    List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).toList();
                    stack.insertSequence(numbers1);
                    break;
                case 4:
                    System.out.println(">>> removeSequence");
                    System.out.println("Example: 1,2,3,4");
                    System.out.print("Enter numbers: ");
                    List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).toList();
                    stack.insertSequence(numbers2);
                    break;
                case 5:
                    System.out.println(">>> removeAllOccurrences");
                    System.out.print("Enter number: ");
                    stack.removeAllOccurrences(Integer.parseInt(scanner.next()));
                    break;
                case 6:
                    System.out.println(">>> isFull");
                    System.out.println(stack.isFull() ? "YES" : "NO");
                    break;
                case 7:
                    System.out.println(">>> isEmpty");
                    System.out.println(stack.isEmpty() ? "YES" : "NO");
                    break;
                case 8:
                    System.out.println(">>> searchElement");
                    System.out.print("Enter number: ");
                    System.out.println("Element found: " + (stack.searchElement(Integer.parseInt(scanner.next())) ? "YES" : "NO"));
                    break;
                case 9:
                    System.out.println(">>> sortAscending");
                    stack.sortAscending();
                    stack.display();
                    break;
                case 10:
                    System.out.println(">>> sortDescending");
                    stack.sortDescending();
                    stack.display();
                    break;
                case 11:
                    System.out.println(">>> elementCount");
                    System.out.println("Elements count: " + stack.elementCount());
                    break;
                case 12:
                    System.out.println(">>> editElement");
                    System.out.print("Enter old number: ");
                    int oldNumber = Integer.parseInt(scanner.next());
                    System.out.print("Enter new number: ");
                    int newNumber = Integer.parseInt(scanner.next());
                    stack.editElement(oldNumber, newNumber);
                    break;
                case 13:
                    System.out.println(">>> clear");
                    stack.clear();
                    System.out.println("Stack cleared");
                    break;
                case 14:
                    System.out.println(">>> display");
                    stack.display();
                    break;
                case 15:
                    System.out.println(">>> getFirstElement");
                    System.out.println("First element: " + stack.getFirstElement().getValue());
                    break;
                case 16:
                    System.out.println(">>> getLastElement");
                    System.out.println("Last element: " + stack.getLastElement().getValue());
                    break;
            }
            scanner.nextLine();
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Bye ;)");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println(">>> MENU");
        System.out.println("1. insertElement");
        System.out.println("2. removeElement");
        System.out.println("3. insertSequence");
        System.out.println("4. removeSequence");
        System.out.println("5. removeAllOccurrences");
        System.out.println("6. isFull");
        System.out.println("7. isEmpty");
        System.out.println("8. searchElement");
        System.out.println("9. sortAscending");
        System.out.println("10. sortDescending");
        System.out.println("11. elementCount");
        System.out.println("12. editElement");
        System.out.println("13. clear");
        System.out.println("14. display");
        System.out.println("15. getFirstElement");
        System.out.println("16. getLastElement");
        System.out.println("17. Finish the program");
        System.out.print(">>> Choose an option: ");
    }
}