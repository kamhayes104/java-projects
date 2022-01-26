import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

        int userChoice;
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            int element;
            int position;
            DisplayMenu();
            System.out.print("Enter menu selection: ");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 0:
                    myList.print();
                    break;
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = scanner.nextInt();
                    myList.insertFirst(element);
                    break;
                case 2:
                    System.out.print("Enter element to insert: ");
                    element = scanner.nextInt();
                    myList.insertLast(element);
                    break;
                case 3:
                    System.out.print("Enter element to insert: ");
                    element = scanner.nextInt();
                    System.out.print("Enter position to insert into: ");
                    position = scanner.nextInt();
                    myList.insertAt(element, position);
                    break;
                case 4:
                    myList.removeFirst();
                    break;
                case 5:
                    myList.removeLast();
                    break;
                case 6:
                    System.out.print("Enter position to remove from: ");
                    position = scanner.nextInt();
                    myList.removeAt(position);
                    break;
                case 7:
                    System.out.print("Enter element to remove: ");
                    element = scanner.nextInt();
                    myList.removeElement(element);
                    break;
                case 8:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid entry; try one of the shown menu choices");
                    break;
            }
        }
    }


    static void DisplayMenu() {
        System.out.println("0 -> Print list");
        System.out.println("1 -> Insert first");
        System.out.println("2 -> Insert last");
        System.out.println("3 -> Insert at position");
        System.out.println("4 -> Remove first");
        System.out.println("5 -> Remove last");
        System.out.println("6 -> Remove at position");
        System.out.println("7 -> Remove element");
        System.out.println("8 -> Quit");
        System.out.println();
    }
}
